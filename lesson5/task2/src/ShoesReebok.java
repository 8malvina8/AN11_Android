public class ShoesReebok implements Shoes{

    String name;

    @Override
    public void putOn( String name) {
        this.name=name;
        System.out.println(name+ " надел кроссовки Reebok.");
    }

    @Override
    public void putOff( String name) {
        this.name=name;
        System.out.println(name + " снял кроссовки Reebok.");
    }
}
