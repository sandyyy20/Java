import java.util.Scanner;
public class compareString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("name1 : ");
        String name1 = sc.nextLine();
        System.out.print("name2 : ");
        String name2 = sc.nextLine();
        if(name1.equals(name2)){
            System.out.println("String is Equal");
        }else{
            System.out.println("String is not Equal");
        }
//        if(new String(name1) == new String(name2)) {
//            System.out.println("They are the same string");
//        } else {
//            System.out.println("They are different strings");
//        }

//        if(name1==name2){
//            System.out.println("String is equal");
//        }else{
//            System.out.println("String is not equal");
//        }
//

    }
}
