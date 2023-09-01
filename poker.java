import java.util.Scanner;

public class poker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cards = new String[n];
        for(int i=0;i<n;i++)
        {
            cards[i] = sc.next();
        }
        int[] count = new int[5];
        for(int i=0;i<n;i++)
        {
            if(cards[i].charAt(0)=='A')
            {
                count[0]++;
            }
            else if(cards[i].charAt(0)=='K')
            {
                count[1]++;
            }
            else if(cards[i].charAt(0)=='Q')
            {
                count[2]++;
            }
            else if(cards[i].charAt(0)=='J')
            {
                count[3]++;
            }
            else if(cards[i].charAt(0)=='T')
            {
                count[4]++;
            }
        }
        int max = 0;
        for(int i=0;i<5;i++)
        {
            if(count[i]>max)
            {
                max = count[i];
            }
        }
        System.out.println(max);
    }
}
