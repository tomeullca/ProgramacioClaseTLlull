package ReptesClase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GestioBiblioteca {
    public static void main(String[] args) {
        String[] titol = new String[20];
        String[] autor = new String[20];
        int[] numeroPagines = new int[20];
        Scanner insert = new Scanner(System.in);
        System.out.println("------- GESTIÓ DE BIBLIOTECA -------");
        System.out.println("1. Afegir llibre");
        System.out.println("2. Llistar llibres");
        System.out.println("3. Cercar llibre per autor");
        System.out.println("4. Cercar llibre per titol");
        System.out.println("5. Eliminar llibre");
        System.out.println("6. Sortir");

        boolean sortir = false;

        while (sortir==false){

            int i = insert.nextInt();

            switch (i) {
                case 1:
                    afegirLlibre(titol, autor, numeroPagines);
                    datosOpciones();
                    continue;
                case 2:
                    llistarLlibres(titol, autor, numeroPagines);
                    datosOpciones();
                    continue;
                case 3:
                    cercarPerAutor(titol, autor, numeroPagines);
                    datosOpciones();
                    continue;
                case 4:
                    cercarPerTitol(titol, autor, numeroPagines);
                    datosOpciones();
                    continue;
                case 5:
                    eliminarLlibre(titol, autor, numeroPagines);
                    datosOpciones();
                    continue;
                case 6:
                    sortir = true;
            }
        }
    }

    public static void datosOpciones(){
        System.out.println("Tria una nova opcio");
        System.out.println("1. Afegir llibre");
        System.out.println("2. Llistar llibres");
        System.out.println("3. Cercar llibre per autor");
        System.out.println("4. Cercar llibre per titol");
        System.out.println("5. Eliminar llibre");
        System.out.println("6. Sortir");
    }

    public static void afegirLlibre(String[] titol, String[] autor, int[]numeroPagines) {
        int contador = 0;
        Scanner insert = new Scanner(System.in);
        System.out.println("Introdueix el titol del llibre");
        String titolProva = insert.nextLine();
        System.out.println("Introdueix l'autor del llibre");
        String autorProva = insert.nextLine();
        System.out.println("Introdueix el numero de pagines");
        int paginesProva = insert.nextInt();

        for (int i = 0; i < titol.length; i++) {
            if (titolProva.equals(titol[i])) {
                System.out.println("Aquest libre ja ha estat introduït");
                break;
            } else if (titol[i] == null && contador == 0) {
                titol[i] = titolProva;
                autor[i] = autorProva;
                numeroPagines[i] = paginesProva;
                System.out.println("El llibre s'ha introduït amb exit");
                break;
            }
        }
    }
    public static void llistarLlibres(String[] titol, String[] autor, int[]numeroPagines){
        for (int i = 0; i < titol.length; i++) {
            if (titol[0]==null){
                System.out.println("No hi ha llibre");
                break;
            } else if (titol[i]!=null) {
                System.out.println("Titol: [" + titol[i] + "] Autor: [" + autor[i] + "] Pagines: [" + numeroPagines[i] + "]");
            }
        }
    }

    public static void cercarPerAutor(String[] titol, String[] autor, int[]numeroPagines){
        int contador = 0;
        Scanner insert = new Scanner(System.in);
        System.out.println("Introdueix el nom de l'autor");
        String autorCercar = insert.nextLine();
        for (int i = 0; i < autor.length; i++) {
            if (autor[i]!=null){
                if (autor[i].equals(autorCercar)){
                    contador++;
                    System.out.println(contador + " " + titol[i]);
                }
             }
        }
        if (contador==0){
            System.out.println("No s'ha introduit cap llibre d'aquest autor");
        }
    }
    public static void cercarPerTitol(String[] titol, String[] autor, int[]numeroPagines){
        int contador = 0;
        Scanner insert = new Scanner(System.in);
        System.out.println("Introdueix el titol del llibre");
        String titolCercar = insert.nextLine();
        for (int i = 0; i < titol.length; i++) {
            if (titol[i]!=null){
                if (titol[i].equals(titolCercar)){
                    System.out.println( "Autor del llibre: " + autor[i] + " ,numero de pagines: " + numeroPagines[i]);
                    contador++;
                }
            }
        }
        if (contador==0){
            System.out.println("No s'ha introduit cap llibre amb aquest titol");
        }
    }

    public static void eliminarLlibre(String[] titol, String[] autor, int[]numeroPagines){
        Scanner insert = new Scanner(System.in);
        System.out.println("Introdueix el titol del llibre a eliminar: ");
        String llibreEliminar = insert.nextLine();

        for (int i = 0; i < titol.length; i++) {
            if (llibreEliminar.equals(titol[i])){
                for (int j = i; j < titol.length-1; j++) {
                    titol[j]=titol[j+1];
                    autor[j]=autor[j+1];
                    numeroPagines[j]=numeroPagines[j+1];
                }
            }
        }
        for (int i = 0; i < titol.length; i++) {
            System.out.println(i + titol[i]);
        }
    }
}
