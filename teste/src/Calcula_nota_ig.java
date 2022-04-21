import java.util.Scanner;

public class Calcula_nota_ig {

    public void calculoig(int i_qnt_questoes, String i_gabarito, Double i_val_prova, int x, int i_qnt_provas) {

        String i_quest_aluno;
        String[] i_nome_aluno = new String[i_qnt_provas];
        int contador1 = 0;
        double[] i_nota_aluno = new double[i_qnt_provas];

        Scanner i = new Scanner(System.in);

        // ENTRADA DA VARIAVEL DO NOME DO ALUNO NO QUAL A PROVA ESTÁ SENDO CORRIGIDA.
        System.out.println("Qual e o nome do aluno?: ");
        i_nome_aluno[x] = i.next();

        // ENTRADA DA VARIAVEL QUE PEDE O GABARITO DA PROVA DO ALUNO.
        System.out.println("Entre com o gabarito do aluno: ");
        i_quest_aluno = i.next();

        // CICLO DE REPETIÇÃO PARA AVALIAR SE A RESPOSTA DO ALUNO BATE COM A RESPOSTA DO
        // PROFESSOR.
        for (int j = 0; j < i_qnt_questoes; j++) {

            if (i_quest_aluno.charAt(j) == i_gabarito.charAt(j)) {

                contador1++;
                System.out.println("Questao " + (j + 1) + " CORRETA.");

            } else {

                System.out.println("Questao " + (j + 1) + " INCORRETA.");

            }
        }

        // CALCULO DA NOTA DO ALUNO CASO O VALOR DAS QUESTÕES SEJAM IGUAIS.
        i_nota_aluno[x] = (contador1 * i_val_prova) / i_qnt_questoes;

        // SAIDA DA NOME COM A NOTA DO ALUNO.
        System.out.println(
                "\nNota do(a) " + i_nome_aluno[x] + " e: " + i_nota_aluno[x] + "\n----------------------------------");

    }
}
