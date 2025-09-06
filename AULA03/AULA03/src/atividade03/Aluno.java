package atividade03;

public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;
    public Aluno() {
    }

    public Aluno(int matricula, String nome, double notaAv1, double notaAv2) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void dadosAluno(){
        System.out.println("Nome: " + nome + ", Matricula: " + matricula + ", Nota AV1: " + notaAv1 + ", Nota AV2: " + notaAv2);
    }

    public  void media() {
        double media = (notaAv1 + notaAv2) / 2;
        System.out.printf("Média: %.2f%n", media);
    }

    public void aprovacao(){
        double media = (notaAv1 + notaAv2) / 2;
        if (media >= 7) {
            System.out.println("Aprovado.");
        } else if (media >= 4 && media < 7) {
            System.out.println("Prova final.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
