package dominio;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
    public static int sumarNumeros(int[] lista) {
        return Stream.iterate(0, i -> i + 1).limit(lista.length).map(i -> lista[i]).reduce(0, (a , b) -> a + b);
    }

    // Ej 5
    public static int media(int[] lista) {
        return Stream.iterate(0, i -> i + 1).limit(lista.length).map(i -> lista[i]).reduce(0, (x , y) -> (x + y)) / lista.length;
    }

    /* Ej 6 no se como hacerlo
    public static int desviacion(String[] args) {
        return Stream.iterate(0, i -> i + 1).
    }
     */

    // Ej 7
    public static int par(int n) {
        return Stream.iterate(0, i -> i + 1).limit(n + 1).filter(i -> i % 2 == 0).reduce(0, (x , y) -> x + y);
    }

    // Ej 8
    public static int sumListaPar(int[] lista) {
        return Stream.iterate(0, i -> i + 1).limit(lista.length).map(i -> lista[i]).filter(i -> i % 2 == 0).reduce(0, (x , y) -> x + y);
    }

    // Ej 9
    public static ArrayList listaPar(int[] lista) {
        return Stream.iterate(0, i -> i + 1).limit(lista.length + 1).filter(i -> i % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    // Ej 10
    public static ArrayList listaParHastaN(int n) {
        return Stream.iterate(0, i -> i + 1).limit(n + 1).filter(i -> i % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    // Ej 11
    public static int escalar(int[] listaA, int[] listaB ) {
        return Stream.iterate(0, i -> i + 1).limit(listaA.length).map(i -> listaA[i] * listaB[i]).reduce(0, (x , y) -> x + y);
    }

    // Ej 12
    public static int fibo(int n) {
        return Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[1]}).limit(n).map(i -> i[0]).reduce(0, (x , y) -> x + y);
    }

}
