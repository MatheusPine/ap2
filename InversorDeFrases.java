import java.util.Scanner;

public class InversorDeFrases {

  
    public String inverterFrase(String frase) {
       
        String fraseSemEspacos = frase.replaceAll("\\s", "");
        

        StringBuilder inversor = new StringBuilder(fraseSemEspacos);
        
        
        inversor.reverse();
        
        
        return inversor.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        
        InversorDeFrases inversor = new InversorDeFrases();

       
        String resultado = inversor.inverterFrase(frase);

        System.out.println("Frase invertida sem espaços: " + resultado);

       
        scanner.close();
    }
}
