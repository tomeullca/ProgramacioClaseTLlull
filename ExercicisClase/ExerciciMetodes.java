package ExercicisClase;

import java.util.Scanner;

public class ExerciciMetodes {
    //Escriu un mètode que mostri per pantalla el text “Hello World”.
    public static void imprimirHello(){
        System.out.println("Hello World");
    }
    //Escriu un mètode que calculi la mitjana de 3 nombres introduïts per pantalla. Ha de rebre els nombres per paràmetre i retornar el valor calculat.
    public static double mitja(int n1, int n2, int n3){
        double mitja = (n1+n2+n3)/3;
        return mitja;
    }
    //Escriu un mètode que calculi quantes vocals hi ha a un string introduït per pantalla.
    // L’string s’ha de passar com a paràmetre i ha de tornar el resultat.
    public static int quantitatVocals(String paraula){
        char[]stringChar = new char[paraula.length()];
        char[]vocals = {'a','e','i','o','u'};
        int contador = 0;
        for (int i = 0; i < stringChar.length ; i++) {
            stringChar[i] = paraula.charAt(i);
            for (int j = 0; j < vocals.length; j++) {
                if (stringChar[i]==vocals[j]){
                    contador++;
                }
            }
        }
      return contador;
    }
    //Escriu un mètode que calculi el valor màxim de 5 números que s’hauran introduït per pantalla
    // i emmagatzemats dins un array prèviament.
    // L’array s’haurà de passar per paràmetre i es retornarà el valor calculat
    public static int maxim(int[] valor){
        int major = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if (valor[i]>major){
                major = valor[i];
            }
        }
        return major;
    }
    //Escriu un mètode que calculi la suma de tots els elements d’un array que es passa per paràmetre.
    public static int suma(int[] valor){
        int suma = 0;
        for (int i = 0; i < valor.length; i++) {
            suma += valor[i];
        }
        return suma;
    }

    //Escriu un mètode que dupliqui cada valor dins d’un array d’int rebut per paràmetre.
    // El mètode retorna l’array resultant.
    public static int[] duplicat(int[] valor){
        for (int i = 0; i < valor.length ; i++) {
            valor[i] *= 2;
            System.out.println(valor[i]);
        }
        return valor;
    }
    //Escriu un mètode que retorni la combinació de dos arrays passats per paràmetre.
    // L’array resultant haurà tendrà primer totes les dades del primer array i seguidament totes les del segon
    public static void main(String[] args) {
        calculadora();
    }
    public static int[] combinats(int[] valor1, int[] valor2){
        int[]valorFinal = new int[valor1.length + valor2.length];
        int x = 0;
        for (int i = 0; i < valor1.length; i++) {
             valorFinal[x] = valor1[i];
             x++;
        }
        for (int i = 0; i < valor2.length; i++) {
            valorFinal[x] = valor2[i];
            x++;
        }
        for (int i = 0; i < valorFinal.length; i++) {
            System.out.print(valorFinal[i] + " ");
        }
        return valorFinal;
    }
    //Escriu un mètode que retorni la combinació de dos arrays passats per paràmetre d’igual tamany,
    // intercalant les dades. És a dir, en aquest ordre:
    //1) Primer element del primer array
    //2) Primer element del segon array
    //3) Segon element del primer array
    //4) Segon element del segon array
    //5) . . .
    public static int[] intercalada(int[]valor1,int[]valor2){
        int[]valorFinal = new int[valor1.length+valor2.length];
        int x = 0;
        for (int i = 0; i < valorFinal.length; i++) {
            if (i<valor1.length){
                valorFinal[x] = valor1[i];
                x++;}
            if (i<valor2.length){
                valorFinal[x] = valor2[i];
                x++;}
        }
        for (int i = 0; i < valorFinal.length; i++) {
            System.out.print(valorFinal[i]+" ");
        }
        return valorFinal;
    }

    //Escriu un programa calculadora que proporcioni les següents opcions i on cada operació cridi a un mètode
    // que retorni el resultat de l’operació.
    //		1) Sumar dos números
    //2) Restar dos números
    //3) Multiplicar dos números
    //4) Dividir dos números
    //0) Sortir
    public static int calculadora() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Ingrese la opcion que desea realizar: \n1)Sumar dos numeros\n2)Restar dos numeros" +
                "\n3)Multiplicar dos numeros\n4)Dividir dos numeros\n0)Sortir");
        int eleccion = insert.nextInt();
        ;
        int n1 = 0;
        int n2 = 0;
        switch (eleccion) {
            case 0:
                break;
            case 1:
                System.out.println("Ingrese el primer numero");
                n1 = insert.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = insert.nextInt();
                return suma(n1, n2);
            case 2:
                System.out.println("Ingrese el primer numero");
                n1 = insert.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = insert.nextInt();
                return resta(n1, n2);
            case 3:
                System.out.println("Ingrese el primer numero");
                n1 = insert.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = insert.nextInt();
                return multiplicacio(n1, n2);
            case 4:
                System.out.println("Ingrese el primer numero");
                n1 = insert.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2 = insert.nextInt();
                return divisio(n1, n2);
            default:
                System.out.println("El valor introducido no corresponde a ninguna operacion");
        }
        return 0;
    }
    public static int suma(int n1, int n2){
        return n1 + n2;
    }
    public static int resta(int n1, int n2){
        return n1 - n2;
    }
    public static int multiplicacio(int n1, int n2){
        return n1*n2;
    }public static int divisio(int n1, int n2){
        return n1/n2;
    }

    //Escriu un programa de canvi de moneda que per a una quantitat introduïda per pantalla,
    // mostri l’equivalent en les següents monedes. Cada conversió ha de ser un mètode diferent,
    // que retorni el valor del canvi de moneda.
    //Dòlar estatunidenc
    //Lliura esterlina
    //Yen Japonès
    //Pes argentí
    //Pes filipí
    public static void intercanviMoneda(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Introdueix la cuantitat");
        double cuantiat = insert.nextDouble();
        System.out.println("En dolar estadounidenc es: " + dolarEstadounidenc(cuantiat));
        System.out.println("En lliura esterlina es: " + lliuraEsterlina(cuantiat));
        System.out.println("En yen japones es: " + yenJapones(cuantiat));
        System.out.println("En pes argenti es: " + pesArgenti(cuantiat));
        System.out.println("En pes filipi es: " + pesFilipi(cuantiat));
    }
    public static double dolarEstadounidenc(double cuantitat){
        return cuantitat*0.95;
    }
    public static double lliuraEsterlina(double cuantitat){
        return cuantitat*1.15;
    } public static double yenJapones(double cuantitat){
        return cuantitat*0.0063;
    }
    public static double pesArgenti(double cuantitat){
        return cuantitat*0.0027;
    }
    public static double pesFilipi(double cuantitat){
        return cuantitat*0.017;
    }

    //Escriu un programa de càlcul d’àrea de diferents formes geomètriques.
    // Cada càlcul ha de estar definit dins d’un mètode. Les dades necessàries es demanaran a l’usuari:
    //1) Rectangle
    //2) Triangle
    //3) Cercle
    //4) Pentàgon regular
    //0) Sortir
    public static void calcularArea(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Eliga la forma que desea calcular el area: \n1)Recangle\n2)Triangle" +
                "\n3)Cercle\n4)Pentagon Regular\n0)Sortir");
        int next = insert.nextInt();
        switch (next){
            case 0: sortir();
            case 1:rectangle();
            case 2:triangle();
            case 3:cercle();
            case 4:pentagoRegular();
            default:
                System.out.println("El nombre introduit no correspon a cap operacio");
        }
    }

    public static int rectangle(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Introduce el ladoA");
        int ladoA = insert.nextInt();
        System.out.println("Introduce el ladoB");
        int ladoB = insert.nextInt();
        return ladoA*ladoB;
    }
    public static int triangle(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = insert.nextInt();
        System.out.println("Introduce la altura");
        int altura = insert.nextInt();
        return base*altura/2;
    }
    public static double cercle(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Introduce el radio");
        double radio = insert.nextInt();
        return (radio*Math.PI)/2;
    }
    public static double pentagoRegular(){
        Scanner insert = new Scanner(System.in);
        System.out.println("Introduce el perimetro");
        int perimetro = insert.nextInt();
        System.out.println("Introduce el apotema");
        int apotema = insert.nextInt();
        return (perimetro*apotema)/2;
    }
    public static void sortir(){

    }


}
