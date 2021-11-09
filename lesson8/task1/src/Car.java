public class Car {
    private String mark;
    private double speed;
    private double price;


    public Car(String pMark, double pSpeed, double pPrice) {
        this.mark = pMark;
        this.speed = pSpeed;
        this.price = pPrice;
    }

    public Car() {
    }


    public String getMark() {
        return mark;
    }

    public void setName(String pMark) {
        this.mark = pMark;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double pSpeed) {
        this.speed = pSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int pPrise) {
        this.price = pPrise;
    }

    public static void StartCar(Car pCar) throws StartException{

        int x = (int) (Math.random() * 21);
        if (x % 2 == 0) {
            throw new StartException("Ошибка запуска");
        }

    }

}


