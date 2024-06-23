public class ConversorDeRadianosParaGraus {

    
    public double converter(double radianos) {
        return Math.toDegrees(radianos);
    }

    public static void main(String[] args) {
        
        ConversorDeRadianosParaGraus conversor = new ConversorDeRadianosParaGraus();

       
        double radianos = 1.0;
        double graus = conversor.converter(radianos);

        System.out.println(radianos + " radianos é igual a " + graus + " graus.");
    }
}
