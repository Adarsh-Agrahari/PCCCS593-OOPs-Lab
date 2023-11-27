// Java string program to replace a character at a specific index.

public class ques_1{
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello World!"); 
        int ind = 2;
        char newchar = 'm';
        System.out.println("Original String: "+str);
        str.setCharAt(ind, newchar);
        System.out.println("Modified String: "+str);
    }
}