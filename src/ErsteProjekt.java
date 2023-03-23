public class ErsteProjekt {
    public static void main(String[] args) {
        int a; // Deklaration der Variable a
        int b;

        a = 9; // Initialisierung (erste Wertzuweisung)
        b = 15;

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
