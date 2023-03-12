import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int aluno = 1   ;
        int[] vetorProva = new int[7];
        int[] vetorGabarito = new int[7];
        System.out.println("Bem-Vindo Professor \n" +
                "Esse é o Sistema de Correção automatico da escola\n" +
                "Caso queira saber a nota de cada Aluno digite 1\n" +
                "Caso tenha entrado por engano digite qualquer número");
        int caso = sc.nextInt();
        if(caso == 1) {
            for(int k=0;k<10;k++) {
                Random random = new Random();
                for (int i = 0; i < 7; i++) {
                    vetorProva[i] = random.nextInt(5);
                    vetorGabarito[i] = random.nextInt(5);
                }
                for (int i = 0; i < vetorProva.length; i++) {
                    for (int j = 0; j < vetorGabarito.length; j++) {
                        if (vetorProva[i] == vetorGabarito[j]) {
                            contador++;
                        }
                    }
                }if(contador/2 >= 5){
                    System.out.println("Aluno " + aluno + ": " + contador/2 + " acertos. Voce foi aprovado.");
                }else{
                    System.out.println("Aluno " + aluno + ": " + contador/2 + " acertos. Voce esta de recuperaçãp");
                }

                aluno++;
                contador = 0;
            }
        }else {
            System.out.println("Obrigado por utilizar o Sistema de Correção automatico");
        }
    }}