import java.util.Scanner;

public class numberSpelling {
    
    public static String spell(int n){
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen", "twenty"};
        String[] numberTens = {" "," ","twen","thir","for","fif","six","seven","eigh","nine"};
        if (n <= 20){
            return numbers[n];
        }
        else if (n < 100 ){
            return numberTens[n/10] + "ty" + ((n%10 != 0) ? " " + spell(n%10) : "");
        }
        else {
            return numbers[n/100] + " hundred" + ((n%100 != 0) ? " " + spell(n%100) : "");
        }
    }

    public static String _reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int number = myInput.nextInt();

        myInput.close();

        int ntemp = 0;
        String[] snum = new String[100];
        String[] numberss = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] roles = {"null","", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion", "sextillion"};
        int k=0;

        
        while (number > 0) {
            ntemp = number % 10;
            snum[++k] = numberss[ntemp];
            number = number / 10;
        }
        //reverse snum array
        // for (int i = 1; i <= k/2; i++) {
        //     String temp = snum[i];
        //     snum[i] = snum[k-i+1];
        //     snum[k-i+1] = temp;
        // }

        //print snum array 
        // for (int i = 1; i <= k; i++) {
        //     System.out.print(snum[i] + " ");
        // }

        String[] each = new String[100];
        //cut my snum array to parts, and each parts have 3 elements
        int j = 1;
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0) {
                each[j] = snum[i-2] + snum[i-1] + snum[i];
                j++;
            }else if (i == k) {
                if (i % 3 == 1) {
                    each[j] = snum[i];
                    j++;
                }else if (i % 3 == 2) {
                    each[j] = snum[i-1] + snum[i];
                    j++;
                }
            }

        }

        //print my each array
        j--;
        //reverse my each array
        for (int i = 1; i <= j/2; i++) {
            String temp = each[i];
            each[i] = each[j-i+1];
            each[j-i+1] = temp;
        }
        // print my each array
        // for (int i = 1; i <= j; i++) {
        //     System.out.print(each[i] + " ");
        // }

        String[] each2 = new String[100];
        // //print my each array
        // for (int i = j; i > 0; i--) {
        //     each2[j-i+1] = each[i];
        // }
        // // print my each2 array
        // for (int i = 1; i <= j; i++) {
        //     System.out.print(each2[i] + " ");
        // }
        
        for (int i = 1; i <= j; i++) {
            each2[i] = _reverse(each[i]);
        }
        // print my each2 array
        // for (int i = 1; i <= j; i++) {
        //     System.out.print(each2[i] + " ");
        // }
       
        for (int i = 1; i <= j; i++) {
            int temp = Integer.parseInt(each2[i]);
            System.out.println(spell(temp) + " " + roles[j-i+1] + ((i != j-1) ? " " : ""));
        }
        
    } 
}
