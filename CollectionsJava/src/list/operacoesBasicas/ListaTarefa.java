package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private static List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao){
        tarefaList.add( new Tarefa(descricao));
    }


    public void removerTarefa (String descricao){
      List<Tarefa> tarefasParaRemover = new ArrayList<>();

      for(Tarefa t: tarefaList)
      {
        if(t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);        
        }
      }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public static int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de tarefas é " + obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        

        System.out.println("O número total de tarefas é " + obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de tarefas é " + obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
