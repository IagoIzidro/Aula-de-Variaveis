// Variáveis

import javax.sql.rowset.spi.SyncResolver;

public class App {
    public static void main(String[] args) throws Exception {
      // Variaveis que precia respeitar o +
      byte numeroPequeno = -127;
      short numeroShort = -32767;
      int numeroMaior = -2147483647;
      long numeroEnorme = -922337203685477000l;

      // Variaveis do tipo ponto Flutuante
       float peso = 78.7f;
       double pi = 3.1473295239589252935523;

      // Variaveis do tipo caractere
      char letra = '+'; 

      // Variavel booleano (True OU False) -> True (veradeiro) false (falso)
      boolean estouComFome = false;

      // Variavel do tipo String
      String texto = "Alguma frase";
      
      // Sysout imprimi uma variavel
      String nomecompleto; // Declarando 

      nomecompleto = "uzumaki Naruto"; // Inicializando a variavel

      System.out.println(numeroPequeno);// Usando a variavel
      System.out.println(numeroShort);
      System.out.println(numeroMaior);
      System.out.println(numeroEnorme);
      
    }
}
