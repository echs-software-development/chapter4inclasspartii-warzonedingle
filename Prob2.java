import java.util.Scanner;

class Prob2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String h = scan.nextLine();
    System.out.print(h.substring(0,1));
    System.out.print(h.substring(h.length()-1));
    
    
  }
}