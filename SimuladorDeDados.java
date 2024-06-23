import java.util.Random;

public class SimuladorDeDados {


    public int jogarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1; 
    }

    public static void main(String[] args) {
        SimuladorDeDados simulador = new SimuladorDeDados();

       
        int jogada1 = simulador.jogarDado();
        int jogada2 = simulador.jogarDado();
        int jogada3 = simulador.jogarDado();

      
        int soma = jogada1 + jogada2 + jogada3;

       
        System.out.println("Valores das jogadas: " + jogada1 + ", " + jogada2 + ", " + jogada3);
        System.out.println("Soma dos valores obtidos: " + soma);
    }
}
