public class Main {
    char x;
    public int count=1;

    public int Count(String pWord) {

        char[] arr = pWord.toCharArray();
        x = arr[0];
        pWord=pWord.substring(1);
        for ( int i = 1; i < pWord.length() ; i++) {
               if(pWord.indexOf(x)==-1){
                count=count+1;
            }else pWord=pWord.substring(i+1);
        }
        return count;
    }

       public static void main(String[] args) {
        Main obj = new Main();
        StringBuilder sentence=new StringBuilder("fff42f 856hgk llll ggu ");
        String[] word = sentence.toString().split("\\s");

        int[] colSimbol = new int[word.length];

        for(int i=0; i< word.length;i++){
        colSimbol[i]= obj.Count(word[i]);
            }

        int min=colSimbol[0];
        int id=0;
           for (int i = 0; i < word.length; i++) {
               if(min> colSimbol[i]){
                   min=colSimbol[i];
                   id=i;
               }
           }
           System.out.println(word[id]);
}
}

