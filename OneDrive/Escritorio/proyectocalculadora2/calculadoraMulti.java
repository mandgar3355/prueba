public class pruebaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(5, 3);
        double resultado = calc.suma();
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
}public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma() {
        return this.num1 + this.num2;
    }
}public double resta() {
    return this.num1 - this.num2;
    
}public double multiplicar() {
    return this.num1 * this.num2;
}