package Atividade6pt;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private int qtde_de_funcionario;
    Funcionario[] funcionarios;

    public Empresa(String nomeEmpresa, String cnpj, int qtde_de_funcionario, Funcionario[] funcionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.qtde_de_funcionario = qtde_de_funcionario;
        this.funcionarios = funcionarios;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtde_de_funcionario() {
        return qtde_de_funcionario;
    }

    public void setQtde_de_funcionario(int qtde_de_funcionario) {
        this.qtde_de_funcionario = qtde_de_funcionario;
    }

}
