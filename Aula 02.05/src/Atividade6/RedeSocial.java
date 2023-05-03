package Atividade6;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<>(); //vai inicializar vazio

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    void inserePublicacao(Publicacao publi){ //vai cair na prova
        //metodo para inserir a publicação dentro da rede social
        publicacoes.add(publi);
    }
    void imprimePublicacoes(){
        System.out.println("Total publicações: " + Publicacao.getContadorPublicacao());//Nome da classe com o contador para chamar o get
        for(Publicacao publi : publicacoes){ // foreach
            for(int i= 0;i < publicacoes.size(); i++){
                System.out.println("Data: " + publicacoes.get(i).getDatePublicacao());
                System.out.println("Texto: " + publicacoes.get(i).getTextoPublicacao());
            }
        }
    }

}
