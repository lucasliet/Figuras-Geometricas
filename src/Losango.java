public class Losango extends Poligono {

    public Losango(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double Area() {
        return super.getBase() * super.getAltura();
    }

    @Override
    public double Perimetro() {
        return 4 * super.getBase();
    }

    @Override
    public String toString() {
        return "Losango{" +
                "\n" + String.format("%-11s %5.2f","Area:", Area() )+
                "\n" + String.format("%-11s %5.2f","Perimetro:", Perimetro() )+
                "\n}";
    }
}
