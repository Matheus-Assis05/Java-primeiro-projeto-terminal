import java.awt.*; //importando AWT para usar seus comandos, abrindo uma url no browser padrao
import java.io.IOException;
import java.net.URI;

public class opsMenu {
    //Métodos da classe:
    public void cmdHelp(){
        System.out.println("Comandos: \n"+
        "sobre - Sub-menu de descricao do produto \n"+
        "repo - Repositorio no GitHub\n"+
        "dia - Mostra o dia atual\n"+
        "break - Fecha o programa\n");       
    }

    public void cmdRepo(String url){
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
}
