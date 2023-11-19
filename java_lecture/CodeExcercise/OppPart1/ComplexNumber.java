public class ComplexNumber {
    private double real;
    private double imaginary;
    
    public ComplexNumber(double num1, double num2){
        this.real = num1;
        this.imaginary = num2;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber a){
        this.real += a.real;
        this.imaginary += a.imaginary;
    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber a){
        this.real -= a.real;
        this.imaginary -= a.imaginary;
    }
}
