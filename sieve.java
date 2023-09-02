import java.util.Scanner;

public class sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] sv = new int[n+1];
        for (int i = 2; i <= n; i++) {
            sv[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (sv[i] == i) {
                for (int j = i+i; j <= n; j += i) {
                    sv[j] = 0;
                }

            } 
        }
        
        for (int i = 2; i <= n; i++) {
            if (sv[i] != 0) {
                System.out.print(sv[i] + " ");
            }
        }
    }
}