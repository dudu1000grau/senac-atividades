import java.util.Scanner;

public class cardapio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva  codigo dos itens desejados: ");
        int a = scan.nextInt();
        System.out.println("Escreva a quantia desejada: ");
        int b = scan.nextInt();
        float v;
        switch (a) {
            case (100):
             v = b * 1.10f;
            System.out.println("voce escolheu cachorro quente" + b + "quantidade, o valor pago sera de :" + v );
                
                break;
            case(101):
            v = b * 1.30f;
            System.out.println("voce escolheu bauru simples" + b + "quantidade, o valor pago sera de :" + v );

            break;

            case(102):
            v = b * 1.50f;
            System.out.println("voce escolheu bauru com ovo" + b + "quantidade, o valor pago sera de :" + v );

            break;

            case(103):
            v = b * 1.10f;
            System.out.println("voce escolheu hamburguer" + b + "quantidade, o valor pago sera de :" + v );

            break;

            case(104):
            v = b * 1.30f;
            System.out.println("voce escolheu cheeseburguer" + b + "quantidade, o valor pago sera de :" + v );

            break;

            case(105):
            v = b * 1.00f;
            System.out.println("voce escolheu refri" + b + "quantidade, o valor pago sera de :" + v );

            break;

            case(106):
            v = b * 2.00f;
            System.out.println("voce escolheu suco" + b + "quantidade, o valor pago sera de :" + v );






                
                

        
            default:
            System.out.println("Voce escolheu errado");
                break;
        }

    }
}
