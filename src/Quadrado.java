public class Quadrado extends Poligono implements Diagonal{

    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double Area(){
        return super.getBase() * super.getAltura();
    }

    @Override
    public double calcDiagonal() {
        return Math.sqrt(Area()) * Math.sqrt(2);
    }
}
