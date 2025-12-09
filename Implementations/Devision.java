package Implementations;
public class Devision {
    int fDivisor = 15;
    int sDivisor = 0;

    public void divide() {
        try {
            int res = fDivisor / sDivisor;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Devision division = new Devision();
        division.divide();
    }
}
