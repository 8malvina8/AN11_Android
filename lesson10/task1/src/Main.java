import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> allStudents = null;

        Student call = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду start, visit, exit, edd или delete");
        String word = scanner.nextLine();

        while (!word.equalsIgnoreCase("exit")) {

            switch (word) {
                case "start":
                    allStudents=call.list();
                    call.print(allStudents);
                    break;
                case "add":
                    allStudents=call.addStudent(allStudents);
                    call.print(allStudents);
                    break;
                case "delete":
                    allStudents = call.deleteStudent(allStudents);
                    call.print(allStudents);
                    break;
                case "visit":
                    call.visitStudents(allStudents);
            }
            word = scanner.nextLine();
        }

    }
}
