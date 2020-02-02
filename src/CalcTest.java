import java.util.Locale;
import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.GERMAN);
        System.out.println("Wprowadź pierwszą liczbę: ");
        double numb1 = scan.nextDouble();
        System.out.println("Wprowadź drugą liczbę: ");
        double numb2 = scan.nextDouble();
        System.out.println(calculator.calc(numb1, numb2));
        scan.close();


    }
}