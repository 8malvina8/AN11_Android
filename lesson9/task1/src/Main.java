import java.io.*;
import java.util.ArrayList;

public class Main {

        public static boolean palWord(String word)
        {
            StringBuilder palindromWord =new StringBuilder(word);
            if ((palindromWord.reverse().toString()).equalsIgnoreCase(word) && word.length() > 2){
            return true;
            }else return false;

        }


    public static void readDocument(File pFile) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(pFile))) {
            String word;
            ArrayList<String> list = new ArrayList<>();
            while ((word = reader.readLine()) != null) {
                if (!word.isEmpty()) {
                    list.add(word);
                    System.out.println(word);
                }
            }
            String[] stringArr = list.toArray(new String[0]);//почему во всех источниках тут указан 0?
            newFile(stringArr);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void newFile(String[] strings) { //метод для заполнения файла
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\TMS\\AN11_Android\\lesson9\\task1\\palindrome.txt"))) {
            for (String string : strings) {

                if (string != null && !string.isEmpty() && palWord(string)) {
                    bufferedWriter.write(string);
                    bufferedWriter.append('\n');
                    bufferedWriter.flush();
                }
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {

        final File file = new File("D:\\TMS\\AN11_Android\\lesson9\\task1\\new_file.txt");
        readDocument(file);

    }
}

