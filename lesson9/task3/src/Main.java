import java.io.*;

public class Main {

    public static void main(String[] args) {

        final String firstText = readDocuments(new File("D:\\TMS\\AN11_Android\\lesson9\\task3\\Text.txt"));
        final String black_list = readDocuments(new File("D:\\TMS\\AN11_Android\\lesson9\\task3\\Black_list.txt"));
        findWord(firstText,black_list);
    }


    public static String readDocuments(File pText) {


        String result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(pText))) {
            String text;

            while ((text = reader.readLine()) != null) {
                if (!text.isEmpty()) {
                    result += text;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void findWord(String pText, String pList) {

        String[] sent = pText.split("[\\.\\n]");
        int count = 0;
        boolean isBad = false;
        String[] badWords = pList.split("[,:;\\s]");

        for (int i = 0; i < sent.length; i++) {//для предложенй
            String[] WordsSentence = sent[i].split("[,:;\\s]");
            for (String word : WordsSentence) { //для слов из предложения
                for (String bed : badWords) { //для плохих слов
                    if (word.equalsIgnoreCase(bed)) {
                        count++;
                        isBad = true;
                        System.out.println(sent[i]);
                        break;
                    }
                }
                if (isBad == true) {
                    break;
                }

            }

        }
        if (count == 0) {
            System.out.println("Текст прошел проверку!");
        } else {
            System.out.println("Текст не прошел проверку!");
            System.out.println("Количество предложений не прош. проверку: " + count);
        }
    }
}






