import java.io.*;
import java.util.*;
public class Prime {
  public static void main(String args[]) {
    int num, i, isPrime = 0;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter an Integer");
    num = in.nextInt();
    
    for(i = 2; i <= (num / 2); ++i) {
      if (num % i == 0) {
        isPrime = 1;
        break;
      }
    }
    // If isPrime is true then the num is prime otherwise non-prime
    if (isPrime == 0)
    System.out.println(num + " is a Prime Number");
    else
    System.out.println(num + " is not a Prime Number");
  }
}
