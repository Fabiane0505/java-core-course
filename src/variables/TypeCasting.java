public class TypeCasting {
    public static void main(String[] args) {

        int numero = 10;
        double convertido = numero;

        double valor = 9.7;
        int inteiro = (int) valor;

        System.out.println("Implícito: " + convertido);
        System.out.println("Explícito: " + inteiro);
    }
}