// hello world program
class hello {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}


// print pattern
class pattern{
    public static void main(String[]args){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}
//sum two numbers
class add{
    public static void main(String[] args){
        String name = "sandeep tyagi";
        int a = 10;
        int b = 10;
        int sum = a+b;
        int c = 20;
        int d = 10;
        int ans = (a*b)/(c-d);
        int diff = d-c;
        System.out.println(diff);
        System.out.println(ans);
        System.out.println(sum);
        System.out.print(name);

    }
}

//user input program
import java.util.*;
class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name =");
        String name = sc.nextLine();
        System.out.print("Enter age =");
        int age = sc.nextInt();
        System.out.print("Enter a =");
        int a = sc.nextInt();
        System.out.print("Enter b =");
        int b = sc.nextInt();
        System.out.print("sum is =");
        int sum = a + b;
        System.out.println(sum);


    }
}

class areaofcircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius =");
        int radius = sc.nextInt();
        System.out.print("Area of Circle =");
        double area = radius*radius*3.14;
        System.out.print(area);
    }
}

class Table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a =");
        int a= sc.nextInt();
        System.out.println(a*1);
        System.out.println(a*2);
        System.out.println(a*3);
        System.out.println(a*4);
        System.out.println(a*5);
        System.out.println(a*6);
        System.out.println(a*7);
        System.out.println(a*8);
        System.out.println(a*9);
        System.out.println(a*10);

    }
}
