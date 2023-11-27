// Java string program to Sort a string

public class ques_4 {
    public static void main(String[] args) {
        String input = "cbaed";
        char[] chars = input.toCharArray();
        java.util.Arrays.sort(chars);
        String sortedString = new String(chars);
        System.out.println(sortedString);
    }
}
