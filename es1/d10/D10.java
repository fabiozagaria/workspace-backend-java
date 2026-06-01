package es1.d10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Scrivere un'applicazione che dichiara due numeri interi e li inizializza a un valore a tua scelta ad esempio
            int num1=3; 
            int num2=5;
        
e ne scambi i valori di modo che alla fine num1 abbia il valore di num2 (5 nell'esempio) e num2 quello di num1 (valore 3 nell'esempio).
*/

public class D10 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("int x: ");
      int valueX = sc.nextInt();

      System.out.print("int y: ");
      int valueY = sc.nextInt();

      
      int input = JOptionPane.showConfirmDialog(null,
          "Invertiamo i valori di X e Y??",
          "Conferma",
          JOptionPane.YES_NO_OPTION);

      if (input == JOptionPane.YES_OPTION) {
          int cambio = valueX;
          valueX = valueY;
          valueY = cambio;
          JOptionPane.showMessageDialog(null,
              "Valori invertiti:\nX = " + valueX + "\nY = " + valueY,
              "Risultato",
              JOptionPane.INFORMATION_MESSAGE);
      }

    }
}
