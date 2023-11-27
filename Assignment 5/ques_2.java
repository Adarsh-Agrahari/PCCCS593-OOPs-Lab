// Java string program to remove leading zeros

public class ques_2 {
    public static void main(String[] args) {
        String input = "00012345";
        StringBuffer str = new StringBuffer(input);
        int i=0;
        while(i<str.length() && str.charAt(i)=='0') 
        str.deleteCharAt(i);
        System.out.println(str);
    }
}
