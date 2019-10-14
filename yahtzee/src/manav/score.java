package manav;

import java.util.Scanner;

public class score {
    Scanner myObj = new Scanner(System.in);
    private int select;

    private int scoreGiv;
    private int counter = 0;
    score(){
        this.scoreGiv = scoreGiv;

    }
    int[] sheet(int[] rollImport, int[] rolled) {
        counter = 0;
        while(counter < 13) {
            if (rollImport[counter] == 0){
                System.out.println("Category " + (counter + 1) + " is open");
                counter++;
            } else{
                counter++;
            }
        }
        System.out.println("Pick a scoring category: ");
        String act = myObj.nextLine();
        int suma = sum(rolled);
        int actt = Integer.parseInt(act);
        switch (actt) {
            case 1:
                if (rollImport[0] == 0){
                    rollImport[0] = sixSum(rolled,1);
                    if (rollImport[0] == 0) {
                        rollImport[0] = -1;
                    }
                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 2:
                if (rollImport[1] == 0){
                    rollImport[1] = sixSum(rolled,2);
                    if (rollImport[1] == 0) {
                        rollImport[1] = -1;
                    }
                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 3:
                if (rollImport[2] == 0){
                    rollImport[2] = sixSum(rolled,3);
                    if (rollImport[2] == 0) {
                        rollImport[2] = -1;
                    }
                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 4:
                if (rollImport[3] == 0){
                    rollImport[3] = sixSum(rolled,4);
                    if (rollImport[3] == 0) {
                        rollImport[3] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 5:
                if (rollImport[4] == 0){
                    rollImport[4] = sixSum(rolled,5);
                    if (rollImport[4] == 0) {
                        rollImport[4] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 6:
                if (rollImport[5] == 0){
                    rollImport[5] = sixSum(rolled,6);
                    if (rollImport[5] == 0) {
                        rollImport[5] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 7:
                if (rollImport[6] == 0){
                    rollImport[6] = threefour(rolled,3);
                    if (rollImport[6] == 0) {
                        rollImport[6] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 8:
                if (rollImport[7] == 0){
                    rollImport[7] = threefour(rolled,4);
                    if (rollImport[7] == 0) {
                        rollImport[7] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 9:
                if (rollImport[8] == 0){
                    rollImport[8] = fullHouse(rolled,threefour(rolled,0));
                    if (rollImport[8] == 1){
                        rollImport[8] = 25;
                    }
                    if (rollImport[8] == 0) {
                        rollImport[8] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 10:
                if (rollImport[9] == 0){
                    rollImport[9] = straight(sort(rolled),4);
                    if (rollImport[9] == 0) {
                        rollImport[9] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 11:
                if (rollImport[10] == 0){
                    rollImport[9] = straight(sort(rolled),5);
                    if (rollImport[10] == 0) {
                        rollImport[10] = -1;
                    }

                }else{
                    System.out.println("Already used, turn taken away!");
                }
                break;
            case 12:
                int uno = rolled[1];
                int dos = rolled[2];
                int tre = rolled[3];
                int qua = rolled[4];
                int cin = rolled[5];
                if(uno == dos && dos == tre && tre == qua && qua == cin){
                    rollImport[11] = 50;
                }

                if (rollImport[11] == 0) {
                    rollImport[11] = -1;
                }


                break;
            case 13:
                if (rollImport[12] == 0){
                    rollImport[12] = sum(rolled);
                } else{
                    System.out.println("Already used, turn taken away!");
                }
                break;

        }
        System.out.println("Your score is " + sum(rollImport) + " points!");
        return(rollImport);
    }
    static int straight(int[] l, int howMany){
        int i = 0;
        if (howMany == 5){
            if ((l[0] < l[1] && l[1] < l[2] && l[2] < l[3] && l[3] < l[4]) || (l[1] < l[2] && l[2] < l[3] && l[3] < l[4] && l[4] < l[5])){
                return 40;
            }
        }
        if (howMany == 4){
            if ((l[0] < l[1] && l[1] < l[2] && l[2] < l[3]) || (l[1] < l[2] && l[2] < l[3] && l[3] < l[4]) || (l[2] < l[3] && l[3] < l[4] && l[4] < l[5])){
                return 30;
            }
        }
        return 0;


    }
    static int[] sort(int[] list) {   //Sorts a list into order
        int i = 0;
        int j = 0;
        int k = 0;
        int l = list.length;
        int m = 0;
        int n = 0;
        while (m < 5) {
            if (i < l) {
                if (list[i] > list[i + 1]) {
                    j = list[i];
                    k = list[i + 1];
                    list[i] = k;
                    list[i + 1] = j; }
                i++;
                if (i == l - 1) {
                    m++; }
                if (m == 1) {
                    i = 0;
                    m = 0;
                    n++; }
                if(n == l){
                    m = 6;
                } } }
        return (list);
    }
    int fullHouse(int[] rolled, int prevMeth){

        int gib = 1;
        int i = 0;
        int[] counterr = {0,0,0,0,0,0};
        if (prevMeth % 3 == 0){
            while (gib < 7){
                while(i < rolled.length){
                    if (rolled[i] == gib){
                        counterr[(gib-1)]++;
                        i++;
                    } else{
                        i++;
                    }
                }
                gib++;
            }

        }
        int j = 0;
        int inte = 1;
        int[] count = {0,0,0,0,0,0};
        while(j < 6){
            if(2 == counterr[j]){
                return(1);
            }
            j++;
        }
        return 0;
    }
    public static int threefour(int[] list, int howMany){
        int[] counter = {0,0,0,0,0,0};
        int i = 0;
        int sum = 0;
        int gib = 1;
        int secondCount = 1;
        while (gib < 7){
            i = 0;
            while (i < list.length){
                if (gib == list[i]){
                    counter[(gib-1)] += 1;
                    i++;
                }
                else{
                    i++;
                }

            }
            gib++;
        }
        while (secondCount < 6){
            if (howMany == 3){
                if(counter[secondCount] == 3){
                    sum = sum(list);
                    return sum;
                }
                }
            else if(howMany == 4){
                if(counter[secondCount] >= 4){
                    sum = sum(list);
                    return sum;
                }
            }
            else if(howMany == 0){
                if(counter[secondCount] == 3){
                    return (counter[secondCount] * secondCount);
                }
                else{
                    return 0;
                }
            }
            else{
                if(secondCount== 5){
                    return 0;
                }
            }
            secondCount++;

        }
        return 0;

    }
    public static int sum(int[] list) {
        int sum = 0;
        int i = 0;
        while(i < list.length) {
            sum += list[i];
            i++;
        }
        return sum;
    }
    int sixSum(int[] list, int gib){  // To calculate score of first 6 scoring brackets
        int resSum = 0;
        int cc = 0;
        while (cc < 5){
            if (gib == list[cc]){
                resSum += list[cc];
                cc += 1;
            }
            else{
                cc += 1;
            }
        }
        return resSum;
    }
}
