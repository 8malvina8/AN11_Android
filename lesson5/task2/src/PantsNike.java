public class PantsNike implements Pants{
    String name;
    @Override
    public void putOn( String name) {
        this.name=name;
        System.out.println(name+ "Я надел кроссовки Nike.");
    }

    @Override
    public void putOff( String name) {
        this.name=name;
        System.out.println(name+ "Я снял кроссовки Nike.");
    }
}

