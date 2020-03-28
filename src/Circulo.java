public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double Area() {
        return  Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "\n" + String.format("%-11s %5.2f","Area:", Area() )+
                "\n" + String.format("%-11s %5.2f","Perimetro:", Perimetro() )+
                "\n}";
    }
}
