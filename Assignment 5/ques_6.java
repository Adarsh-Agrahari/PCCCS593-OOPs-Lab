// Java string program compared two strings lexicographically.

public class ques_6 {
    public static void main(String[] args) {
        String str1 = "apple", str2 = "banana";
        int ans = str1.compareTo(str2);
        if(ans<0) System.out.println(str1 + " comes before " + str2);
        else if(ans>0) System.out.println(str2 + " comes before " + str1);
        else System.out.println(str1 + " is lexicographycally equal to " + str2);
    }
}
