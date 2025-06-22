import java.util.Scanner;
public class circumfernceofcircle {
    public static double CircumfernceofCircle(double r){
        return 2*Math.PI*r;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("radius : ");
        double r = sc.nextDouble();
        System.out.println("answer : "+CircumfernceofCircle(r));
    }
}
