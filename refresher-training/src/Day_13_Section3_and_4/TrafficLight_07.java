package Day_13_Section3_and_4;

public enum TrafficLight_07 {
    RED(30),
    YELLOW(5),
    GREEN(25);

    private int duration;

    TrafficLight_07(int duration) {
        this.duration = duration;
    }

    int getDuration() {
        return duration;
    }
}

class Main5{
    public static void main(String[] args) {
        TrafficLight_07[] l = TrafficLight_07.values();

        for(int i = 0 ; i < l.length; i++){
            System.out.println(l[i] + " " + l[i].getDuration() + " seconds");
        }
    }
}
