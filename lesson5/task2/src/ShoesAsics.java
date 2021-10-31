public class ShoesAsics implements Shoes {
    String name;
    @Override
    public void putOn( String name) {
        this.name=name;
        System.out.println(name+" надел штаны Puma.");
    }

    @Override
    public void putOff( String name) {
        this.name=name;
        System.out.println(name+" снял штаны Puma.");
    }
}
