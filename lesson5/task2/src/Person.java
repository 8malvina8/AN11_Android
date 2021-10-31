public class Person {
    private Jacket jacket;
    private Shoes shoes;
    private Pants pants;
    public  String name;

    public Person(String name, Jacket jacket,Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.pants = pants;
    }

    public void getDressed() {
      jacket.putOn(name);
      pants.putOn(name);
      shoes.putOn(name);
      System.out.println();
    }

    public void outDressed() {

        jacket.putOff(name);
        pants.putOff(name);
        shoes.putOff(name);
    }
}
