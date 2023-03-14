package dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;



public class EjsLambda {

    // Ej 1
    public static int Sum(int n) {
        return Stream.iterate(0, i -> i + 1).limit(n+1).reduce(0, (a, b) -> a + b);
    }

    // Ej 2
    public static int Fact(int n) {

        return Stream.iterate(1, i -> i + 1).limit(n).reduce(1, (a, b) -> a * b);
    }

    // Ej 3
    public static int Pot(int base, int exp) {
        return Stream.iterate(1, i -> i + 1).limit(exp).reduce(1, (a, b) -> a * base);
    }

    // Ej 4
    public static int sumarNumeros(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        return lista.stream().mapToInt(num -> num).sum();
    }

    // Ej 5
    public static int media(String[] args) {
        List<Integer> lista = Arrays.asList(2, 5, 1, 4);
        return (int) lista.stream().mapToDouble(num -> num).average().orElse(0.0);
    }

    // Ej 6
    public static int desviacion(String[] args) {
        List<Integer> lista = Arrays.asList(2, 5, 1, 4);
        return lista.stream().mapToInt(num -> num).max().orElse(0);
    }

}