import java.util.Scanner;
public class Main {
    /**
     *Foram usadas 3 variaveis: String, Char e Scanner
     * Essa função é responsavel por ler o nome
     *@param nome: ler o nome
     * Essa função é responsavel por ler o sexo
     * @param sexo: ler o sexo
     * Essa função é responsavel por ler o estado civil
     * @param estadoc: ler o estado civil
     * @return
     *
     */
    documentação
    public static void main(String[] args) {
        String nome;
        char sexo;
        String estadoc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu sexo: ");
        sexo = sc.next().charAt(0);
        System.out.println("Digite seu estado civil: ");
        estadoc = sc.next();
        if (sexo == 'F' && estadoc.equals("casada")) {
            System.out.println("Digite quantos anos de casada: ");
        } else {
            System.out.println("oi");
        }
    }
}