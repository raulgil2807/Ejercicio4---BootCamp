package com.openbootcamp.ejercicio4;

public class Main {

    public static void main(String[] args) {
        System.out.println("EJERCICIO DE IF");

        // EJERCICIO DE IF.

        int numeroIF = 0;

        if (numeroIF > 0) {
            System.out.println("Es positivo");
        } else if (numeroIF < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }

        System.out.println("EJERCICIO DE WHILE");

        //EJERCICIO DE WHILE.

        int numeroWhile = 1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("EJERCICIO DE DO WHILE");

        // EJERCICIO DE DO WHILE.

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        } while (numeroWhile < 3);

        System.out.println("EJERCICIO DE FOR");

        // Ejercicio de FOR.

        for (int numeroFOR = 0; numeroFOR <= 5; numeroFOR = numeroFOR +1) {
            System.out.println(numeroFOR);
        }

        System.out.println("EJERCICIO DE SWITCH CASE");

        // EJERCICIO DE SWITCH CASE.

        var estación = "OTOÑO";

        switch (estación) {
            case "VERANO", "verano":
                System.out.println("Es verano");
                break;
            case "OTOÑO", "otoño":
                System.out.println("Es Otoño");
                break;
            case "PRIMAVERA", "primavera":
                System.out.println("Es primavera");
                break;
            case "INVIERNO", "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}