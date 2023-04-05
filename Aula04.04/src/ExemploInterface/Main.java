package ExemploInterface;

public class Main {
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        f.setNome("Harry Styles");
        f.setCPF("123");
        f.setComissao(100);
        f.setSalario(400);
        System.out.println(f.getNome() + " " + f.getPagamento());
    }
}

