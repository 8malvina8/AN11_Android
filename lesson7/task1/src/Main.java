public class Main {
    public static void main(String[] args) {
        final String s = new String("Один два три четыре пять");
        System.out.println(s);

        System.out.print("Вырезанная подстрока: ");
        System.out.println(s.substring(7, 20));
    }
}

