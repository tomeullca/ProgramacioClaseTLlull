package ExercicisClase;

import java.util.Arrays;

public class ExercicisArrays {
    //Tenim un array de números enters definit de la següent manera:
    //int[] intArray = new int[3];
    //Explica amb paraules el que significa cada part d’aquesta declaració.
    //Resposta: Significa que esta inicialitzant un array de tamany 3(4 posicions)


    //Quin és el primer índex d’un array?
    //Resposta= 0

    //Escriu una línia de codi que instanciï un array d’enters anomenat intArray amb capacitat per a 20 nombres enters.
    //int[] intArray = new int[19];


    //Assigna el valor 2 a l'índex 1 de l’array definit anteriorment.
    //Resposta = intArray[1]= 2;

    //Assigna el valor 17 a l'índex 3 de l’array intArray definit anteriorment.
    //Resposta = intArray[3] = 17;

    //Escriu un petit programa que instanciï un array de String de longitud màxima 10 i inicialitza els primers 5 elements
    // amb les següents paraules: “Mary”, “had”, “a”, “little”, “lamb”.

    public static void paraules(){
        String[] paraules = new String[10];

        paraules[0]= "Mary";
        paraules[1]= "had";
        paraules[2]= "a";
        paraules[3]= "little";
        paraules[4]= "lamb";

        for (int i = 0; i < paraules.length; i++) {
            System.out.println(paraules[i]);
        }
    }

    //Escriu un programa que imprimeixi la longitud de l’array de l'exercici anterior.
    public static int imprimirLongitud(){
        String[] paraules = new String[10];
        System.out.println(paraules.length);
        return paraules.length;
    }

    //Explica què està malament amb el següent codi:
    //public class PracticeYourJava {
    //  public static void main(String[] args) {
    //    int[] intArray01 = new int[]{ 10, 11, 12, 13, 14 };
    //    System.out.printf("%d\n", intArray02[5]);
    //  }
    //}
    //Resposta: Quant intenti imprimir no trobara index 5 ja que va del 0 al 4



    //Escriu un programa que instancii un int[] amb 0 elements. Imprimeix la longitud de l’array.

    public static void instanciar(){
        int[] valors = new int[0];
        System.out.println(valors.length);
    }

    //Explica la diferència entre les següents dues declaracions d’arrays:
    //int[] intArray01;
    //int[] intArray02 = new int[0];
    //el segon ja esta inicialitzar i el primer s'haura d'inicialitzar


    //Copia el següent array a un nou int[] anomenat intArray02 fent servir Arrays.copyof
    //int[] intArray01 = new int[] { 10, 11, 12, 13, 14 };
    public static void copiarArray(){
        int[] intArray01 = new int[] { 10, 11, 12, 13, 14 };
        int[] intArray02 = Arrays.copyOf(intArray01,intArray01.length);
    }

    //Modifica la solució de l'exercici anterior per a també comprovar si el contingut de intArray01 i intArray02 és el mateix,
    // emprant Arrays.equals. Imprimeix el resultat
    public static void igualArray() {
        int[] intArray01 = new int[]{10, 11, 12, 13, 14};
        int[] intArray02 = new int[]{10, 13, 12, 15, 14};

        for (int i = 0; i < intArray01.length; i++) {
            if (intArray01[i]==intArray02[i]){
                System.out.println("La posicio " + i + " son iguals");
            }else {
                System.out.println("La posicio " + i + " no son iguals");
            }
        }
    }
    //Tenim un array d'enters intArray01 que té 5 elements de la següent manera:
    //[0] → 55
    //[1] → 747
    //[2] → 15000
    //[3] → 89
    //[4] → 2333
    //Copia els tres primers elements de intArray01 a un nou array anomenat intArray02 fent servir Arrays.copyOfRange.
    // Imprimeix la longitud de intArray02 i el seu contingut.

    public static void copiarElements(){
        int[] intArray01 = new int []{55,747,15000,9,2333};
        int[] intArray02 = Arrays.copyOfRange(intArray01,0,2);

        System.out.println(intArray02.length);
        for (int i = 0; i < intArray02.length; i++) {
            System.out.println(intArray02[i]);
        }
    }

    //Reescriu el programa anterior, utilitzant el mètode Arrays.toString per a mostrar el contingut de l’array

    public static void mostrarContingut(){
        int[] intArray01 = new int []{55,747,15000,9,2333};
        int[] intArray02 = Arrays.copyOfRange(intArray01,0,2);

        System.out.println(Arrays.toString(intArray02));
    }


    //Executa el següent programa i indica les teves observacions sobre ell i el seu resultat.
    //	import java.util.*;
    //public class PracticeYourJava {
    //  public static void main(String[] args) {
    //    int[] intArray01 = new int[]{55, 747, 15000, 89, 2333};
    //    int[] intArray02;
    //    System.out.printf("intArray01’s contents are currently %s\n", Arrays.toString(intArray01));
    //
    //    intArray02 = Arrays.copyOfRange(intArray01, 0, 10);
    //    System.out.println("Length of intArray02 = " + intArray02.length);
    //    System.out.printf("intArray02’s contents are %s\n", Arrays.toString(intArray02));
    //  }
    //}
    //Resposta: L'array acaba mostrant des de la posicio que ja no tenia cap element 'intArray01 fins al final un 0 perque esta buid;


    //16. Escurça el següent array als seus tres primers elements:
    //int[] intArray01 = new int[] {55, 747, 15000, 89, 2333};
    //Imprimeix la longitud d'intArray01 per provar que realment ha canviat.
    public static void escursar(){
        int[] intArray01 = new int[] {55, 747, 15000, 89, 2333};
        int[] intArray02 = new int[2];

        for (int i = 0; i < intArray02.length; i++) {
            intArray02[i] = intArray01[i];
        }

        intArray01 = intArray02;
        for (int i = 0; i < intArray01.length; i++) {
            System.out.println(intArray01[i]);
        }
        System.out.println(intArray01.length);
    }
//Incrementa la longitud del següent array a 10 elements:
//int[] intArray01 = new int[] {55, 747, 15000, 89, 2333};
//Imprimeix la longitud d'intArray01 i el seu contingut.
    public static void estirar(){

        int[] intArray01 = new int[] {55, 747, 15000, 89, 2333};
        int[] intArray02 = new int[10];

        for (int i = 0; i < intArray02.length; i++) {
            if (i<intArray01.length){
                intArray02[i] = intArray01[i];
            }else {
                intArray02[i] = 2;
            }
        }

        intArray01 = intArray02;
        for (int i = 0; i < intArray01.length; i++) {
            System.out.println(intArray01[i]);
        }
        System.out.println(intArray01.length);

    }
//18.Tenim un array de nombres enters anomenat intArray01 inicialitzat amb els valors: {17, 42, 43, 8, 23}.
// Escriu un programa que incrementi la longitud d'aquest array afegint els valors 57 i 84 al final de l'array.
// Imprimeix tan el la longitud de l'array com el seu contingut.
    public static void nombresEnteros(){
        int[] intArray01 = {17, 42, 43, 8, 23};
        int[] numeroAfegir = {57, 84};
        int[] nouArray = new int[intArray01.length+ numeroAfegir.length];
        int contador = 0;

        for (int i = 0; i < nouArray.length ; i++) {
           if (i < intArray01.length){
               nouArray[i]= intArray01[i];
           }else {
               nouArray[i] = numeroAfegir[contador];
               contador++;
           }
        }
        for (int i = 0; i < nouArray.length; i++) {
            System.out.println(nouArray[i]);
        }
    }
//19.Tenim el següent array:
//int[] intArray01 = new int[] {55, 747, 15000, 89, 2333};
//Modifica-la perquè el seu contingut sigui {15000, 89, 2333}. Imprimeix la nova longitud de l'array i el seu congingut.
    public static void modificacio(){
        int[] intArray01 = new int[] {55, 747, 15000, 89, 2333};
        int[] intNuevo = new int[3];
        int contador = 0;

        for (int i = 2; i < intArray01.length; i++) {
            intNuevo[contador] = intArray01[i];
            contador++;
        }
        intArray01 = intNuevo;
        for (int i = 0; i < intArray01.length; i++) {
            System.out.println(intArray01[i]);
        }
    }
//Donat un array de nombres sencers, escriu un programa que inverteixi l'array.
// La solució ha de funcionar tant per un array amb un nombre imparell d'elements com
// per un array amb un nombre parell d'elements.
    public static void invertirInt1(int[]valors){
        int[] intArray01 = new int[valors.length];
        int j= 0;
        for (int i = valors.length-1; i >= 0 ; i--) {
            intArray01[j] = valors[i];
            j++;
        }
        for (int i = 0; i < intArray01.length; i++) {
            System.out.println(intArray01[i]);
        }
    }
    public static void invertirInt2(int[]valors){
        int temporal;
        int j= valors.length-1;
        for (int i = 0; i < valors.length/2; i++) {
            temporal = valors[i];
            valors[i] = valors[j];
            valors[j] = temporal;
            j--;
        }

        for (int i = 0; i < valors.length; i++) {
            System.out.println(valors[i]);
        }

    }

    //Donat un array de nombres sencers, escriu un programa que ordeni els valors de major a menor.
    // La solució ha de funcionar tant per un array amb un nombre imparell d'elements com
    // per un array amb un nombre parell d'elements.
    public static void selectionSort(int[]valors){

        int temporal;
        for (int i = 0; i < valors.length; i++) {
            int menor = i;
            for (int j = i; j < valors.length; j++) {
                if (valors[j]<valors[menor]){
                    menor= j;
                }
            }
            temporal = valors[i];
            valors[i] = valors[menor];
            valors[menor] = temporal;
        }
        for (int i = 0; i < valors.length; i++) {
            System.out.println(valors[i]);
        }
    }
    public static int[] bubbleSort(int[]valors){
       int temporal;
        for (int i = 0; i < valors.length-1; i++) {
            for (int j = 0; j < valors.length-1; j++) {
                if (valors[j]>valors[j+1]){
                    temporal = valors[j];
                    valors[j] = valors[j+1];
                    valors[j+1] = temporal;
                }
            }
        }
        for (int i = 0; i < valors.length; i++) {
            System.out.println(valors[i]);
        }
        return valors;
    }
    //Escriu una línia de codi per declarar una variable matrixA que contingui un array de nombres enters de 2 dimensions.
    public static void matrixA(){
        int[][] matrixA;
    }
    //Escriu una línia de codi per instanciar un array bidimensional de nombres enters de 2x3 anomenada matrixA.
    public static void matrixA2x3(){
        int[][] matrixA = new int[2][3];
    }
    //Escriu una línia de codi per declarar un array de 5 dimensions amb el nom matrixB.
    public static void matrixB(){
        int[][][][][] matrixB;
    }
    //Escreiu una línia de codi per instanciar un array de 5 dimensions amb el nom matrixB de 10x4x4x5x12.
    public static void matrix5(){
        int[][][][][] matrixB = new int[10][4][4][5][12];
    }
    //Instancia dues matrius de 2x3 de nombres enters amb els noms matrix1 i matrix2 i inicia-les amb els següents valors:
    //matrix1
    //1	2	3
    //4	5	6
    //
    //matrix2
    //5	5	8
    //3	1	3
    public static void matrius2x3(){
        int[][] matrix1 = new int[][]{{1,2,3},{2,4,5}};
        int[][] matrix2 = new int[][]{{3,2,1},{5,7,3}};
    }
    //Suma el contingut dels arrays de l'exercici anterior i escriu el resultat a dins una nova matriu matrix3.
    public static void main(String[] args) {
        multiplicacio();
    }
    public static int[][] suma(){
        int[][] matrix1 = new int[][]{{1,2,3},
                                     {2,4,5}};
        int[][] matrix2 = new int[][]{{3,2,1}
                                     ,{5,7,3}};
        int[][] matrix3 = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.println("La posicion matrix["+i+"]["+j+"] " + matrix3[i][j]);
            }
            System.out.println();
        }
        return matrix3;
    }

    //Multiplica el contingut de dos arrays i insereix-ho dins un nou
    public static int[][] multiplicacio(){
        int[][] matrix1 = new int[][]{{1,2,3},
                {2,4,5}};
        int[][] matrix2 = new int[][]{{3,2,1}
                ,{5,7,3}};
        int[][] matrix3 = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.println("["+i+"]["+j+"]i= " + matrix3[i][j]);
            }
        }
        return matrix3;
    }







}
