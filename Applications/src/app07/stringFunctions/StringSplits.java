package app07.stringFunctions;

public class StringSplits {
    public static void main(String[] args) {
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("Word 1: "+word1);
        System.out.println("Word 2: "+word2);
        System.out.println("Word 3: "+word3);
    }
}
