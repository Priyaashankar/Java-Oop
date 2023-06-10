public class Recursive {

    public static void main(String args[]) {
        NatPrint(15);
    }

    public static void NatPrint(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.print(n + " ");
            NatPrint(n - 1);
        }
    }
}
