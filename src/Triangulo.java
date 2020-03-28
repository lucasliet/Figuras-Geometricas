public class Triangulo extends Poligono  {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double Area() {
        return ( super.getBase() * super.getAltura() ) / 2;
    }
}
