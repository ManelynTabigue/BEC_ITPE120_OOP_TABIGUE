public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Navara", "Camry", "red");

        myCar.startEngine(); 
        myCar.honkHorn();    
        myCar.stopEngine();  

        
        System.out.println("My car is a " + myCar.make + " " + myCar.model + " in " + myCar.color + ".");
    }
}
