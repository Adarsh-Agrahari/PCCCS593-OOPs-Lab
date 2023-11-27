// Java string program to reverse a string using stack

import java.util.Stack;
public class ques_3 {
    public static void main(String[] args) {
        String input = "Hello World!";
        Stack<Character> s = new Stack<>();
        for(char c:input.toCharArray())s.push(c);
        StringBuffer reversed = new StringBuffer();
        while(!s.empty()) reversed.append(s.pop());
        System.out.println(reversed.toString()); 
    }
}
