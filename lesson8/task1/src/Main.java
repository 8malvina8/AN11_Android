class StartException extends Exception {

    public StartException(final String message) {
        super(message);
    }
}
public class Main {


    public static void main(String[] args) {
        Car car1 = new Car("Audi", 110, 20000);
        Car car2 = new Car("Honda", 103, 16800);

        try {
             car1.StartCar(car1);
             System.out.println(car1.getMark()+" go");
             }
        catch (StartException ex) {
           System.out.println(ex.getMessage());
        }

        try {
            car2.StartCar(car2);
            System.out.println(car2.getMark()+" go");
        } catch (StartException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
