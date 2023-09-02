
class sumofMultiples{
    int sum;

    sumofMultiples(int number, int[] set){
        this.sum=0;
        for(int i=0;i<number;i++){
            for(int j=0;j<set.length;j++){
                if(i%set[j]==0){
                    sum+=i;
                    break;
                }
            }
        }
    }

    int getSum(){
        return sum;
    }
}

public class sumOfMultiples {
    public static void main(String[] args) {
        
    }
}
