import java.io.Serializable;

public class Car implements Serializable {
    private String mark;
    private Double speed;
    private int price;
    private static final long serialVersionUID = 1L;

    Car(final String pMark,final Double pSpeed,final int pPrice){
        mark=pMark;
        speed=pSpeed;
        price=pPrice;
    }

    public Double getSpeed() {
        return speed;
    }

    public String getMark() {
        return mark;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
