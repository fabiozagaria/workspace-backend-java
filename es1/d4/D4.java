package es1.d4;

import java.util.Scanner;

/*

Scrivere un programma che chieda all'utente di digitare due numeri interi, legga i due numeri e ne visualizzi la somma, il prodotto , la differenza e il quoziente.

*/

public class D4 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Primo Numero: ");
    int primoNum = sc.nextInt();

    System.out.print("Secondo Numero: ");
    int secondoNum = sc.nextInt();

    //somma
    int somma = primoNum + secondoNum;

    System.out.printf("La somma dei due numeri è %d\n", somma);
     
    //prodotto
    int prodotto = primoNum * secondoNum;

    System.out.printf("Il prodotto dei due numeri è %d\n", prodotto);

    //differenza e quoziente

    int differenza;
    double quoziente;

    if (primoNum < secondoNum) {
      differenza = secondoNum - primoNum;

      quoziente = (double) secondoNum / primoNum;
    } else {
      differenza = primoNum - secondoNum;

      quoziente = (double) primoNum / secondoNum;
    }

    System.out.printf("La differenza e il quoziente tra i due numeri è %d (diff) e %.2f (quoz)\n", differenza, quoziente);

    System.out.printf("In sintesi: \n Somma: %d \n Prodotto: %d \n Differenza: %d \n Quoziente: %.2f\n", somma, prodotto, differenza, quoziente);

    sc.close();
    
  }
  
}
