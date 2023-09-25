// Nesse programa vou fazer um sistema básico de menu Terminal para aprender sobre classes e objetos em java
// Classe em opsMenu.java. Lang: PT-BR
/* To Do:
 * - Adicionar os comandos listados em help.
 * - Criar o submenu "sobre".
 * - Criar uma forma do programa funcionar como um terminal e um comando de quit (FEITO)
 */
import java.awt.*; //importando AWT para usar seus comandos, abrindo uma url no browser padrao
import java.io.IOException;
import java.net.URI;

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
        String opHelp = new String("help"); //OBJETOS string das opções para comparar com o input
        String opRepo = new String("repo");
        String opBreak = new String("break");

        while(true){ //LOOP INFINITO para fazer com que o usuario sempre consiga digitar prompts
        System.out.print("-$> "); 
        String input = System.console().readLine();

        // menu help: (nao usarei switch pois não funciona com objetos no java)
        if (input.equals(opHelp)) { // método .equals() compara 2 objetos
            menu.cmdHelp();
        } if(input.equals(opRepo)) {
            menu.cmdRepo("https://github.com/Matheus-Assis05/Java-primeiro-projeto-terminal");
        } if(input.equals(opBreak)){
            break; //break para o loop.
        }
        }

    }
}