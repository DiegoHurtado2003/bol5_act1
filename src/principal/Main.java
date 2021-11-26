package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int opcion;
        char continuar;
        do {

            System.out.println("Introduce la opción a la que quieras ir: 1=generar cuadrado// 2= calcular número ambicioso// 3=jugar dados");
            opcion=scan.nextInt();

            System.out.println("""
                1. Subprograma que teniendo como parámetros un carácter y un número, imprima
                una línea con tantas veces el carácter como indique el número.
                b. Subprograma para pasar de mayúsculas a minúsculas.
                c. Subprograma para calcular si un año es o no bisiesto.
                d. Subprograma Digito que determine si un carácter es un dígito entre 0 y 9.
                e. Subprograma para calcular si un número es o no perfecto.
                f. Subprograma que tenga de entrada un carácter y devuelva un valor Cierto si
                dicho carácter es una letra del alfabeto español y Falso si no lo es.
                g. Subprograma para comprobar si dos números son amigos. Dos números son
                amigos si la suma de los divisores del primero, excepto él mismo, es igual al
                segundo número y viceversa.
                h. Subprograma para determinar cuántas cifras posee un número entero.
                i. Subprograma para pasar una medida en hectáreas y áreas a metros cuadrados.
                j. Subprograma para calcular si un número es o no primo.
                k. Subprograma llamado SiguientePrimo que reciba un número primo mayor
                que 1 y devuelva el número primo inmediatamente superior.
                l. Subprograma que teniendo como parámetros las coordenadas cartesianas de
                dos puntos en el plano calcule la pendiente de la recta que definen.
                m. Subprograma que dado un número calcule sus factores primos.\s""");


            switch (opcion){

                case 1 -> {
                    System.out.println("Programa en construcción");

                }

                case 2 -> {
                    System.out.println("Programa en construcción2");

                }

                default -> System.out.println("número invalido");
            }

            System.out.println("¿Desea continuar?");
            continuar=scan.next().charAt(0);
        }
        while (continuar=='s' || continuar=='S');
        System.out.println("Programa finalizado");

    }


}

