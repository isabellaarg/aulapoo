package P2;

public class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;
    private String status;

    public AchadoPerdido(String titulo) {
        this.titulo = titulo;
    }


    public void AchadoPerdido(String descricao, String tipo, String status) {
       setDescricao(descricao);
       setTipo(tipo);
       setStatus(status);
    }
    public void completaDados(String foto, String local_achado, String data_hora){
        setFoto(foto);
        setLocal_achado(local_achado);
        setData_hora(data_hora);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String buscarTitulo(String texto) {
        if(getTitulo().equals(texto))
            return "Titulo: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nLocal Achado: " + getLocal_achado();
        else
            return "Não encontrado";
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("Titulo: " + this.titulo + "\nFoto: " + this.foto + "\nLocal Achado: " + getLocal_achado() + "\nTipo: " + getTipo() + "\nStatus: " + getStatus());
    }

}
