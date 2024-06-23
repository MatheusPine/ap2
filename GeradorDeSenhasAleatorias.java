import java.util.Random;

public class GeradorDeSenhasAleatorias {

  
    public String gerarSenhaAleatoria() {
        Random random = new Random();
        
     
        int comprimento = 5 + random.nextInt(6);
        
    
        StringBuilder senha = new StringBuilder(comprimento);
        
    
        for (int i = 0; i < comprimento; i++) {
            int digito = random.nextInt(10); 
            senha.append(digito);
        }
        
        return senha.toString();
    }

    public static void main(String[] args) {
       
        GeradorDeSenhasAleatorias gerador = new GeradorDeSenhasAleatorias();
        
      
        String senha = gerador.gerarSenhaAleatoria();
        
        
        System.out.println("Senha aleatória gerada: " + senha);
    }
}
