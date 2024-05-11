public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " +  smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar(); 

        System.out.println("Novo Status TV Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.out.println("Canal atual : " +  smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual : " +  smartTv.canal);

        
        smartTv.mudarCanal(100);
        System.out.println("Canal atual : " +  smartTv.canal);
     
    }
}
