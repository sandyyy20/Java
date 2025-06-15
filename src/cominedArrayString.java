import java.util.Scanner;
public class cominedArrayString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("size : ");
        int size = sc.nextInt();
        int length = 0;
        String[] str = new String[size];
        for(int i=0;i<size;i++){
            str[i]=sc.nextLine();
            length +=str[i].length();
        }
        System.out.println(length);
    }
}
