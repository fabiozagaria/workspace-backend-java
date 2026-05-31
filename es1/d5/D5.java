package es1.d5;

import java.util.Scanner;

/*
Scrivere un programma che chiede all'utente di inserire due numeri interi e ne determina chi è il più grande è visualizzi quel numero seguito da "è il più grande". Se i numeri sono uguali visualizzi il messaggio "i numeri sono uguali".
*/

public class D5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Inserisci x: ");
    int valueX = sc.nextInt();

    System.out.println("Inserisci y: ");
    int valueY = sc.nextInt();

    if (valueX == valueY) {
      System.out.println("Numeri interi uguali");
    } else if (valueX > valueY) {
      System.out.printf("X (%d) è piu grande", valueX);
    } else {
      System.out.printf("Y (%d) è piu grande" , valueY);
    }

    sc.close();



  }
  
}
