import java.util.Scanner;
public class voting {
    public static boolean isEligible (int age){
        if(age>18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age : ");
        int age = sc.nextInt();
        System.out.println(isEligible(age));
    }
}
