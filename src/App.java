//Ronald Ramon Oporta Sequeira 
//1M7-Ss
//2024-1623U
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pedir la longitud del arreglo
        System.out.print("Ingresa el tamaño del arreglo: ");
        int n = scanner.nextInt();

        String[] productos = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            productos[i] = scanner.next();
        }

        // Pedir al usuario que busque el producto 
        System.out.print("Ingresa el producto que deseas buscar: ");
        String productoBuscado = scanner.next();

        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (productos[i].equalsIgnoreCase(productoBuscado)) {
                encontrado = true;
                break;
            }
        }

        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El producto \"" + productoBuscado + "\" fue encontrado.");
        } else {
            System.out.println("El producto \"" + productoBuscado + "\" no fue encontrado.");
        }
    }
}

    

