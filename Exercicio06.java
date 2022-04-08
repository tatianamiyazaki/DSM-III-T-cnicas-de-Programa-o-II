package Atividade01;

public class Exercicio06 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
      
        System.out.println("FIBONACCI");
        for (int i = 0; i < 12; i++) {
            
            System.out.println(num1);            
        
            num1 = num1 + num2;
            num2 = num1 - num2;
            
        }
    }
    
}
