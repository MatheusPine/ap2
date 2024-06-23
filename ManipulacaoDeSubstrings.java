import java.util.Scanner;

public class ManipulacaoDeSubstrings {

 
    public String obterSubstringSemUltimoCaractere(String input) {
        if (input == null || input.length() <= 1) {
          
            return "";
        }
        return input.substring(0, input.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        
        ManipulacaoDeSubstrings manipulacao = new ManipulacaoDeSubstrings();

       
        String resultado = manipulacao.obterSubstringSemUltimoCaractere(input);

       
        System.out.println("Substring sem o último caractere: " + resultado);

       
        scanner.close();
    }
}
