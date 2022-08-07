import java.util.*;
class Main {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String line =sc.nextLine();
    int vowels = 0, consonants = 0;

    line = line.toLowerCase();

    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }
      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
      }
    }
    System.out.println("Ratio is "+vowels+" : "+consonants);

    sc.close();
  }
}