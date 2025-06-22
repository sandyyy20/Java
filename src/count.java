import java.util.Scanner;
public class count {
    public static void main(String[]args) {
        int positive = 0, negative = 0, zeroes = 0;
        System.out.println("press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input==1){
        System.out.println("Enter ur number : ");
        int m = sc.nextInt();
        if (m > 0) {
            positive++;
        } else if (m < 0) {
            negative++;
        } else {
            zeroes++;
        }
        System.out.println("press 1 to continue & 0 to stop");
        input = sc.nextInt();
        }
        System.out.println("positive : "+positive);
        System.out.println("negative : "+negative);
        System.out.println("zeroes : "+zeroes);
    }
}
