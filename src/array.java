import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("size is : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Number is :  ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("x is : ");
        int x = sc.nextInt();
        for(int i=0;i<size;i++){
            if (numbers[i]==x){
            System.out.println("Index value is : "+i);
        }
        }
    }
}
