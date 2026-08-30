import java.time.LocalDate;
import java.time.Period;

public class Medio_Prazo extends Tarefas{

  public Medio_Prazo(int prioridade, String nomeTarefa, String descricaoTarefa, LocalDate inicioTarefa, LocalDate prazoTarefa, boolean estaConcluida, boolean estaEmProgresso)
  {
    Period periodoTarefa = Period.between(inicioTarefa, prazoTarefa);

    if((periodoTarefa.getMonths() < 1) && (periodoTarefa.getYears() < 1))
      throw new IllegalArgumentException("Periodo de tarefa muito curto!");
    else if(periodoTarefa.getYears() > 1)
      throw new IllegalArgumentException("Periodo de tarefa muito longo!"); 
    super(prioridade, nomeTarefa, descricaoTarefa, inicioTarefa, prazoTarefa, estaConcluida, estaEmProgresso);
  } 

}