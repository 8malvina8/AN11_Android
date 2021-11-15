import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
//
//class IOException{
//    StringBuilder text = new StringBuilder(1000);
//


public class Main {
    public static void main(String[] args) throws IOException {

        final File file = new File("D:\\TMS\\AN11_Android\\lesson9\\task2\\text.txt");
        readText(file);
    }

        public static void readText(File pFile){
        try (BufferedReader reader = new BufferedReader(new FileReader(pFile))) {
            String text;
            ArrayList<String> list = new ArrayList<>();
            while ((text = reader.readLine()) != null) {
                if (!text.isEmpty()) {
                    list.add(text);
                    System.out.println(text);
                }
            }
            String[] stringArr = list.toArray(new String[0]);
            result(stringArr);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void result(String[] pText) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\TMS\\AN11_Android\\lesson9\\task2\\Sentences.txt"))) {
            for (String string : pText) {
                if (palindromCount(string) > 0 || (numWords(string) > 2 && numWords(string) < 6)) {
                    bufferedWriter.write(string);
                    bufferedWriter.append('\n');
                    bufferedWriter.flush();
                    System.out.println(string);
                }
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public static boolean palindromWord(String word) {
        StringBuilder palindromWord = new StringBuilder(word);
        if ((palindromWord.reverse().toString()).equalsIgnoreCase(word) && word.length() > 2) {
            return true;
        } else return false;

    }

    public static int palindromCount(String sentence) { //определение количества полиндромов в предложении


        String[] words = sentence.split("[\\s]"); //массив из слов

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (palindromWord(words[i])) {
                count = count + 1;
            }

        }
        return count;
    }


    public static int numWords(String pSentences) {
        String[] words = pSentences.trim().split("\\s");
        return words.length;
    }


}







