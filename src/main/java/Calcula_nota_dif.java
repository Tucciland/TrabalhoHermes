import java.util.Scanner;

public class Calcula_nota_dif {

    public void calculodif(int dif_qnt_questoes, String dif_gabarito, int y, int dif_qnt_provas,
            double valor_quest_dif[]) {

        String dif_quest_aluno;
        String[] dif_nome_aluno = new String[dif_qnt_provas];
        int cont = 0;
        double[] dif_nota_aluno = new double[dif_qnt_provas];

        Scanner d = new Scanner(System.in);

        // ENTRADA DA VARIAVEL DO NOME DO ALUNO NO QUAL A PROVA ESTÁ SENDO CORRIGIDA.
        System.out.println("Qual e o nome do aluno?: ");
        dif_nome_aluno[y] = d.next();

        // ENTRADA DA VARIAVEL QUE PEDE O GABARITO DA PROVA DO ALUNO.
        System.out.println("Entre com o gabarito do aluno: ");
        dif_quest_aluno = d.next();

        // CICLO DE REPETIÇÃO PARA AVALIAR SE A RESPOSZ\TA DO ALUNO BATE COM A RESPOSTA
        // DO PROFESSOR.
        for (int j = 0; j < dif_qnt_questoes; j++) {

            if (dif_quest_aluno.charAt(j) == dif_gabarito.charAt(j)) {

                // CALCULO DA NOTA DO ALUNO CASO AS QUESTÕES SEJAM DE VALORES DIFERENTES.
                dif_nota_aluno[cont] += valor_quest_dif[j];
                System.out.println("Questao " + (j + 1) + " CORRETA.");

            } else {

                System.out.println("Questao " + (j + 1) + " INCORRETA.");

            }
        }

        // SAIDA DO NOME COM A NOTA DO ALUNO.
        System.out.println("\nNota do(a) " + dif_nome_aluno[y] + " e: " +
                dif_nota_aluno[cont]
                + "\n----------------------------------");

        cont++;

    }

}