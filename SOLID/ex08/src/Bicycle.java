public class Bicycle implements Vehicle, Pedal, Engine {
    public void move(){}
    public void pedal(int effort){
        System.out.println("Pedal effort " + effort); 
    }
    public void startEngine(){}
}


    // public void startEngine(){ throw new UnsupportedOperationException(); }
    // public void pedal(int effort){ System.out.println("Pedal effort " + effort); }
    // public void recharge(int kWh){ throw new UnsupportedOperationException(); }