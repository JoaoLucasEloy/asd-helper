import java.time.LocalDate;
import java.time.Period;

public class Longo_Prazo extends Tarefas{

  public  Longo_Prazo(int prioridade, String nomeTarefa, String descricaoTarefa, LocalDate inicioTarefa, LocalDate prazoTarefa, boolean estaConcluida, boolean estaEmProgresso)
  {
    Period periodoTarefa = Period.between(inicioTarefa, prazoTarefa);

    if(periodoTarefa.getYears() <= 1)
      throw new IllegalArgumentException("Periodo de tarefa muito curto!"); 
    super(prioridade, nomeTarefa, descricaoTarefa, inicioTarefa, prazoTarefa, estaConcluida, estaEmProgresso);
  } 

}