// Nesse programa vou fazer um sistema básico de menu Terminal para aprender sobre classes e objetos em java
// Classe em opsMenu.java. Lang: PT-BR
/* To Do:
 * - Adicionar os comandos listados em help. (FEITO)
 * - Criar o submenu "sobre". (FEITO)
 * - Criar uma forma do programa funcionar como um terminal e um comando de quit (FEITO)
 * - Criar a opçâo que permite o usuario consultar a data e hora (FEITO)
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
        String opHelp = new String("help"); // OBJETOS string das opções para comparar com o input
        String opRepo = new String("repo");
        String opBreak = new String("break");
        String opHora = new String("hora");
        String opSobre = new String("sobre");

        while (true) { // LOOP INFINITO para fazer com que o usuario sempre consiga digitar prompts
            System.out.print("-$> ");
            String input = System.console().readLine();

            // menu help: (nao usarei switch pois não funciona com objetos no java)
            if (input.equals(opHelp)) { // método .equals() compara 2 objetos
                menu.cmdHelp();
            } else if (input.equals(opRepo)) {
                menu.cmdRepo("https://github.com/Matheus-Assis05/Java-primeiro-projeto-terminal");
            } else if (input.equals(opBreak)) {
                break; // break para o loop.
            } else if (input.equals(opHora)) {
                menu.cmdHora();
            } else if (input.equals(opSobre)) {
                menu.cmdSobre();
            } else {
                System.out.println("Erro: Comando INVALIDO.");
            }
        }
    }
}