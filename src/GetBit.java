import java.util.Scanner;
public class GetBit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        System.out.print("pos : ");
        int pos = sc.nextInt();
        //int bitmask=1<<pos;     // shift left to position by 1
        int bitmask=2>>pos;     // shift right to position by 2
        if((bitmask & n)==0){
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one");
        }

    }
}
