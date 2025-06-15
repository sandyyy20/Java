import java.util.Scanner;
public class ClearBit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        System.out.print("Position : ");
        int pos =  sc.nextInt();
        int bitmask = 1<<pos;
        int newbitmask = ~(bitmask);
        int newnumber = newbitmask & n;
        System.out.println(newnumber);
    }
}
