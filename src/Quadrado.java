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

    @Override
    public double Perimetro() {
        return 4 * super.getBase();
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "\n" + String.format("%-11s %5.2f","Area:", Area() )+
                "\n" + String.format("%-11s %5.2f","Perimetro:", Perimetro() )+
                "\n" + String.format("%-11s %5.2f","Diagonal:", calcDiagonal() )+
                "\n}";
    }
}
