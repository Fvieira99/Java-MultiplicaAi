public class App {
    public static void main(String[] args)  {
       
        int numero = 2;
        System.out.println("Tabela de Multiplicação de " + numero);

        for(int i = 1; i <= 10; i++){

            int resultado = i * numero;

            System.out.println(numero + " X " + i + " = " + resultado);
        }
        
    }
}
