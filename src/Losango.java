public class Losango extends Poligono {

    public Losango(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double Area() {
        return super.getBase() * super.getAltura();
    }
}
