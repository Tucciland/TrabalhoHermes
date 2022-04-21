import java.util.Scanner;

public class CorrecaoProvas {
    public static void main(String[] args) {
        int v_dif, qnt_questoes, qnt_provas, contador = 0, contador2 = 0;
        double val_prova;
        String gabarito;

        Scanner s = new Scanner(System.in);

        // ENTRADA DA VARIAVEL QUE DEFINE SE AS QUNESTÕES DA PROVA TEM VALORES IGUAIS OU
        // NÃO.
        System.out.println("O valor das questoes sao iguais?: \n0=NAO\n1=SIM\nAguardando uma instrucao...");
        v_dif = s.nextInt();

        // CICLO WHILE PARA NÃO PEMITIR A ENTRADADE VALORES QUE NÃO SEJAM 1 OU 0.
        while (v_dif != 0 && v_dif != 1) {
            System.out.println(
                    "VALOR INVALIDO! \n Digite um valor valido!\nO valor das que1stoes sao iguais?: \n0=NAO\n1=SIM\nAguardando uma instrucao...");
            v_dif = s.nextInt();
        }

        // ENTRADA DA VARIAVEL QUE DEFINE QUANTAS QUESTÕES TEM A PROVA.
        System.out.println("Quantas questoes tem a prova?: ");
        qnt_questoes = s.nextInt();

        double[] valor_quest_dif = new double[qnt_questoes];

        // ENTRADA DA VARIAVEL QUE DEFINE QUANTAS PROVAS DEVEM SER CORRIGIDAS.
        System.out.println("Quantas provas serao corrigidas?: ");
        qnt_provas = s.nextInt();

        // ENTRADA DA VARIAVEL QUE PEDE QUAL É O GABARITO DO PROFESSOR (100% CORRETO).
        System.out.println("Entre com o gabarito correto:\nExemplo 'abcd'");
        gabarito = s.next();

        // TOMADA DE DECISÃO PARA O PROGRAMA SABER SE ELE DEVE CORRIGIR PROVAS COM
        // VALORES DE QUESTOES IGUAIS.
        if (v_dif == 1) {

            // CASO OS VALORES DAS QUESTÕES SEJAM IGUAIS ELE PEDE O VALOR DA PROVA.
            System.out.println("Qual e o valor da prova?: ");
            val_prova = s.nextDouble();

            // CRIACÃO DA CHAMADA DA CLASSE PARA CALCULAR NOTAS NO CASO DAS QUESTÕES SEREM
            // DE MESMO VALOR.
            Calcula_nota_ig teste = new Calcula_nota_ig();

            // CICLO DE REPETIÇÃO PARA CHAMAR A CLASSE ATÉ QUE O NUMERO DE PROVAS COLOCADAS
            // PELO USUARIO SEJA ATENDIDO.
            for (int i = 0; i < qnt_provas; i++) {

                // CHAMADA DA CLASSE QUE VAI CALCULAR AS NOTAS.
                teste.calculoig(qnt_questoes, gabarito, val_prova, contador, qnt_provas);
                contador++;

            }
        }

        // TOMADA DE DECISÃO PARA O PROGRAMA SABER SE ELE DEVE CORRIGIR PROVAS COM
        // VALORES DE QUESTOES DIFERENTES.
        else {

            // CRIACÃO DA CHAMADA DA CLASSE PARA CALCULAR NOTAS NO CASO DAS QUESTÕES SEREM
            // DE VALORES DIFERENTES.
            Calcula_nota_dif calc = new Calcula_nota_dif();

            // CICLO DE REPETIÇÃO PARA PEGAR OS VALORES DAS QUESTÕES DA PROVA (NO CASO
            // DIFERENTES).
            for (int i = 0; i < qnt_questoes; i++) {

                System.out.println("Qual é o valor da questão " + (contador2 + 1) + "?: ");
                valor_quest_dif[i] = s.nextDouble();
                contador2++;

            }

            // CICLO DE REPETIÇÃO PARA CHAMAR A CLASSE ATÉ QUE O NUMERO DE PROVAS COLOCADAS
            // PELO USUARIO SEJA ATENDIDO.
            for (int i = 0; i < qnt_provas; i++) {

                calc.calculodif(qnt_questoes, gabarito, contador, qnt_provas, valor_quest_dif);
                contador++;

            }
        }

    }
}
