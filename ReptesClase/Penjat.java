package ReptesClase;

import java.util.Scanner;

public class Penjat {
    public static void main(String[] args) {
        String[] llista = {"ciervo","perro", "gato", "leon", "pantera", "ave", "periquito", "avestruz"};
        penjat(llista);
    }
    public static String triarParaula(String[] llista){
        int i = (int) (Math.random()* llista.length-1+0);
        System.out.println(llista[i]);
        return llista[i];
    }
    public static char[] stringChar(String paraula){
        char[] paraulaChar = new char[paraula.length()];
        for (int i = 0; i < paraulaChar.length; i++) {
            paraulaChar[i] = paraula.charAt(i);
        }
        return paraulaChar;
    }
    public static void penjat(String[] llista){

        //Elegir palabra aleatoria y pasar los string a char
        String paraulaEndevinar = triarParaula(llista);
        char[] paraulaChar = stringChar(paraulaEndevinar);
        //crear nuevo char para que podamos introducir letras
        char[] introducirPalabra = new char[paraulaChar.length];
        for (int i = 0; i < introducirPalabra.length; i++) {
            introducirPalabra[i] = '_';
        }
        char[] letrasUsadas = new char[paraulaChar.length+6];
        Scanner insert = new Scanner(System.in);
        int contador = 6;
        int contadorLetras = 0;
        boolean valor = false;


        while (contador>0&&valor==false&&contadorLetras< paraulaChar.length+6){
            int contador2 = 0;
            int contador3 = 0;
            System.out.println("Introdueix una lletra");
            char lletra = insert.next().charAt(0);
            letrasUsadas[contadorLetras] = lletra;
            contadorLetras++;

            for (int i = 0; i < paraulaChar.length; i++) {
                if (lletra == paraulaChar[i]){
                   introducirPalabra[i] = lletra;
                    contador2++;
                }
            }
            if (contador2 == 0) {
                contador--;
            }
            System.out.print("Palabra: ");
            for (int i = 0; i < introducirPalabra.length; i++) {
                System.out.print( introducirPalabra[i]);
            }
            System.out.println();
            System.out.print("Letras usadas: ");
            for (int i = 0; i < letrasUsadas.length; i++) {
                if (letrasUsadas[i]!=0) {
                    System.out.print(letrasUsadas[i]);
                }
            }
            System.out.println();
            System.out.println("Intentos restantes: " + contador);
            for (int i = 0; i < paraulaChar.length; i++) {
                if (paraulaChar[i]==introducirPalabra[i]){
                    contador3++;
                }
            }

            if (contador3==paraulaChar.length){
                System.out.println();
                System.out.println("L'has endevinat, efectivament la paraula era: " + paraulaEndevinar);
                valor = true;
            }
            System.out.println();
        }
        if (contador==0||contadorLetras>=paraulaChar.length+6){
            System.out.println("Has perdut, la paraula era: " + paraulaEndevinar);
        }


    }

}
