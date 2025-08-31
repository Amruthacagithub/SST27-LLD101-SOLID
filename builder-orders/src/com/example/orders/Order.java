package com.example.orders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines;
    private final Integer discountPercent;
    private final boolean expedited;
    private final String notes;

    private Order(Builder builder) {
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
                List<OrderLine> tmp = new ArrayList<>();
        for (OrderLine l : builder.lines) {
            tmp.add(new OrderLine(l.getSku(), l.getQuantity(), l.getUnitPriceCents()));
        }
        this.lines = Collections.unmodifiableList(tmp);
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return lines; }
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }
        public static class Builder {
        private final String id;
        private final String customerEmail;
        private final List<OrderLine> lines = new ArrayList<>();

        private Integer discountPercent;
        private boolean expedited;
        private String notes;

        public Builder(String id, String customerEmail, List<OrderLine> initialLines) {
            Objects.requireNonNull(id, "id");
            Objects.requireNonNull(customerEmail, "email");
            if (!PricingRules.isValidEmail(customerEmail)) {
                throw new IllegalArgumentException("Invalid email: " + customerEmail);
            }
            if (initialLines == null || initialLines.isEmpty()) {
                throw new IllegalArgumentException("Order must have at least one line");
            }
            this.id = id;
            this.customerEmail = customerEmail;
            this.lines.addAll(initialLines);
        }

        public Builder discountPercent(Integer discount) {
            if (!PricingRules.isValidDiscount(discount)) {
                throw new IllegalArgumentException("Discount must be 0..100");
            }
            this.discountPercent = discount;
            return this;
        }

        public Builder expedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
