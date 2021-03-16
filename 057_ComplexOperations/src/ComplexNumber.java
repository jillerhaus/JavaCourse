// A complex number is expressed in a + bi
// to add and subtract just add and subtract the real and imaginary parts respectively
// Write a class ComplexNumber

public class ComplexNumber {
    // Two fields of type double: real and imaginary
    private double real;
    private double imaginary;

    // The class needs to have one constructor to initialize both parameters
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Write the following methods:
    // get real
    public double getReal() {
        return real;
    }

    // get imaginary
    public double getImaginary() {
        return imaginary;
    }

    // add with two parameters real and imaginary of type double
    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // add with one ComplexNumber
    public void add (ComplexNumber other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    // Method called subtract with two parameters
    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Method named subtract with one parameter of type ComplexNumber
    public void subtract(ComplexNumber other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }

}
