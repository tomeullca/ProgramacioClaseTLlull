package ExercicisClase;

import java.util.Scanner;

public class ExercicisInicials {

    public static void overflow(){
        int numero = 2147483646;
        System.out.println("numero es: " + numero);
        numero+=1;
        System.out.println("numero es: " + numero);
        numero+=1;
        System.out.println("nuero es " + numero);
        numero+=1;
        System.out.println("nuero es " + numero);
        numero+=1;
        System.out.println("nuero es " + numero);
    }
    public static void operaciones(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Introduce el numero real: ");
        double real= Double.parseDouble(insert.nextLine());
        System.out.println("Introduce el numero entero: ");
        int entero= insert.nextInt();

        double division = real/entero;
        double modulo = real%entero;
        System.out.println("valor division: " + division);
        System.out.println("modulo de la division: " + modulo);

    }
    public static void imprimir(){
        //Escribir una aplicación Java que imprima la frase “Saber es Poder”,
        //en una línea
        System.out.println("Saber es poder");
        //cada palabra en una línea
        System.out.println("saber ");
        System.out.println("es ");
        System.out.println("poder ");
        //dentro de una caja hecha con los caracteres = y |
        System.out.println("=============");
        System.out.println("|saber es poder|");
        System.out.println("=============");
    }
    public static void graus(){
        Scanner insert= new Scanner(System.in);
        System.out.println("introduce los C: ");
        double c= Double.parseDouble(insert.nextLine());
        double farenheit=(c*9/5)+32;
        System.out.printf("%nEls graus en farenheit es:  %.4f", farenheit);

    }
    public static void persona(byte edad, double estatura, String nom){
        edad += 2;
        System.out.println("L'edat modificada es: " + edad);
        estatura= estatura/2;
        System.out.println("L'estatura es: " + estatura);
}
    public static void usuario(){
        Scanner insert= new Scanner(System.in);
            String nom= insert.nextLine();
        System.out.println("Hola " + nom);
    }
    public static void devolucionDolares(){
        Scanner insert= new Scanner(System.in);
        System.out.println("Introduce el numero de quarters que tienes: ");
        double quarter= Double.parseDouble(insert.nextLine());
        System.out.println("Introduce el numero de dime que tienes: ");
        double dime= Double.parseDouble(insert.nextLine());
        System.out.println("Introduce el numero de nickels que tienes: ");
        double nickels= Double.parseDouble(insert.nextLine());
        System.out.println("Introduce el numero de pennies que tienes: ");
        double pennies= Double.parseDouble(insert.nextLine());

        double total = (quarter*0.25)+(dime*0.10)+(nickels*0.05)+(pennies*0.01);
        System.out.println(total);
    }
    public static void docenas(){
        Scanner insert = new Scanner(System.in);
        int unidades = insert.nextInt();
        System.out.println("Tiene " + unidades/12 + " docenas" + " y " + unidades%12 + " unidades");
    }
    public static void ecuacion(){
        Scanner insert= new Scanner(System.in);
        System.out.println("Escribe el valor de a: ");
        int a = insert.nextInt();
        System.out.println("Escribe el valor de b: ");
        int b = insert.nextInt();
        System.out.println("Escribe el valor de c: ");
        int c = insert.nextInt();
        System.out.println("Escribe el valor de x: ");
        int x = insert.nextInt();

        double y = a*Math.pow(x,2)+ b*x + c;
        System.out.println(y);
    }

}
