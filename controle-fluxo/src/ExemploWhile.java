import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        
        double mesada = 50.0;
        int i = 0;

        while (mesada > 0) {
            double valordoce = valorAleatorio();

            System.out.println("doce custa" + valordoce);
            
            if (valordoce > mesada)
            {
                valordoce = mesada;
            }

            mesada = mesada - valordoce;
            
            System.out.println("valor doce:" + i + " "+ valordoce);   
            System.out.println("mesada restante" + mesada);   
            i++;
        }
        System.out.println("foram comprados " + i + " doces.");  

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

}
