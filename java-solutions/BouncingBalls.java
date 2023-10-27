package codewars;

public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
        System.out.println(h);
        System.out.println(bounce);
        System.out.println(window);
        int result = 1;
        if (h>0 && bounce>0 && bounce<1 && h>window) {
            double height = h;
            while (height*bounce>window) {
                result += 2;
                height *= bounce;
                System.out.println(height);
            }
            return result;
        }
        else return -1;
    }

    public static void main(String[] args) {
        bouncingBall(3, 0.66, 1.5);
    }
}
