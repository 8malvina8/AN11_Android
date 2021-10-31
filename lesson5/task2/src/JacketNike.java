public class JacketNike implements Jacket{
    String name;

    @Override
    public void putOff(String name) {
        this.name=name;
        System.out.println(name +" снял куртку Nike.");
    }

    @Override
    public void putOn(String name) {
        this.name=name;
        System.out.println(name+ " надел куртку Nike.");
    }
}
