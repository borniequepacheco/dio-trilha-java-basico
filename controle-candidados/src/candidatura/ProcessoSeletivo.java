
package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        // selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "JOSE", "MARCELO", "ANA", "PEDRO", "FABRICIO", "MIRELA", "JULIO", "BORNIEQUE",
                "BAREZI" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }

    //    for (String candidato : candidatos) {
    //        System.out.println("O candidato selecionado foi " + candidato);
    //    }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "JOSE", "MARCELO", "ANA", "PEDRO", "FABRICIO", "MIRELA", "JULIO", "BORNIEQUE",
                "BAREZI" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            candidatosSelecionados++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(2001, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase >= salarioPretendido) {
            System.out.println("Ligar parao candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}
