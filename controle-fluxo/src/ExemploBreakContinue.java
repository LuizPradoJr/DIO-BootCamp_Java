public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x ++){
           
            if (x ==3)
            break;
            System.out.println("Contando carneirinhos "+ x);
        }

        for (int x = 1; x <= 5; x ++){
           
            if (x ==3)
            continue;
            System.out.println("Contando carneirinhos "+ x);
        }
       
    }
    
}
