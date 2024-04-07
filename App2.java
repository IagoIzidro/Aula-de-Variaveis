package Variáveis;

public class App2 {
    public static void main(String[] args) {
        // Sysout imprimi uma variavel
      String nomecompleto; // Declarando 
      nomecompleto = "uzumaki Naruto"; // Inicializando a variavel
      System.out.println(nomecompleto);// Usando a variavel

      String filme = "Vingadores"; // %s
      int anoLancamento = 2015; // %d
      int duracao = 240; // %d
      float notaCritica = 8.7f; // %f
      char letraInicial = 'V'; // %c
      boolean foiSucesso = true; // %b

      System.out.println(filme);
      System.out.println(anoLancamento);
      System.out.println(duracao);
      System.out.println(notaCritica);
      System.out.println(letraInicial);
      System.out.println(foiSucesso);
      
      System.err.println("O filme " + filme);
      System.out.println("Ano de Lançamento: " + anoLancamento);
      System.out.println("nota Média: " + notaCritica);
      System.out.println("Letra Inicial: " + letraInicial);
      System.out.println("Foi um sucesso? " + foiSucesso);

      // O Filme <filme> lançado em <ano> tem uma duração de <duracao> minutos.
      System.out.println("O Filme " + filme + " lançado em " + anoLancamento + " tem uma duração de " + duracao + " minutos");
      
      System.out.format("O Filme %s lançado em %d tem uma duração de %d minutos.", filme, anoLancamento, duracao);
      
      String canal = "Academia do estudo";
      String mensagem = "Estou estudando";
      
      String mensagemFinal = String.format("%s %s", mensagem, canal);
      System.out.println(mensagemFinal);
    }
}