import java.util.Scanner;

class Gopaal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // no. of test cases

        for (; t > 0; t--) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // either truck driver must turn, or Gopaal must turn...
            if (x <= 30 || y <= 20)
                System.out.println(0); // bach gyaa
            else
                System.out.println(1); // RIP Gopaal
        }
    }
}