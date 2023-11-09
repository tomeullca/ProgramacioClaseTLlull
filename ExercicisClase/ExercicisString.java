package ExercicisClase;

import java.util.Scanner;

public class ExercicisString {
    public static void main(String[] args) {

    }
    //Escriu un programa que declari una variable de tipus String anomenada "nom" i inicialitza el seu valor amb el teu nom fent servir
    // l'operador d'assignació. Mostra el resultat per consola.

    public static void nom(){
        String nom = "Tomeu";
        System.out.println(nom);
    }

    //Tenim dues variables de tipus String s1 i s2 amb els valors “Joan” i “Miquel”. Utilitzant l'operador d'addició (+),
    // posa en una tercera variable de tipus String s3 la concatenació d'aquestes dues cadenes, assegurant-te de posar un espai entre elles. Imprimeix s3 per la consola.

    public static String nomCompost(){
        String s1 = "Joan";
        String s2 = "Miquel";

        String s3 = (s1 + " " + s2);
        System.out.println(s3);
        return s3;
    }

    //Repeteix l’exercici anterior, fent servir el mètode concat de la classe String

    public static String nomCompost2(){
        String s1 = "Joan";
        String s2 = "Miquel";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        return s3;
    }
    //Escriu un programa que mostri per consola la longitud de la cadena “Real Club Deportiu Mallorca”.
    public static int longitudCadena(){
        String cadena = "Real Club Deportiu Mallorca";
        return cadena.length();
    }
    //Escriu un programa que mostri per consola la cadena “Cadena a analitzar: “ i assigni el valor rebut per la entrada a una variable cadena.
    // A continuació, imprimeix la longitud de la cadena introduïda.

    public static int cadenaIntroduida(){
        System.out.println("Caddena a analitzar: ");
        Scanner insert = new Scanner(System.in);
        String cadena = insert.next();
        System.out.println(cadena.length());
        return cadena.length();
    }


    //Donat el string "Mary had a little lamb", escriu un programa per determinar la posició de la lletra 'i' en aquest string.
    // Imprimeix aquesta posició per la consola indicant: "La posició de la lletra 'i' és: <posició>".

    public static int posicioLletra(){
        String cadena = "Mary had a little lamb";
        char lletra = 'i';
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==lletra){
                System.out.println("La posicio de la lletra i es: " + i);
                contador = i;
            }
        }
        return contador;
    }
    //Sobre el mateix string anterior, escriu un programa per determinar la posició de la segona aparició de la lletra 'a' en aquest string.
    // Imprimeix aquesta posició per la consola indicant: "La posició de la segona lletra 'a' és: <posició>".
    public static int posicioA(){
        String cadena = "Mary had a little lamb";
        char lletra = 'a';
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==lletra){
                contador++;
                if (contador == 2) {
                    System.out.println("La posicio de la segona lletra a es: " + i);
                    return i;
                }
            }
        }
        return contador;
    }

    //Donat el string "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow",
    // escriu un programa per determinar i imprimir la posició de l'última aparició de la paraula "little" en el text.

    public static int little(){
        String cadena = "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow";
        String espacio = " ";
        int contador = 0;
        int contadorDos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==espacio.charAt(0)){
                contador++;
            }
        }

        String[]paraules = new String[contador+1];
        String paraula = "";
        String paraulaCercar = "little";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == espacio.charAt(0)) {
                paraules[contadorDos] = paraula;
                contadorDos++;
                paraula = "";
            } else {
                paraula += cadena.charAt(i);
            }
            if (i == cadena.length() - 1) {
                paraules[contadorDos]= paraula;
            }
        }
        int x = 0;
        for (int i = 0; i < paraules.length; i++) {
            if (paraules[i].equals(paraulaCercar)){
                x = i;
            }
        }
        System.out.println("La paraula llite es la paraula numero " + x);
        return x;
    }

    //Sobre el mateix string anterior, escriu codi per substituir la paraula "little" per la frase "big big" sempre que la paraula
    // "little" aparegui. Imprimeix la cadena modificada.

    public static String[] bigbig(){
        String cadena = "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow";
        String espacio = " ";
        int contador = 0;
        int contadorDos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==espacio.charAt(0)){
                contador++;
            }
        }

        String[]paraules = new String[contador+1];
        String paraula = "";
        String paraulaCercar = "little";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == espacio.charAt(0)) {
                paraules[contadorDos] = paraula;
                contadorDos++;
                paraula = "";
            } else {
                paraula += cadena.charAt(i);
            }
            if (i == cadena.length() - 1) {
                paraules[contadorDos]= paraula;
            }
        }
        int x = 0;
        for (int i = 0; i < paraules.length; i++) {
            if (paraules[i].equals(paraulaCercar)){
                paraules[i]="big big";
            }
        }
        for (int i = 0; i < paraules.length; i++) {
            System.out.println(paraules[i]);
        }
        return paraules;
    }
    //Sobre el mateix string anterior, escriu codi per eliminar la paraula "little" sempre que aparegui. Imprimeix la cadena modificada.
    public static String[] eliminarLittle(){
        String cadena = "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow";
        String espacio = " ";
        int contador = 0;
        int contadorDos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==espacio.charAt(0)){
                contador++;
            }
        }

        String[]paraules = new String[contador+1];
        String paraula = "";
        String paraulaCercar = "little";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == espacio.charAt(0)) {
                paraules[contadorDos] = paraula;
                contadorDos++;
                paraula = "";
            } else {
                paraula += cadena.charAt(i);
            }
            if (i == cadena.length() - 1) {
                paraules[contadorDos]= paraula;
            }
        }
        int x = 0;
        for (int i = 0; i < paraules.length; i++) {
            if (paraules[i].equals(paraulaCercar)){
                paraules[i]="";
            }
        }
        for (int i = 0; i < paraules.length; i++) {
            System.out.println(paraules[i]);
        }
        return paraules;
    }
    //Tenim un número de telèfon donat com a la cadena 111-222-3333, del qual els primers 3 dígits són l'indicatiu de zona.
    // Extreu i imprimeix l'indicatiu de zona indicant “L’indicatiu de la zona es :<cadena>”; i la resta de números indicant
    // “La resta de números son: <cadena2>”.

    public static void telefon (){
        String cadena = "111-222-3333";
        String indicatiuZona = "";
        String indicatiuZona1 = "";
        char split= '-';
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==split&&contador<1){
                indicatiuZona1 = indicatiuZona;
                indicatiuZona = "";
                contador++;
            } else if (contador<1&&cadena.charAt(i)!=split) {
                indicatiuZona+= cadena.charAt(i);
            }
            if (contador>0){
                indicatiuZona += cadena.charAt(i);
            }
        }
        System.out.println("L'indicatiu es " + indicatiuZona1 + " la resta de numeros son: " + indicatiuZona);
    }

    //Tenim la següent cadena “          com estàs?          “. Escriu un programa que elimini els espais que hi ha tant al principi
    // com al final de la cadena i imprimeixi el resultat. Confirma que has esborrat els espais finals imprimint la lletra 'X'
    // just darrere de la cadena retallada.

    public static void retallar (){
        String cadena = "          com estàs?          ";
        String cadenaModificada= "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)!=' '){
                cadenaModificada+= cadena.charAt(i);
            }
        }
        System.out.println(cadenaModificada+"x");
    }
    //Tenim la següent cadena “>>>>>>com estàs?<<<<<<“. Escriu un programa que faci servir el mètode replace per a esborrar els caràcters
    // extres que envolten a la frase “com estàs?” i imprimeix el resultat.
    public static void remplace(){
        String cadena = ">>>>>>com estàs?<<<<<<";
        String cadenaModificada = cadena.replace("<","");
        cadenaModificada = cadenaModificada.replace(">","");

        System.out.println(cadenaModificada);
    }
}
