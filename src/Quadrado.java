public class Quadrado extends Poligono implements Diagonal{

    public Quadrado(double lado) {
        super(lado, lado);
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
