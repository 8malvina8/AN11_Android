public class JacketAdidas implements Jacket {
    String name;

    @Override
    public void putOn(String name) {
        this.name=name;
        System.out.println(name+" надел куртку Adidas.");
    }


    @Override
    public void putOff(String name) {
        this.name=name;
        System.out.println(name+ " снял куртку Adidas");
    }
}

