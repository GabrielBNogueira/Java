import java.util.Scanner;

public class Crud {
    Scanner leitor;

    public AlunoGraduacao createAlunoGraduacao(){
        AlunoGraduacao novoAluno = new AlunoGraduacao();
        createAluno(novoAluno);

        System.out.println("Digite o TCC: ");
        String tcc = leitor.next();

        novoAluno.trabalhoConclusao = tcc;

        return novoAluno;
    }

    public AlunoPosGraduacao createAlunoPosGraduacao(){
        AlunoPosGraduacao novoAluno = new AlunoPosGraduacao();
        createAluno(novoAluno);

        System.out.println("Digite o orientador: ");
        String orientador = leitor.next();

        novoAluno.orientador = orientador;

        return novoAluno;
    }

    private void createAluno(Aluno novoAluno){
        System.out.println("Digite o nome: ");
        String nome = leitor.next();
        System.out.println("Digite a matricula: ");
        String matricula = leitor.next();
        System.out.println("Digite a nota: ");
        double nota = leitor.nextDouble();

        novoAluno.setNome(nome);
        novoAluno.setMatricula(matricula);
        novoAluno.setNota(nota);
    }
}
