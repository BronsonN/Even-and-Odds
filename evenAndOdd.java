import java.util.*;
public class evenAndOdd {
    public static void main (String [] args) {
    Scanner stdin = new Scanner(System.in);
            int x;
    int esum = 0, ecount = 0;
    int osum = 0, ocount = 0;
    x = stdin.nextInt();
    while (x > 0) {
      if (x % 2 == 0) {
        esum += x;
        ecount++;
      }
      else {
        osum += x;
        ocount++;
      }
      x = stdin.nextInt();
    }
    System.out.println(esum + " " + osum + " " + ecount + " " + ocount);
    }
}
