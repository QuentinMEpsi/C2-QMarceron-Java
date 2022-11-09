import java.util.Scanner;

public class exerciceTest {

    public static void main(String[] args) {

        exercice1();
        exercice2();
        exercice3();
        exercice4();
        exercice5();
        exercice6();
        exercice7();
        exercice8();
        exercice9();
    }

    public static void exercice1() {
        // Écrivez un programme Java pour afficher le message « Hello World » à l’écran.
        String value = "Hello World !";
        System.out.println(value);
    }

    public static void exercice2() {
        // Écrivez un programme Java pour afficher la somme de deux nombres.
        int value = 2+3;
        System.out.println(value);
    }

    public static void exercice3() {
        // Écrivez un programme Java pour diviser deux nombres et affichez le résultat sur l’écran.
        int value = 4/2;
        System.out.println(value);
    }

    public static void exercice4() {
        // Écrivez un programme Java qui prend deux nombres en entrée et affichez le produit de deux nombres.
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer un nombre : ");
        int nbr1 = sc.nextInt();
        System.out.println("Entrer un deuxième nombre : ");
        int nbr2 = sc.nextInt();

        int value = nbr1 * nbr2;
        System.out.println(value);
    }

    public static void exercice5() {
        // Écrivez un programme Java qui prend un nombre en entrée et affiche sa table de multiplication jusqu’à 10.
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        int nbr1 = sc.nextInt();

        for (int cpt = 1; cpt <= 10; cpt++) {
            System.out.println(nbr1 + " * " + cpt + " = " + (nbr1 * cpt));
        }
    }

    public static void exercice6() {
        // Écrivez un programme Java pour afficher l’aire et le périmètre d’un cercle
        Scanner sc = new Scanner(System.in);
        System.out.println("Rayon du cercle : ");
        double rayon = 4.2;

        double perimeter = 2 * Math.PI * rayon;
        double aire = Math.PI * rayon * rayon;

        System.out.println("Le périmètre est de : " + perimeter);
        System.out.println("L'aire est de : " + aire);
    }

    public static void exercice7() {
        // Écrivez un programme Java qui prend trois nombres en entrée pour calculer et afficher la moyenne des nombres.
        Scanner sc = new Scanner(System.in);
        System.out.println("Premier Nombre : ");
        int nbr1 = sc.nextInt();
        System.out.println("Deuxième Nombre : ");
        int nbr2 = sc.nextInt();
        System.out.println("Troisième Nombre : ");
        int nbr3 = sc.nextInt();

        float moyenne = (nbr1 + nbr3 + nbr2) / 3;
        System.out.println("La moyenne : " + moyenne);
    }

    public static void exercice8() {
        // Écrivez un programme Java pour permuter deux variables.
        Scanner sc = new Scanner(System.in);
        System.out.println("A : ");
        int a = sc.nextInt();
        System.out.println("B : ");
        int b = sc.nextInt();

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }

    public static void exercice9() {
        // Écrivez une méthode qui calcule la factorielle d’un nombre donné.
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre : ");
        int n = sc.nextInt();
        int factorial = n;

        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        System.out.println("Factoriel : " + factorial);
    }
}