import java.util.Scanner;
public class parseInt {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int number = Integer.parseInt(str);
//        System.out.println(number);
        int number = sc.nextInt();
        String str = Integer.toString(number);
        System.out.println(str);
    }
}
