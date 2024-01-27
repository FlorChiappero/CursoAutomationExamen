package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int contador = 0; contador < 5; contador++) {
            System.out.print("--> Primer valor: ");
            int valor1 = new Scanner(System.in).nextInt();
            System.out.print("--> Segundo valor: ");
            int valor2 = new Scanner(System.in).nextInt();
            System.out.print("--> Operación: ");
            String operacion = new Scanner(System.in).next();

            int resultado = 0;
            boolean esOperacionValida = true;

            switch (operacion) {
                case "+":
                    resultado = new Calculadora().suma(valor1, valor2);
                    break;
                case "-":
                    resultado = new Calculadora().resta(valor1, valor2);
                    break;
                case "*":
                    resultado = new Calculadora().multiplicacion(valor1, valor2);
                    break;
                case "/":
                    try {
                        resultado = new Calculadora().division(valor1, valor2);
                    } catch (ArithmeticException e) {
                        esOperacionValida = false;
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    esOperacionValida = false;
                    break;
            }

            if (esOperacionValida) {
                System.out.println("--> Resultado: " + resultado);

                if (resultado < 0) {
                    System.out.println("Ten cuidado, el resultado es negativo!");
                } else if (resultado >= 0 && resultado < 10000) {
                    System.out.println("Resultado dentro de los límites");
                } else {
                    System.out.println("Error, resultado muy grande");
                }
            } else {
                System.out.println("Operación no válida");
            }



        }
    }
}

class Calculadora {
    public int suma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int resta(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public int multiplicacion(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public int division(int valor1, int valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return valor1 /valor2;
    }
}