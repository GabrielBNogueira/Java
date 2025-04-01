import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int opcao;
        Aluno novoAluno = new Aluno();

        do{
            System.out.println("-Sistema de Gerenciamento de Alunos-");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Editar alunos");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Sair");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    int opcaoCadastro;
                    Crud cadastros = new Crud();
                    cadastros.leitor = leitor;
                    System.out.println("1 - Cadastro de Graduação");
                    System.out.println("1 - Cadastro de Pós Graduação");
                    opcaoCadastro = leitor.nextInt();

                    if (opcaoCadastro == 1){
                        novoAluno = cadastros.createAlunoGraduacao();
                    }else if(opcaoCadastro == 2){
                        novoAluno = cadastros.createAlunoPosGraduacao();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    novoAluno.exibirDetalhes();
                    break;
            }

        }while (opcao != 4);
    }
}
