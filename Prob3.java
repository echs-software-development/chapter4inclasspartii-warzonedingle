import java.util.Scanner;

class Prob3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word: ");

    String word = scan.nextLine();
    word = word.toLowerCase();

    System.out.println("Enter another word: ");
    String word2 = scan.nextLine();
    word2 = word2.toLowerCase();
    System.out.println(word.compareTo(word2));
    
  }
}