import java.io.*;
import java.util.*;
public class Vowel{
   	public static void main(String[] args) {
    char c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an Alphabet");
    c = sc.next().charAt(0);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
      System.out.println(c + " is Vowel");
    } else {
      System.out.println(c + " is Consonant");
    }
  }
}
