package exercice1.java;

import java.util.Scanner;

import java.util.InputMismatchException;

public class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entrez a : ");
            int a = sc.nextInt();

            System.out.print("Entrez b : ");
            int b = sc.nextInt();

            int resultat = Calcul.Diviser(a, b);
            System.out.println("Résultat = " + resultat);

        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Erreur : saisie nombre invalide ");
        }
    }
}