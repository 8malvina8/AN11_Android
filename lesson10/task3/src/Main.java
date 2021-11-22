import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Person man1 = new Person("Masha");
       Person man2 = new Person("Misha");
        Person man3 = new Person("Alex");
        Person man4 = new Person("Egor");
        ArrayList<Person> list = new ArrayList<>();
        list.add(man1);
        list.add(man2);
        list.add(man3);
        list.add(man4);

        for (Person person : list) {
            System.out.println(person.getName());
        }

//        list.forEach(new Consumer<Person>() {
//            @Override
//            public void accept(Person person) {
//                System.out.println(person.getName());
//            }
//        });

        System.out.println("////////////");
        list.set(2,new Person("Milana"));
        for (Person person : list) {
            System.out.println(person.getName());
        }
        System.out.println("////////////");

        int i= list.size();
        list.remove(i-1);
        for (Person person : list) {
            System.out.println(person.getName());
        }

        Person man=new Person("Egor");
        //System.out.println(list.contains("Egor"));
        list.removeAll(list);
        System.out.println(list);
    }
}
