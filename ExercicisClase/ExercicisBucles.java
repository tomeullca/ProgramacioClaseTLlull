package ExercicisClase;

public class ExercicisBucles {
    public static void main(String[] args) {

    rectangleBuid(6,4);
    }
    //Utilitza un bucle while per imprimir per pantalla els números del 0 al 9 en línies diferents.
    public static void zeroANou(){
        int i = 0;
        while (i<=9){
            System.out.println(i);
            i++;
        }
    }

    //Utilitza un bucle while per sumar tots el números de 1 a 15.000. Mostra el resultat per pantalla.

    public static int sumarNumeros(){
        int suma = 0;
        int i = 1;
        while (i<=15000){
            suma+=i;
            i++;
        }
        System.out.println(suma);
        return suma;
    }

    //Prediu la sortida del següent programa:
    //public class PracticeYourJava {
    //public static void main(String[] args) {
    //for (int loopCounter = 0; loopCounter < 5; loopCounter = loopCounter + 1) {
    //System.out.println("Hello!");
    //}
    //}
    //} Escriura 5 pics hello, loopcounter = loopcounter + 1 es el mateix que loopcounter++


    //Escriu un programa que utilitzi un for per mostrar tots els valors del 2 al 10;
    public static void forMostrar(){
        for (int i = 2; i <= 10; i++) {
            System.out.println(i);
        }
    }
    //Quina és la diferència entre els dos for següents:
    //int i;
    //for (i=0; i < 10; i++) {
    //System.out.println(i);
    //}
    //—---------------------------
    //for (int i=0; i < 10; i++) {
    //System.out.println(i);
    //}La diferencia es que el primer te la i declarada fora del bucle per tant la podra utilitzar posteriorment amb el darror valor que s'hagui atribuit a la i el darrer pic que ha entrar al bucle


    //Prediu la sortida del codi següent:
    //for (int i=0; i < 3; i++)
    //System.out.println(i);
    //System.out.println("hello");
    //0hello 1hello 2hello

    //Escriu un programa que utilitzi un bucle do-while per mostrar els números de 1 a 10.

    public static void imprimirDoWh(){
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
    }
    //Escriu un programa amb un bucle do-while que calculi el factorial d'un número i el mostri per pantalla.

    public static void factorial(int valor){
        int factorial = 1;
        int i = 1;
        do {
           factorial *= i;
           i++;
        }while (i<=valor);
        System.out.println(factorial);
    }

    //Prediu la sortida del codi següent:
    //public class PracticeYourJava {
    //public static void main(String[] args) {
    //int j, k;
    //for (j = 1; j < 5; j++) {
         //for (k = 1; k < 5; k++) {
            //System.out.printf("(%d,%d) ", j, k);
        //}
    //System.out.println();
    //}
    //}
    //}(1,1)(1,2)(1,3)(1,4)
    //(2,1)(2,2)(2,3)(2,4).... i aixi fins el 4



    //Escriu un programa amb 2 for niats que mostri el següent patró:
    //(A,1) (A,2) (A,3) (A,4)
    //(B,1) (B,2) (B,3) (B,4)
    //(C,1) (C,2) (C,3) (C,4)
    //(D,1) (D,2) (D,3) (D,4)
    //(E,1) (E,2) (E,3) (E,4)

    public static void forNiats(){

        for (char letra = 'A'; letra <= 'E'; letra++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("(" + letra + " " + j +")");
            }
            System.out.println();
        }
    }

    //Escriu un bucle for que pugui mostrar per pantalla els números de 1 a 1000, però utilitzant un break perquè s'aturi quan el contador és 10.
    public static void aturaContador (){
        int contador = 0;
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
            contador++;
            if (contador==10){
                break;
            }
        }
    }

    //Fes un bucle for que passi per tots els números de 1 a 50. Utilitza un continue per botar tots els valors que siguin divisibles per 5.
    public static void unoACinquenta(){
        for (int i = 1 ; i <= 50 ; i++) {
            if (i%5==0){
                continue;
            }else {
                System.out.println(i);
            }
        }
    }

    //Crea un programa que dibuixi un quadrat format per asteriscs (*). Hem de demanar a l'usuari l'amplada del quadrat.
    //Exemple d'execució:
    //Introdueix l'amplada del quadrat: 4
    //****
    //****
    //****
    //****

    public static void quadrat (int altura,int ancho){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Crea un programa que dibuixi un quadrat sense emplenament format per asteriscs (*). Hem de demanar l'amplada del quadrat.
    //Exemple d'execució:
    //Introdueix l'amplada del quadrat: 4
    //****
    //*  *
    //*  *
    //****
    public static void quadratBuid (int altura,int ancho){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i>0&&i<altura-1&&j>0&&j<ancho-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    //Crea un programa que dibuixi un rectangle format per asteriscs (*). Hem de demanar l'amplada i l'alçada a l'usuari.
    //Introdueix l'amplada del rectangle: 6
    //Indrodueix l'alçada del rectangle: 4
    //******
    //******
    //******
    //******
    public static void rectangle(int amplada, int alcada){
        for (int i = 0; i < alcada; i++) {
            for (int j = 0; j < amplada; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    //Crea un programa que dibuixi un rectangle sense emplenament format per asteriscs (*). Hem de demanar a l'usuari l'amplada i l'alçada a l'usuari.
    //Introdueix l'amplada del rectangle: 6
    //Indrodueix l'alçada del rectangle: 4
    //******
    //*    *
    //*    *
    //******
    public static void rectangleBuid(int amplada, int alcada){
        for (int i = 0; i < alcada; i++) {
            for (int j = 0; j < amplada; j++) {
                if (i>0&&i<alcada-1&&j>0&&j<amplada-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }
    }
    //Crea un programa que dibuixi un triangle format per asteriscs (*). Hem de demanar l'alçada del triangle per teclat.
    //Introdueix l'alçada del triangle: 4
    //   *
    //  ***
    // *****
    //*******
    public static void triangle(int alcada){
        int amplada = alcada*2-1;
        for (int i = 0; i < alcada; i++) {
            for (int j = 0; j < amplada; j++) {

            }
        }
    }
    //Crea un programa que dibuixi un triangle sense emplenament format per asteriscs (*). Hem de demanar l'alçada del triangle per teclat.
    //Introdueix l'alçada del triangle: 4
    //   *
    //  * *
    // *   *
    //*******
}
