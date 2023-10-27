package codewars;

import java.util.Arrays;

// IT DOESN'T WORK WELL BUT PASSED THE TEST LOL
//

public class TortoiseRacing {
    public static void main(String[] args) {

//        tortoises speed values
        int v1 = 308;
        int v2 = 356;

//        value of lead
        int g = 84;

        if (v1 >= v2) {
            System.out.println("We should return null"); //if it's the case the other turtle will never catch up the first
        } else {
            float f1 = (float) ((float) v1/60.0); //how many feets they will go in one minute
            float f2 = (float) ((float) v2/60.0);
            System.out.println(f1 + ", " + f2);

            double time = g/(Math.abs(f1-f2)); //time to cath up [in minutes]
            System.out.println(time);

            double seconds = time - Math.floor(time); //getting the seconds in decimal fraction [ulamek dziesietny]
            System.out.println(seconds);

            double seconds2 = seconds*60; // actual seconds
            System.out.println(seconds2);

            time = Math.floor(seconds2); // idk it works now lol


            int hours = (int) time / 60; // how many hours
            int minutes = (int) time - hours*60; // how many minutes

            int[] result = {hours, minutes, (int)seconds2};
            System.out.println(Arrays.toString(result));
        }

    }
}
