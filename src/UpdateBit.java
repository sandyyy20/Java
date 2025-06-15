import java.util.Scanner;
public class UpdateBit {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Operation : ");
        int oper = sc.nextInt();
        System.out.print("N : ");
        int n = sc.nextInt();
        System.out.print("Position : ");
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        if (oper == 1) {
            int number = bitmask | n;
            System.out.println(number);
        }else{
            int newbitmask = ~(bitmask);
            int number = newbitmask & n;
            System.out.println(number);
        }

    }
}
