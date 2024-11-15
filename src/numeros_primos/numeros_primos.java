package numeros_primos;

import java.util.ArrayList;

public class numeros_primos {

    public static void main(String[] args) {
       
        ArrayList<Integer> numeros = new ArrayList<>();
        

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);  
        System.out.println("Números primos en la lista:");
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                System.out.println(numero);
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;  
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  
            }
        }
        return true;  
    }
}
