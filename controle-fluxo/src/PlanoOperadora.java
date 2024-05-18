public class PlanoOperadora {
    public static void main(String[] args) throws Exception {
            
            String sigla = "T";

            switch(sigla){

                case "B":{
                    System.out.println("100 minutos de ligação");
                    break;
                }

                case "M":{
                    System.out.println("100 minutos de ligação");
                    System.out.println("WhatsApp e Instagram Grátis");
                    break;
                }

                case "T":{
                    System.out.println("100 minutos de ligação");
                    System.out.println("WhatsApp e Instagram Grátis");
                    System.out.println("5Gb YouTube");
                    break;
                }

                default:{
                    System.out.println("INDEFINIDO");
                }

            }
    }
}
