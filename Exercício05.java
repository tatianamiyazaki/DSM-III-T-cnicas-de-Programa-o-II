package Atividade01;

public class Exercício05 {
    public static void main(String[] args) {
        long fatorial20 = 1;
        System.out.println("--- FATORIAL DE 20 ---");
        for (int i = 1; i <= 20; i++) {
            fatorial20 = fatorial20 * i;
            System.out.println("O fatorial de " + i + " é = " + fatorial20);            
        }

        long fatorial30 = 1;
        System.out.println("--- FATORIAL DE 30 ---");
        for (int i = 1; i <= 30; i++) {
            fatorial30 = fatorial30 * i;
            System.out.println("O fatorial de " + i + " é = " + fatorial30);            
        }

        long fatorial40 = 1;
        System.out.println("--- FATORIAL DE 40 ---");
        for (int i = 1; i <= 40; i++) {
            fatorial40 = fatorial40 * i;
            System.out.println("O fatorial de " + i + " é = " + fatorial40);            
        }
    }
    
}
