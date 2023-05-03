package Atividade6pt;

public class Funcionario extends Pessoa {
    private String departamento;
    private double salario;
    private String dataDeEntrada;
    private String rg;
    private boolean funcionarioEstaNaEmpresa;


    public Funcionario(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isFuncionarioEstaNaEmpresa() {
        return funcionarioEstaNaEmpresa;
    }

    public void setFuncionarioEstaNaEmpresa(boolean funcionarioEstaNaEmpresa) {
        this.funcionarioEstaNaEmpresa = funcionarioEstaNaEmpresa;
    }
}
