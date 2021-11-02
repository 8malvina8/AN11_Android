public class Main {
    public static void main(String[] args) {
        Gretter russian = new Gretter() {
            @Override
            public void wish() {
                System.out.println("Привет!");
            }

        };

        Gretter english = new Gretter() {
            @Override
            public void wish() {
                System.out.println("Hello!");
            }
        };
        Gretter spanish = new Gretter() {
            @Override
            public void wish() {
                System.out.println("Hola!");
            }
        };
        Gretter romana = new Gretter() {
            @Override
            public void wish() {
                System.out.println("Buna ziua!");
            }
        };

        russian.wish();
        english.wish();
        spanish.wish();
        romana.wish();
    }
}
