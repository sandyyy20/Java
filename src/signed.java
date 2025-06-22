public class signed {
    public static void main(String[] args) {
        int in1 = -34;
        int in2 = 43;
        System.out.println("Signed integers: " + in1 + ", " + in2);
        int compare = Integer.compare(in1, in2);
        System.out.println("Result of comparing signed numbers: " + compare);
        int compare1 = Integer.compare(in1, in2);
        System.out.println("Result of comparing unsigned numbers: " + compare1);
    }
}
