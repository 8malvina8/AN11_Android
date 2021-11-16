import java.io.*;

public class Main {
    public static void main(String[] args) {

        String way = "D:\\TMS\\AN11_Android\\lesson9\\task4\\car.ser";
        Car car1 = new Car("BMV", 180.5, 23500);
        serializ(car1, way);
        Car car2 = deserializ(way);
        System.out.println(car2.getMark());
    }


    public static void serializ(final Car pCar,final String pWay) {

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pWay));
            objectOutputStream.writeObject(pCar);
            objectOutputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(pCar);
    }

    public static Car deserializ(final String pWay) {
        Car car = null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pWay));
            car = (Car) objectInputStream.readObject();
            objectInputStream.close();
            return car;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return car;
    }
}





