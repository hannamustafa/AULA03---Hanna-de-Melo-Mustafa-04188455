package atividade03;

public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(12345, "Luna Soares", 8.5, 3.0);
        Aluno aluno2 = new Aluno(67890, "Gabi Makarem", 7.0, 9.0);

        aluno1.dadosAluno();
        aluno1.media();
        aluno1.aprovacao();

        System.out.println();

        aluno2.dadosAluno();
        aluno2.media();
        aluno2.aprovacao();

        System.out.println();
    }
    
}
