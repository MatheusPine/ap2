import java.util.Scanner;

public class AjusteDePrecosFarmacia {

   
    public double ajustarPreco(double preco) {
        double precoAjustado = preco * 1.12; // 
        return Math.round(precoAjustado * 100.0) / 100.0; // 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AjusteDePrecosFarmacia ajusteDePrecos = new AjusteDePrecosFarmacia();

        while (true) {
         
            System.out.print("Digite o preço do produto (0 para encerrar): ");
            double preco = scanner.nextDouble();

          
            if (preco == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }

            double precoAjustado = ajusteDePrecos.ajustarPreco(preco);
            System.out.println("Preço ajustado: " + precoAjustado);
        }

        
        scanner.close();
    }
}
