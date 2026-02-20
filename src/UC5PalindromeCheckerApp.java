import java.util.Stack;

public class UC5PalindromeCheckerApp
{
    public static void main(String[] args){
        String word="noon";
        boolean palindrome=true;
        Stack<Character> stack=new Stack<>();
        for(char c:word.toCharArray()){
            stack.push(c);
        }
        for(char c:word.toCharArray()){
            if(c==stack.pop)
        }
        System.out.println("Input text: "+word);
        System.out.println("Is it a palindrome?: "+palindrome);
    }
}