import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i<n; i++)
        {
            if (a[i] < a[0])
            {
                a[0] = a[i];
            }

        }

        int max = a[0];
        System.out.println("Minimum in this list is : " + max);
    }
}
