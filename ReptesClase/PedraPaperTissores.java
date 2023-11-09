package ReptesClase;

import java.util.Scanner;

public class PedraPaperTissores {
    public static String eleccioJugador(){
        Scanner insert = new Scanner(System.in);
        String triar;
        do {
            System.out.println("Tria una opcio (pedra, paper, tisores)");
            triar = insert.next();
        } while (!triar.equals("pedra")&&!triar.equals("paper")&&!triar.equals("tisores"));
        return triar;
    }

    public static void main(String[] args) {
        System.out.println("Benvingut al joc pedra, paper, tisores!");
        int contadorComputadora = 0;
        int contadorJugador = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Joc " + (i+1));
            String jugador  = eleccioJugador();
            String computador = eleccioComputadora();
            System.out.println("La computadora tria " + computador);
            String guanyador = determinarGuanyador(jugador,computador);
            System.out.println();
            if (guanyador.equals("computadora")){
                contadorComputadora++;
            } else if (guanyador.equals("jugador")) {
                contadorJugador++;
            }
        }
        if (contadorComputadora>contadorJugador){
            System.out.println("Joc finalitzat. Enhorabona computador, has guanyat!");
        } else if (contadorJugador>contadorComputadora) {
            System.out.println("Joc finalitzat. Enhorabona jugador, has guanyat!");
        }else {
            System.out.println("Joc finalitzat. Heu empatat");
        }
    }
    public static String eleccioComputadora(){
        int numeroAleatorio = (int)(Math.random()*3+1);
        if (numeroAleatorio==1){
            return "pedra";
        } else if (numeroAleatorio==2) {
            return "paper";
        }else {
            return "tisores";
        }
    }

    public static String determinarGuanyador(String jugador, String computadora){

        if (jugador.equals(computadora)){
            System.out.println("empate");
            return "empate";
        }
        if (jugador.equals("pedra")){
            if (computadora.equals("paper")){
                System.out.println("guanya computadora");
                return "computadora";
            } else if (computadora.equals("tisores")) {
                System.out.println("guanya jugador");
                return "jugador";
            }
        }
        if (jugador.equals("paper")){
            if (computadora.equals("tisores")){
                System.out.println("guanya computadora");
                return "computadora";
            } else if (computadora.equals("pedra")) {
                System.out.println("guanya jugador");
                return "jugador";
            }
        }
        if (jugador.equals("tisores")){
            if (computadora.equals("pedra")){
                System.out.println("guanya computadora");
                return "computadora";
            } else if (computadora.equals("paper")) {
                System.out.println("guanya jugador");
                return "jugador";
            }
        }
        return "errada";
    }
}
