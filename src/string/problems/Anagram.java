package string.problems;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Please enter 2 Anagram words: ");
         String str1 = sc.next();
         String str2 = sc.next();

         char[] arr1 = str1.toLowerCase().toCharArray();
         char[] arr2 = str2.toLowerCase().toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         if (Arrays.equals(arr1, arr2)) {
             System.out.println("Strings are anagram");
         } else {
             System.out.println("String are NOT anagram");

         }
    
    
    
    
