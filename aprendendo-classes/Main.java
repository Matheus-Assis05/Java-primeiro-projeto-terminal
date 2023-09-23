// Nesse programa vou fazer um sistema básico de menu Terminal para aprender sobre classes e objetos em java
// Classe em opsMenu.java. Lang: PT-BR
/* To Do:
 * - Adicionar os comandos listados em help.
 * - Criar o submenu "sobre".
 */
public class Main {
    public static void main(String args[]) {
        System.out.println("***************************************************************************************\n" +
                "Desenvolvido por Matheus Martins usando Java 21. Obviamente Direitos nao Resevados\n" +
                "Terminal Simples em java - 23/09/2023\n" +
                "***************************************************************************************\n\n" +
                "  digite 'help' para ver a lista de comandos\n");

        // Criando o objeto da classe (chamando a classe no Main)
        opsMenu menu = new opsMenu();

        // Input para o usuário digitar:
        String opHelp = new String("help"); // String da opção help precisa ser um OBJETO STRING, já que o input do
                                            // usuário é um objeto
        System.out.print("-$> ");
        String input = System.console().readLine();

        // menu help:
        if (input.equals(opHelp)) { // método .equals() compara 2 objetos
            menu.cmdHelp();
        } else {
            System.out.println("ERRO");
        }

    }
}