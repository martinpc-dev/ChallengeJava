package fizzbuzz;

import java.util.stream.IntStream;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class Fizzbuzz {

  public static void main(String[] args) {

    IntStream.range(1, 101).forEach(Fizzbuzz::getMessage);
  }

  private static void getMessage(int numero) {
    if (numero % 3 == 0 && numero % 5 == 0) {
      System.out.println("fizzbuzz");
    } else if (numero % 3 == 0) {
      System.out.println("fizz");
    } else if (numero % 5 == 0) {
      System.out.println("buzz");
    } else {
      System.out.println(numero);
    }
  }
}
