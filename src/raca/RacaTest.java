package raca;

public class RacaTest {
    public static void main(String[] args) {


        Raca[] racas = new Raca[4];
        racas[0] = new Raca(001, "GOLDEN RETRIEVER", "CACHORRO", "ALEMANHA");
        racas[1] = new Raca(002, "ARARA-AZUL", "AVES", "BRASIL");
        racas[2] = new Raca(003, "PANDA", "PANDA", "ESTADOS UNIDOS");
        racas[3] = new Raca(004, "ZEBRA", "ZEBRA", "MADAGASTAR");


    resultadoTeste(racas[0].analisarExtincao(true, false, true, true) == true,
                "  COLOCANDO O 1º ELEMENTO EM EXTINÇÃO");

    resultadoTeste(racas[3].analisarExtincao(true, true, true, true)== true,
                "  COLOCANDO O 4° ELEMENTO EM EXTINÇÃO");


    resultadoTeste(racas[0].analisarExtincao(false, true, true, false) == false,
                "  COLOCANDO O 1º ELEMENTO FORA DE EXTINÇÃO");

    }

    public static void resultadoTeste(Boolean valor, String texto) {
        final String RES_VERDE = "\u001B[32m";
        final String RES_VERMELHO = "\u001B[31m";
        final String RES_RESTART = "\u001B[0m";

        System.out.println((valor ? RES_VERDE + "PASSSOU" :
                RES_VERMELHO + "NÃO PASOU ") + RES_RESTART + texto);
    }
}
