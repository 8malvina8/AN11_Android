import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Student {
    String name;
    int id;


    Student(){}

    Student(int id, String  name){
        this.name=name;
        this.id = id;
    }


    public ArrayList<String> list() { //список студентов
        Scanner in = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        students.add("");
        System.out.println("Введите ФИО студентов: ");
        name = in.nextLine();
        while (!name.equalsIgnoreCase("stop")) {

            students.add(name);
            name = in.nextLine();
        }
        Hashtable< Integer, String> listStudents = new Hashtable<>();
        for (int i = 1; i < students.size(); i++) {
            listStudents.put(i, students.get(i));

        }

        return students;
    }

    public void print(ArrayList pStudents){
        for (int i = 1; i < pStudents.size(); i++) {
            System.out.println(i+ ". " + pStudents.get(i));
        }
    }

    public ArrayList<String > addStudent(ArrayList pStudents){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО студентов: ");
        name = in.nextLine();
        while (!name.equalsIgnoreCase("stop")) {

            pStudents.add(name);
            name = in.nextLine();
        }
        return pStudents;
    }

    public ArrayList<String > deleteStudent(ArrayList pStudents){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер студентa, которого необходимо удалить(для выхода введите 0): ");
        id = in.nextInt();
        if (id > 0 && id < pStudents.size()) {
            pStudents.remove(id);
            id = in.nextInt();
        } else System.out.println("Некорректные данные! ");

        return pStudents;
    }
    public void visitStudents(ArrayList pStudents){
        ArrayList visit = new ArrayList<String>();

        for (int i = 0; i < pStudents.size(); i++) { //сразу заполнили все минусами и дажее будем редактировать
            visit.add("-");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер студентa, который присутствовал на занятии(для выхода введите 0): ");
        id = in.nextInt();
        while (id!=0){
            if (id > 0 && id < pStudents.size()){
                visit.set(id,"+");
            } id = in.nextInt();

        }print(visit);
    }
}
