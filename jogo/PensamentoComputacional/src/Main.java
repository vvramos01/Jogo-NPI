import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valorA;
        int valorB;
        int valorC;
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o valor de A: ");
        valorA = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        valorB = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        valorC = sc.nextInt();
        if (valorA == 0) {
            System.out.println("A equação não e do segundo grau");
        }else{
            double delta = Math.pow(valorB, 2)-4*valorA*valorB;
            if(delta < 0){
                System.out.println("a equaçao nao possui raizes reais");
               } else{
                if (delta == 0) {
                    System.out.println("a equaçao possui apenas uma raiz");
                }else{
                    System.out.println("a equação possui duas raízes reais");
                }
            }
        }


    }}

