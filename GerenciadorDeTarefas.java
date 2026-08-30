import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorDeTarefas{

   public static void Teste(){
    Medio_Prazo tarefaTeste = new Medio_Prazo(1, "A BOLONHESAAA", "Cozinhe uma bolonhesa capaz de parar O MUNDO",  LocalDate.parse("2022-09-12"), LocalDate.parse("2023-09-20"), false, true);
    Medio_Prazo tarefaTeste2 = new Medio_Prazo(2, "O SUQUINHO", "Faça um suco capaz de te mandar para A LUA",  LocalDate.parse("2022-09-12"), LocalDate.parse("2023-09-20"), false, false);
    ArrayList<Medio_Prazo> lista = new ArrayList<>();
    lista.add(tarefaTeste);
    lista.add(tarefaTeste2);
    System.out.println(lista);
   }

   public static void VerificaEstado(Tarefas tarefa)
   {
      if(tarefa.estaConcluida)
         {
            tarefa.estadoTarefa = "Concluida";
         }
      else if (tarefa.estaEmProgresso)
      {
         tarefa.estadoTarefa = "Em progresso";
      }
      else tarefa.estadoTarefa = "Nao iniciada";
   }
}