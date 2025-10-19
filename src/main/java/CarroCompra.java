public class CarroCompra {
    private int [][] productos = new int[2][5];

    // Constructor que inicializa los productos
    public CarroCompra() {
        // Inicializa la instancia de variables (5 productos)
        for (int i = 0; i < 5; i++) {
            productos[0][i] = 1;      // Fila 0: Cantidad = 1
            productos[1][i] = 1000;   // Fila 1: Precio = 1000
        }
    }

    private int subTotal(int cant, int precio) {
        // Crea una instancia local de Calculadora (Relación de Dependencia)
        Calculadora calc = new Calculadora(cant, precio);
        return calc.multiplicar();
    }

    private int calcularTotal() {
        int total = 0;
        int subtotal = 0;

        // Itera 5 veces
        for (int i = 0; i < 5; i++) {
            total += subTotal(productos[0][i], productos[1][i]);
        }
        return total;
    }

    public void mostrarTotal() {
        System.out.println("El total de la compra es: " + this.calcularTotal());
    }
}