//import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Tarefas
{
    /*ID associado a um usuario, utilizado para associar as tarefas salvas ao usuario que as registrou.  
    int ID_Associado;*/

    protected int prioridade;
    protected String nomeTarefa, descricaoTarefa, estadoTarefa;
    protected LocalDate inicioTarefa, prazoTarefa;
    protected boolean estaConcluida, estaEmProgresso; 

    public Tarefas( int prioridade, String nomeTarefa, String descricaoTarefa, LocalDate inicioTarefa,LocalDate prazoTarefa, boolean estaConcluida,boolean estaEmProgresso){
       this.prioridade = prioridade;
       this.nomeTarefa = nomeTarefa;
       this.descricaoTarefa = descricaoTarefa;
       this.inicioTarefa = inicioTarefa;
       this.prazoTarefa = prazoTarefa;
       this.estaConcluida = estaConcluida;
       this.estaEmProgresso = estaEmProgresso;
    }

    @Override
    public String toString(){
   GerenciadorDeTarefas.VerificaEstado(this);
   return "Prioridade: " + prioridade + " Nome: " + nomeTarefa + " Descricao: " + descricaoTarefa + " Estado: "  + estadoTarefa + "\n";
  }
} 