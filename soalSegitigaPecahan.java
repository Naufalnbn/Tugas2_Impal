import java.util.Scanner;

public class soalSegitigaPecahan {

    static double nilaiMutlak(double x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    static double maksimum(double x, double y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    static boolean hampirSama(double x, double y) {
        return nilaiMutlak(x - y) <= 0.01 * maksimum(x, y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.print("Masukkan sisi a: ");
        a = input.nextDouble();
        System.out.print("Masukkan sisi b: ");
        b = input.nextDouble();
        System.out.print("Masukkan sisi c: ");
        c = input.nextDouble();

        double max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        double sum = a + b + c - max;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Tidak dapat membentuk segitiga");
        } 
        else if (max >= sum) {
            System.out.println("Tidak dapat membentuk segitiga");
        } 
        else if (hampirSama(a, b) && hampirSama(b, c)) {
            System.out.println("Segitiga Sama Sisi (Equilateral)");
        } 
        else if (hampirSama(a, b) || hampirSama(b, c) || hampirSama(a, c)) {
            System.out.println("Segitiga Sama Kaki (Isosceles)");
        } 
        else if (hampirSama(max * max, (a * a + b * b + c * c - max * max))) {
            System.out.println("Segitiga Siku-Siku (Right Triangle)");
        } 
        else {
            System.out.println("Segitiga Bebas");
        }

        input.close();
    }
}
