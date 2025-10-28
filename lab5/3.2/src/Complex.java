public class Complex {
    public double real;
    public double imaginar;

    public Complex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public Complex aduna(Complex c) {
        return new Complex(this.real + c.real, this.imaginar + c.imaginar);
    }

    public Complex scade(Complex c) {
        return new Complex(this.real - c.real, this.imaginar - c.imaginar);
    }

    public Complex inmulteste(Complex c) {
        double realPart = this.real * c.real - this.imaginar * c.imaginar;
        double imaginarPart = this.real * c.imaginar + this.imaginar * c.real;
        return new Complex(realPart, imaginarPart);
    }

    public Complex imparte(Complex c) {
        double denominator = c.real * c.real + c.imaginar * c.imaginar;
        double realPart = (this.real * c.real + this.imaginar * c.imaginar) / denominator;
        double imaginarPart = (this.imaginar * c.real - this.real * c.imaginar) / denominator;
        return new Complex(realPart, imaginarPart);
    }

    @Override
    public String toString() {
        return real + " + " + imaginar + "i";
    }
}