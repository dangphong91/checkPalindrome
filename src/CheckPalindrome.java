import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        Stack<Character> text1 = new Stack<>();
        Queue<Character> text2 = new LinkedList<>();
        for (int i = 0; i < check.length(); i++) {
            text1.push(check.charAt(i));
            text2.add(check.charAt(i));
        }
        boolean test = true;
        for (int i = 0; i < check.length(); i++) {
            if (text1.pop() != text2.remove()) {
                test = false;
                break;
            }
        }
        if (test) {
            System.out.println("Is Palindrome!");
        }
        else {
            System.out.println("Is not Palindrome!!!");
        }
    }
}
