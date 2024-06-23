import java.util.Scanner;

public class CalculadoraDePotencia {


    public double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

     
        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

   
        CalculadoraDePotencia calculadora = new CalculadoraDePotencia();

        double resultado = calculadora.calcularPotencia(base, expoente);

    
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
        
   
        scanner.close();
    }
}
