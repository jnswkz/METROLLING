import java.util.Scanner;

class domino
{
    public int left;
    public int right;

    domino(int left, int right)
    {
        this.left = left;
        this.right = right;
    }
    
    public int getLeft()
    {
        return this.left;
    }
    
    public int getRight()
    {
        return this.right;
    }

    public void setLeft(int left)
    {
        this.left = left;
    }

    public void setRight(int right)
    {
        this.right = right;
    }

    public void flip()
    {
        int temp = this.left;
        this.left = this.right;
        this.right = temp;
    }

    public boolean equals(domino d)
    {
        if (this.left == d.left && this.right == d.right)
            return true;
        else
            return false;
    }

    public String toString()
    {
        return "[" + this.left + "|" + this.right + "]";
    }

    public boolean isMatch(domino d){
        return this.right == d.left;
    }    

    public boolean duplicate(domino d){
        return this.left == d.left && this.right == d.right;
    }

}

public class dominoes {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        int n;
        n = myInput.nextInt();
        domino [] dominoes = new domino[n];
        for (int i = 0; i < n; i++) {
            int left = myInput.nextInt();
            int right = myInput.nextInt();
            dominoes[i] = new domino(left, right);
        }
        myInput.close();
        for (int i = 0; i < n; i++) {
            System.out.println(dominoes[i].toString());
        }

        for (int i = 0; i < n; i++) {
            if (dominoes[i].getLeft() > dominoes[i].getRight())
                dominoes[i].flip();
        }

        for (int i = 0; i < n; i++) {
            if (dominoes[i].getLeft() == 1 && dominoes[i].getRight()-1 > 1){
                dominoes[i].flip();
            }
        }

        //sort my dominoes array by left value
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (dominoes[j].getLeft() > dominoes[j+1].getLeft()){
                    domino temp = dominoes[j];
                    dominoes[j] = dominoes[j+1];
                    dominoes[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (!dominoes[i].isMatch(dominoes[i+1])){
                dominoes[i+1].flip();   
            }   
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(dominoes[i].toString());
        }
    }
}
