package manav;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean run = true;
        int[] rollImport = {0,0,0,0,0,0,0,0,0,0,0,0,0};
        int turn = 1;
        int[] rolled = {0, 0, 0, 0, 0, 0};
        int allowrolls = 3;
        int score = 0;
        String act = "y";
        score pscore = new score();
        System.out.println("1-6: There is one category for each number on the die. In these categories, the score is the sum of the pips on the dice of that number. For example, a roll of 1-1-2-5-5 could be scored as 2 points in the \"ones\" category, 2 points in the \"twos\" category, 10 points in the \"fives\" category, or 0 points in the \"threes,\" \"fours,\" or \"sixes.\" If a player scores a total of at least 63 points across these six boxes, a bonus of 35 points is added.\n" +
                "7. Three-Of-A-Kind: At least three dice showing the same face -- Points equal the sum of all 5 dice (not just the 3 of a kind)\n" +
                "8. Four-Of-A-Kind: At least four dice showing the same face -- Points equal the sum of all 5 dice (not just the 4 of a kind)\n" +
                "9. Full House: A three-of-a-kind and a pair -- 25 points\n" +
                "10. Small Straight: Four sequential dice 1-2-3-4, 2-3-4-5, or 3-4-5-6) -- 30 points\n" +
                "11. Large Straight: Five sequential dice (1-2-3-4-5 or 2-3-4-5-6) -- 40 points\n" +
                "12. Yahtzee: All five dice showing the same face -- 50 points\n" +
                "13. Chance: Any combination -- points equal the sum of all 5 dice\n");
        System.out.println("UNLESS YOU ARE VERY EXPERIENCED WITH THIS GAME, IT IS RECOMMENDED THAT ONE PLAYS WITH THE SCORING SHEET!\n");
        while (run) {
            System.out.println("Welcome to turn " + turn + ". Press ENTER to roll!");
            String blank = myObj.nextLine();
            allowrolls = 3;
            rolled = roll(rolled);
            System.out.println("Dice 1: " + rolled[0]);
            System.out.println("Dice 2: " + rolled[1]);
            System.out.println("Dice 3: " + rolled[2]);
            System.out.println("Dice 4: " + rolled[3]);
            System.out.println("Dice 5: " + rolled[4]);
            System.out.println("Would you like to reroll something? (y or n)");
            act = myObj.nextLine();
            while (act.equals("y") && allowrolls != 0) {
                if (allowrolls < 3){
                    System.out.println("Dice 1: " + rolled[0]);
                    System.out.println("Dice 2: " + rolled[1]);
                    System.out.println("Dice 3: " + rolled[2]);
                    System.out.println("Dice 4: " + rolled[3]);
                    System.out.println("Dice 5: " + rolled[4]);
                    System.out.println("Would you like to reroll something? (y or n)");
                    act = myObj.nextLine();
                }
                if(act.equals("y")){
                    rolled = reroll(rolled);
                    allowrolls -= 1;
                }


            }
            System.out.println("Dice 1: " + rolled[0]);
            System.out.println("Dice 2: " + rolled[1]);
            System.out.println("Dice 3: " + rolled[2]);
            System.out.println("Dice 4: " + rolled[3]);
            System.out.println("Dice 5: " + rolled[4] + "\n");
            System.out.println("GET READY TO CHOOSE A CATEGORY");
            try
            {
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt(); // restore interrupted status
            }
            rollImport = pscore.sheet(rollImport,rolled);
            turn += 1;

            if (turn == 14){
                run = false;
            }
        }

        System.out.println("Your final score is " + score + " points!");

    }



    public static int[] roll(int[] rolled) {
        dice one = new dice(1);
        rolled[0] = one.getRoll();
        dice two = new dice(2);
        rolled[1] = two.getRoll();
        dice thr = new dice(3);
        rolled[2] = thr.getRoll();
        dice fou = new dice(4);
        rolled[3] = fou.getRoll();
        dice fiv = new dice(5);
        rolled[4] = fiv.getRoll();
        return rolled;
    }
    public static int[] reroll(int[] rolled) {
        int i = 0;
        int[] rerolls = {0,0,0,0,0};
        Scanner myObj = new Scanner(System.in);

        dice rer = new dice(6);
        while(i < 5) {
            System.out.println("Would you like to reroll dice " + (i + 1) + "? (y or n)");
            String act = myObj.nextLine();
            if (act.equals("y")) {
                rolled[i] = rer.getRoll();
                i++;
            } else{
                i++;
            }

        }
        return (rolled);


    }
}

