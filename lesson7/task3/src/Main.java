import java.util.Arrays;
import java.util.OptionalInt;

public class Main {

    public boolean palindromWord(String word) {
          return (new StringBuilder(word).reverse().toString()).equalsIgnoreCase(word) && word.length() > 1;
    }

    public int palindromCount(String sentence) { //определение количества полиндромов в предложении

        String[] words = sentence.toString().split("\\s"); //массив из слов

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (palindromWord(words[i])) {
                count = count + 1;
            }

        }
        return count;
    }


    public int palindromCountText(String text) { //определение количества полиндромов в каждом предложении

        String[] sentences = text.toString().split("\\."); //массив из предложений

        int[] count = new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            count[i] = palindromCount(sentences[i]);
        }

        int max = count[0];
        int nom = 0;
        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                nom = i;
            }
        }
        return nom;

    }


    public static void main(String[] args) {
        Main obj = new Main();
        //task3_1
//        String str = "Анна";
//        if(obj.PalindromWord(str)) { System.out.println("Слово " + str + " является палиндромом");}
//        else  System.out.println("Слово " + str + " не палиндром");

        //task3_2
//        String str1 = "Сегодня казак как мам пригласил мадам в ресторан";
//        System.out.println("Количество палиндромов в предложении: " + obj.PalindromCount(str1));
        int x;
        //task3_3
        String text = "Сегодня так казак пригласил в ресторан. Он позвал казак так её  в шалаш." +
                " Тут мадам возмутилась как vfv hgh так. Топот был как потоп. Дед услышав шум пошел в кабак";
        x = obj.palindromCountText(text);
        System.out.println("№ предложения с max числом палиндромов: " + (x+1));


    }
}


