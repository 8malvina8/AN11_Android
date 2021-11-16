public class Main {
    public static void main(String[] args) {
        String s = "Один два три четыре одинадцать";
        char a=s.charAt(3);
        char b=s.charAt(0);

        System.out.print("Новая строка: " );
        System.out.println(s.replace(a,b));

    }
}
