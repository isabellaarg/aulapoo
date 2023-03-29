package ExemploAbstract;

public abstract class Figura {
    private int cor;

    public abstract void desenhar();

    public abstract void mover();

    public void setCor(int i){
        if(i>0)
            cor = i;
    }
    public int getCor(){
        return cor;
    }

}
