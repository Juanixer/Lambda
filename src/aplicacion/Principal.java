package aplicacion;
import java.util.*;
import dominio.*;

public class Principal {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();
        int [] lista = {1, 2, 3, 4, 5, 8};
        int [] listaA = {2, 3, 5, 6};
        int [] listaB = {1, 3, 4, 2};

        // Ejercicio 1:
        System.out.println(EjsLambda.Sum(n));

        // Ejercicio 2:
        System.out.println(EjsLambda.Fact(n));

        // Ejercicio 3:
        System.out.println("Introduce la base: ");
        int base = sc.nextInt();
        System.out.println("Introduce el exponente: ");
        int exp = sc.nextInt();
        System.out.println(EjsLambda.Pot(base, exp));

        // Ejercicio 4:
        System.out.println(EjsLambda.sumarNumeros(lista));

        // Ejercicio 5:
        System.out.println(EjsLambda.media(lista));


        // Ejercicio 6:


        // Ejercicio 7:
        System.out.println(EjsLambda.par(4));

        // Ejercicio 8:
        System.out.println(EjsLambda.sumListaPar(lista));

        // Ejercicio 9:
        System.out.println(EjsLambda.listaPar(lista));

        // Ejercicio 10:
        System.out.println(EjsLambda.listaParHastaN(6));

        // Ejercicio 11:
        System.out.println(EjsLambda.escalar(listaA, listaB));

        // Ejercicio 12:
        System.out.println(EjsLambda.fibo(5));

    }

}
