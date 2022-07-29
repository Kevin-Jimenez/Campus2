public class Main {
    public static void main(String[] args) {
        System.out.println(getPrecio(10000));
    }
    static double getPrecio(int precio){
        double iva = 0.19;
        return precio + (precio * iva);
    }
}
