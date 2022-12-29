public class Vehicle {
    protected String Brand = "Ford";
    public void honk(){
        System.out.println("POOO POO");
    }
}
class Car extends Vehicle{
    private String ModelName= "Mustang";

    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.honk();
        System.out.println(mycar.Brand+ "  "+  mycar.ModelName);
    }
}