import java.util.Scanner;

/**
 * @author Max
 * */
public class Main {
    public static void main(String[] args) {
        Fibon num = new Fibon();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть порядковий номер числа Фібоначчі : ");
        int n = scan.nextInt();
        num.nFibon(n);
        System.out.printf("\nЧисло Фібоначчі під номером %d : %d", n, num.cur);
        if (num.check(n, num.cur))
            System.out.printf("\nНерівність Fn < 1.75^%d (%f) справджується ", n , Math.pow(1.75, n));
        else
            System.out.printf("\nНерівність Fn < 1.75^%d (%f) не справджується ", n , Math.pow(1.75, n));
    }
}