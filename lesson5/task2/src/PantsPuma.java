public class PantsPuma implements Pants{
    String name;
    @Override
    public void putOn( String name) {

        this.name=name;
        System.out.println(name+" надел кроссовки Asics.");
    }

    @Override
    public void putOff( String name) {
        this.name=name;
        System.out.println(name+ " снял кроссовки Asics.");
    }
}
