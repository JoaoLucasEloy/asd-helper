import java.time.LocalDate;
import java.time.Period;

public class Curto_Prazo extends Tarefas{

  public  Curto_Prazo(int prioridade, String nomeTarefa, String descricaoTarefa, LocalDate inicioTarefa, LocalDate prazoTarefa, boolean estaConcluida, boolean estaEmProgresso)
  {
    Period periodoTarefa = Period.between(inicioTarefa, prazoTarefa);

    if(periodoTarefa.getMonths() > 1)
      throw new IllegalArgumentException("Periodo de tarefa muito longo!"); 
    super(prioridade, nomeTarefa, descricaoTarefa, inicioTarefa, prazoTarefa, estaConcluida, estaEmProgresso);
  } 

}