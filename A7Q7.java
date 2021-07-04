package Assignments;
import java.util.Scanner;

public class A7Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        System.out.println(word.substring(0,word.length() / 2));
        System.out.println(word.substring(0,word.length() / 2));
    }
}
