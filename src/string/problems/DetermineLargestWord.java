package string.problems;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        String wordGiven;
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        //implement
        String longestWord = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).orElse(null).toString();
        System.out.println( " "+longestWord);
        //  DetermineLargestWord.findTheLargestWord()



    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        int largest = 0;
        //implement
        String [] words = wordGiven.split(" ");
        for(int i=0;i<words.length;i++){
            if(largest<words[i].length()){
                largest = words[i].length();
            }
        }
        System.out.print(largest);
        return map;
    }
}

