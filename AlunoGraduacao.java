public class AlunoGraduacao extends Aluno{
    String trabalhoConclusao;

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf("\nTCC: %s", trabalhoConclusao);
    }
}
