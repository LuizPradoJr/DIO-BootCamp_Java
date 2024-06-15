package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.Comportamento;
import gof.strategy.ComportamentoAgressivo;
import gof.strategy.ComportamentoDefensivo;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);


         //Strategy
         Comportamento defensivo = new ComportamentoDefensivo();
         Comportamento normal = new ComportamentoNormal();
         Comportamento agressivo = new ComportamentoAgressivo();

         Robo robo = new Robo();

         robo.setStrategy(normal);
         robo.mover();
         robo.mover();
         
         robo.setStrategy(agressivo);
         robo.mover();
         robo.mover();

         robo.setStrategy(defensivo);
         robo.mover();
         robo.mover();


   //Facade

   Facade facade = new Facade();
   facade.migrarCliente("Luiz", "22210-080");



    }

   

}
