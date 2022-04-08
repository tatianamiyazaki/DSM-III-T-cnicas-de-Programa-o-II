package Atividade01;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Imprima a soma de 1 até 1000");
        int soma = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.println(soma += i);// mostra todas as somas            
        }
        System.out.println(soma);    // mostra apenas o resultado
    }
}
