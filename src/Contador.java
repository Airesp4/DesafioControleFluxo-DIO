import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = teclado.nextInt();

        teclado.close();
        contar(parametroUm, parametroDois);
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int cont = parametroDois - parametroUm;

        for (int i = 0; i < cont; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}
