import java.util.Scanner;

public class Media {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1 ;
        int num2 ; 
        int num3 ;
        int Media;

        System.out.println("Digite o primeiro numero ");
        num1 = entrada.nextInt();

        System.out.println("Digite o segundo numero ");
        num2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero ");
        num3 = entrada.nextInt();

        Media = num1 + num2 + num3/3;

        System.out.println("A media é igual a " + Media);

    }
}
