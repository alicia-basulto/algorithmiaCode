import execution.problemModel;
import problemsExecution.majorityElement169Execution;
import problemsExecution.maxProfit121Execution;
import problemsExecution.plusOne66Execution;
import problemsExecution.rotate189Execution;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese un número del 1 al 150
            System.out.print("Ingrese un número del 1 al 200: ");
            int numero = scanner.nextInt();
            // Crear un HashMap donde la clave es el número y el valor es la instancia de la clase correspondiente
            Map<Integer, problemModel> problems = new HashMap<>();
            problems.put(66, new plusOne66Execution());
            problems.put(121, new maxProfit121Execution());
            problems.put(169, new majorityElement169Execution());
            problems.put(189, new rotate189Execution());

            // Verificar que el número esté en el rango válido
            if (numero >= 1 && numero <= 200) {
                // Definir un array de mensajes
                problemModel choice = problems.getOrDefault(numero, new problemModel());
                choice.execute();

            } else {
                System.out.println("Número fuera de rango. Por favor, ingrese un número del 1 al 150.");
            }

            // Cerrar el scanner
            scanner.close();
        }

}
