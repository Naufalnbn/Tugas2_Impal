import java.util.Scanner;

public class soalSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Masukkan sisi a: ");
        a = input.nextInt();
        System.out.print("Masukkan sisi b: ");
        b = input.nextInt();
        System.out.print("Masukkan sisi c: ");
        c = input.nextInt();

        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        int sum = a + b + c - max;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Tidak dapat membentuk segitiga");
        } 
        else if (max >= sum) {
            System.out.println("Tidak dapat membentuk segitiga");
        } 
        else if (a == b && b == c) {
            System.out.println("Segitiga Sama Sisi (Equilateral)");
        } 
        else if (a == b || b == c || a == c) {
            System.out.println("Segitiga Sama Kaki (Isosceles)");
        } 
        else if (max * max == (a * a + b * b + c * c - max * max)) {
            System.out.println("Segitiga Siku-Siku (Right Triangle)");
        } 
        else {
            System.out.println("Segitiga Bebas");
        }

        input.close();
    }
}
