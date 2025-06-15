import java.util.*;
public class functions {
//    public static int CalculateSum(int a,int b){
//        return a+b;
//    }
    public static double CalculateProduct(double a,double b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Product of 2 numbers :"+CalculateProduct (a,b));
    }
}
