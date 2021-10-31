public class Main {
    public static void main(String[] args) {


        Jacket jak1 = new JacketNike();
        Jacket jak2 = new JacketAdidas();

        Pants pants1 = new PantsNike();
        Pants pants2 = new PantsPuma();

        Shoes shoes1=  new ShoesAsics();
        Shoes shoes2 = new ShoesReebok();

        Person person = new Person("Alex", jak1,pants2,shoes2);

        person.getDressed();
        person.outDressed();

    }
}
