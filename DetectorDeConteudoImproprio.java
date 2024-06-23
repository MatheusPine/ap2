import java.util.Scanner;

public class DetectorDeConteudoImproprio {


    public String verificarConteudo(String frase) {

        String fraseMinuscula = frase.toLowerCase();

        if (fraseMinuscula.contains("sexo") || fraseMinuscula.contains("sexual")) {
            return "conteúdo impróprio";
        } else {
            return "conteúdo liberado";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        DetectorDeConteudoImproprio detector = new DetectorDeConteudoImproprio();


        String resultado = detector.verificarConteudo(frase);

        System.out.println(resultado);

        
        scanner.close();
    }
}
