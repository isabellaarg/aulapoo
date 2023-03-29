package ExemploAbstract;

public class Quadrado extends FiguraBidimensional {
    private float lado;

    public void calcularArea() {
        area = lado * lado;
    }

    public float getLado() {
        return lado;
    }

    @Override
    public void mover() {
        //Corpo de metodo mover
    }

    @Override
    public void desenhar() {
    }

    public void setLado(float lado) {
        if (lado > 0) {
            this.lado = lado;
            calcularArea();
        }
    }
}