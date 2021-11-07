public class Main {

    public  void Sort(int[] pCount){
          for(int i = pCount.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( pCount[j] < pCount[j+1] ){
                int tmp = pCount[j];
                pCount[j] = pCount[j+1];
                pCount[j+1] = tmp;
            }
        }
    }
}



    public static void main(String[] args) {
        String text = "Привет он сказал он мне привет в он ответ";

        String[] words = text.split("\\s");
        int[] count = new int[words.length];
        String w;

        for (int i = 0; i < words.length; i++) {
            w = words[i];
            count[i] = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (w.equalsIgnoreCase(words[j])) {
                    count[i] = count[i] + 1;
                }
            }
        }
        Main main=new Main();
       // main.Sort(count);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]+" повторялось "+count[i]);
        }
    }
}

