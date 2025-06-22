import java.util.Scanner;
public class commondivisor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while(n!=m){
            if(n>m){
                n= n-m;
            }else{
                m=m-n;
            }
        }
        System.out.println("common divisor is : "+m);
    }
}
