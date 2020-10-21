package Experiment_3.C;

public class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    protected Complex multiply(Complex a, Complex b) {
        return new Complex(a.real * b.real - a.imaginary * b.imaginary, a.real * b.imaginary + a.imaginary * b.real);
    }

    protected Complex subtract(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imaginary - b.imaginary);
    }

    protected Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imaginary + b.imaginary);
    }

}

