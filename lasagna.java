
class Lasgana{
    public int minutes = 40;
    public int timeForEachLayer = 2;

    public int expectedMinutesInOven(){
        return this.minutes;
    }

    public int remainingMinutesInOven(int minutes){
        return this.minutes - minutes;
    }

    public int preparationTimeInMinutes(int layer){
        return this.timeForEachLayer*layer;
    }

    public int totalTimeInMinutes(int layer, int minutes){
        int timeLeftToCook = this.minutes - minutes;
        int timeForPreparation = this.timeForEachLayer*layer;
        return timeForPreparation + timeLeftToCook;
    } 

}

public class lasagna {
    public static void main(String[] args) {
        Lasgana theFreakinLasgana = new Lasgana();
        System.out.println(theFreakinLasgana.expectedMinutesInOven());
        System.out.println(theFreakinLasgana.remainingMinutesInOven(20));
        System.out.println(theFreakinLasgana.preparationTimeInMinutes(2));
        System.out.println(theFreakinLasgana.totalTimeInMinutes(3, 20));

    }
}
