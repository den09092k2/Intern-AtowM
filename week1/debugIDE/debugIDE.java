import java.util.Scanner;

public class debugIDE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = tich(x,y);

        System.out.println(z);

    }

    public static double tich(double x, double y){
        return x*y;
    }

}
