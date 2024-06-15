package gof.strategy;

public class Robo {

    private Comportamento comportamentoStrategy;

    public void setStrategy(Comportamento comportamentoStrategy) {
        this.comportamentoStrategy = comportamentoStrategy;
    }
    
    public void mover(){
        comportamentoStrategy.mover();
    }
}
