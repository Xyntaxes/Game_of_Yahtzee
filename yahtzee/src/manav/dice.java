package manav;


public class dice {
    private int roll;
    private int which;
    dice(int which){
        this.which = which;

    }
    int getRoll() {
        roll = (int)(Math.random() * ((6 - 1) + 1) + 1);
        return(roll);
    }
}
