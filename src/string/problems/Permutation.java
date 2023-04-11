package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String s = "ABC";
        int n = s.length();
        Permutation permutation = new Permutation();
        permutation.calculate(s,0,n-1);


    }

    private void calculate(String str, int left, int right){
        if(left==right){
            System.out.println(str);
        }
        else{
            for(int i=left;i<=right;i++){
                String swapped = this.swap(str,left,i);
                this.calculate(swapped, left+1, right);
            }
        }
    }
    private String swap(String str, int i, int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[i];
        charArray[j]= temp;
        return String.valueOf(charArray);

    }

}

