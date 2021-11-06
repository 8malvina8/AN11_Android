import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    int count = 0;
    int numSentence;
    int[] countText;



   public void PalindromWord(StringBuilder word) {
       String a = word.toString();
       StringBuilder str = word.reverse();

       if ((str.toString()).equalsIgnoreCase(a)) {
           System.out.println("Слово " + a + " является палиндромом");
                  } else {
           System.out.println(a+" не палиндром");}
   }

    public int PalindromCount(StringBuilder sentence) { //определение количества полиндромов в предложении

        String[] words = sentence.toString().split("\\s"); //массив из слов
        StringBuilder str = sentence.reverse();//переворачиваем всё предложение
        String[] wordsRevers = str.toString().split("\\s");//массив перевернутых слов
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = words.length-1; j > -1; j--)// обратный порядок, т.к. перевернули предложение задом наперед
                if (words[i].equalsIgnoreCase(wordsRevers[j]) && (words[i].length() > 1)) {
                    count = count + 1;
                }
        }
        return count;

    }

    public int PalindromCountX(String str,String strRevers) { //определение количества полиндромов в предложении

        String[] words = str.toString().split("\\s"); //массив из слов
        String[] words2 = strRevers.toString().split("\\s");

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = words2.length-1;j>-1; j--){// обратный порядок, т.к. перевернули предложение задом наперед
                if (words[i].equalsIgnoreCase(words2[j]) && (words[i].length() > 1)) {
                    count++;

                }
            }
        }
        return count;

    }


    public static void main(String[] args) {
          Main obj = new Main();
          //task3_1
//        StringBuilder str = new StringBuilder("Анна");
//        obj.PalindromWord(str);

        //task3_2
//        StringBuilder str1 = new StringBuilder("Сегодня казак пригласил мадам в ресторан");
//        System.out.println("Количество палиндромов в предложении: " + obj.PalindromCount(str1));

        //task3_3
        StringBuilder text = new StringBuilder("Сегодня казак пригласил мадам в ресторан. Он позвал как кабак казак её в шалаш." +
                " Тут мадам возмутилась как так. Топот был как потоп. Дед услышав шум пошел в кабак");
        String[] sentenceS =text.toString().split("\\.");//предложения

        StringBuilder textRevers=text.reverse();//реверс текста
        String[] sentenceSRevers =textRevers.toString().split("\\.");//предложения реверса

        int[] CounText = new int[sentenceS.length]; //количесвто палиндромов в каждом предложении

        int j= sentenceSRevers.length-1;
        for(int i=0; i<sentenceS.length; i++){
                CounText[i]=obj.PalindromCountX(sentenceS[i],sentenceSRevers[j]);
                j--;
            }

        int max=0;
        int num=0;
        for (int i=0;i< CounText.length;i++){
            if(max<CounText[i]){
                max=CounText[i];
                num=i+1;
            }
        }
        System.out.println("Номер предложения: "+num);
        System.out.println("Количество палиндромов: "+CounText[num]);


    }
}


