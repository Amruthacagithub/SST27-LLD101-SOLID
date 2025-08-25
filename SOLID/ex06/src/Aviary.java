public class Aviary extends Bird implements Flying {
    @Override
    public void fly(){
        System.out.println("Flap!"); 
    }

    public void release(){
        System.out.println("Released"); 
    }
}