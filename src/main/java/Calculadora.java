public class Calculadora {
    private int n1;
    private int n2;

    // Constructor por defecto
    public Calculadora() {
        this.n1 = 0;
        this.n2 = 0;
    }

    // Constructor con parámetros
    public Calculadora(int num1, int num2) {
        this.n1 = num1;
        this.n2 = num2;
    }

    public int sumar() {
        return this.n1 + this.n2;
    }

    public int multiplicar() {
        return this.n1 * this.n2;
    }

    // Setters
    public void setN1(int num1) {
        this.n1 = num1;
    }

    public void setN2(int num2) {
        this.n2 = num2;
    }
}