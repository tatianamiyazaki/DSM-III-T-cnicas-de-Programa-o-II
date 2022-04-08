package Atividade01;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {
        double x = 0;
        double y = 0;

        //x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro ");

        x = entrada.nextInt();

        while (x != 1) {
            if (x % 2 == 0) {
                y = x / 2;               

            } else {
                y = 3 * x + 1;              
                
            }
            x = y;
            //JOptionPane.showMessageDialog(null, "y = " + y);
            System.out.println("y = " + y);      

        }

    }
}
