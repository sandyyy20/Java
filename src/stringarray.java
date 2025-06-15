import java.util.Scanner;
public class stringarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("size is :");
        int size = sc.nextInt();
        String[] names = new String[size];
        for(int i=0;i<size;i++){
            names[i] = sc.nextLine();
            System.out.print("Name is : ");
        }
        for (int i=0 ;i<names.length;i++){
            System.out.println("name " + (i+1) +" is : " + names[i]);

        }
    }
}
