import java.util.Scanner;

public class ErsteProjekt {
    public static void main(String[] args) {
        int a; // Deklaration der Variable a
        int b;

        Scanner eingabe = new Scanner(System.in);

        System.out.print("Bitte Wert für 'a' eingeben: ");
        a = eingabe.nextInt();

        System.out.print("Bitte Wert für 'b' eingeben: ");
        b = eingabe.nextInt();

        // Euklid einfügen!
        while (a != b) {

            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }

        System.out.println( "a = " + a );
    }
}
