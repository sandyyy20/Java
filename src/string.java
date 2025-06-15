import java.util.Scanner;
public class string {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("name : ");
        String name = sc.nextLine();
        System.out.print("last name : ");
        String lastname = sc.nextLine();
        String fullname = name + lastname;
        System.out.println(fullname);
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

    }
}
