package es1.d7;

import java.util.Scanner;

/*
Scrivere un'applicazione che legga un numero intero e determini se è pari o dispari.
*/

public class D7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Vediamo se il numero x che inserisci è pari o dispari\nx: ");
    int valueX = sc.nextInt();

    if (valueX % 2 == 0) {
      System.out.println("x è pari");
    } else {
      System.out.println("x è dispari");
    }
    
    sc.close();
  }
  
}
