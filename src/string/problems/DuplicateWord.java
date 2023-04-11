package string.problems;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String [] allWord = st.split(" ");
        HashMap<String,Integer> wordC = new HashMap<String,Integer>();
        for(String word : allWord){
            if(wordC.containsKey(word.toLowerCase())){
                wordC.put(word.toLowerCase(),wordC.get(word.toLowerCase())+1);
            }
            else{
                wordC.put(word.toLowerCase(),1);
            }
        }

        Set<String> wordsInString = wordC.keySet();
        for(String word : wordsInString){
            if(wordC.get(word)>1){
                System.out.println(word+" : "+wordC.get(word));
            }
        }

    }

}
