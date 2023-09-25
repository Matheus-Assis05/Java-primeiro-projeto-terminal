import java.awt.*; //importando a classe AWT para usar seus comandos, abrindo uma url no browser padrao
import java.io.IOException;
import java.net.URI;

import java.time.format.DateTimeFormatter; //importando as classes utilizadas para pegar a hora e data atual do PC
import java.time.LocalDateTime;

public class opsMenu {
    //Métodos da classe:
    public void cmdHelp(){
        System.out.println("Comandos: \n"+
        "sobre - Sub-menu de descricao do produto \n"+
        "repo - Repositorio no GitHub\n"+
        "hora - Mostra o dia e hora atual\n"+
        "break - Fecha o programa\n");       
    }

    public void cmdRepo(String url){ //parametro que recebe a url a ser aberta
        try {
            if (Desktop.isDesktopSupported()) { //checa se o sistema é compativel 
                                                //e cria um objeto "Desktop"
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) { //usa a função do navegador padrao do Desktop
                                                                  //para abrir a url
                    desktop.browse(URI.create(url));
                }
            }
        } catch (IOException | InternalError e) { //Se houver algum erro
            e.printStackTrace();
        }
    }

    public void cmdHora(){
        DateTimeFormatter dtHr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//Método da classe DTF que formata
                                                                                    //O horario
        LocalDateTime now = LocalDateTime.now(); //recebe do PC o horário atual

        System.out.println(dtHr.format(now)); //printa a data formatada na tela.
    }
    
    public void cmdSobre(){ //Mesmo esqueminha do menu principal, criando objetos de string e usando if's para comparar
        String opNome = new String("nome"); 
        String opLang = new String("lang");
        String opDesc = new String("desc");
        String opVoltar = new String("voltar");

        System.out.println("Menu Sobre:\n Digite um comando -- nome; lang; desc; voltar");

        //se repete o esquema do while infinito para o usuario realizar varios inputs
        while(true){ 
            System.out.print("-$> "); 
            String inputSobre = System.console().readLine();

            if(inputSobre.equals(opNome)){
                System.out.println("Desenvovido por: github.com/Matheus-assis05");
            } else if(inputSobre.equals(opLang)){
                System.out.println("Java(TM) version 21");
            } else if(inputSobre.equals(opDesc)){
                System.out.println("Terminal simples com alguns comandos. A finalidade \n"+
                "do projeto é revisar e fixar a sintaxe java e aprender sobre classes e importações");
            } else if(inputSobre.equals(opVoltar)){
                break; // como o break deste while esta tecnincamente dentro de outro while (o principal)
                       //entao ele volta para o menu incial, habilitando o usuario de dar prompts fora de sobre.
            } else{
                System.out.println("ERRO: COMANDO INVALIDO");
            }
        }
    }
}
