import java.util.Scanner;
public class average {
    public static void main(String args []){
        Scanner sc =  new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        double sum ;
        sum = a+b+c;
        System.out.print("Average 0f numbers is : "+sum/3);
    }
}
