package exercise;

public class EmployeeCSVAdapter implements Employee {
    private final EmployeeCSV instance;
    private final String[] tokens;

    public EmployeeCSVAdapter(EmployeeCSV instance) {
        this.instance = instance;
        this.tokens = instance.tokens(); 
    }

    @Override
    public String getId() {
        return tokens[0];
    }

    @Override
    public String getFirstName() {
        return tokens[1];
    }

    @Override
    public String getLastName() {
        return tokens[2];
    }

    @Override
    public String getEmail() {
        return tokens[3];
    }
}
