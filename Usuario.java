public class Usuario {
    
     int numero_ID;
     String nome;
     String email;
     String senha;
     
     


     //métodos getters
     public int getNumero_ID()
     {
        return this.numero_ID;
     }

     public String getNome()
     {
        return this.nome;
     }

      public String getEmail()
     {
        return this.email;
     }

      public String getSenha()
     {
        return this.senha;
     }
     
     //métodos setters
     public void setNumero_ID(int ID_recebido)
     {
        this.numero_ID = ID_recebido;
     }

     public void setNome(String nome_recebido)
     { 
        this.nome = nome_recebido;
     }

     public void setEmail(String email_recebido)
     {
        this.email = email_recebido;
     }

     public void setSenha(String senha_recebida)
     {
        this.senha = senha_recebida;
     }
}