public class person {

    private String name;
    public static void main(String[] args) {

        person psn = new person();

        psn.name = "tumiso";
        toyota t = new toyota();
        church c = new church();
        t.stop();
        t.drive();
        System.out.println(psn.name);;
        
    }
    
}

interface car
{
    public void drive();
}

class sedan implements car
{

    @Override
    public void drive() {
        System.out.println("Car driving");
        
    }


}

class toyota extends sedan
{
    public void stop()
    {
        System.out.println("Car stopped");
    }
}

abstract class buidling
{
    public void open()
    {
        System.out.println("Buiding opened");
    }
}

class church extends buidling
{
    

}



