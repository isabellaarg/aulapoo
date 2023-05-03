package Atividade6;

public class Publicacao {
    private String datePublicacao;
    private String textoPublicacao;
    private String linkMedia;
    public static double contadorPublicacao = 0; // não faz parte dos atributos, variavel static é da classe não do objeto. Ela é inicializada uma vez só

    public Publicacao(String datePublicacao, String textoPublicacao, String linkMedia) {
        this.datePublicacao = datePublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMedia = linkMedia;
        //toda vez que que uma pessoa inserir uma publicação
        contadorPublicacao++;
    }

    public String getDatePublicacao() {
        return datePublicacao;
    }

    public void setDatePublicacao(String datePublicacao) {
        this.datePublicacao = datePublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkMedia() {
        return linkMedia;
    }

    public void setLinkMedia(String linkMedia) {
        this.linkMedia = linkMedia;
    }

    public static double getContadorPublicacao() { //Para chamar ele no main
        return contadorPublicacao;
    }
}
