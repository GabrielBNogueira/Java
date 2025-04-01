public class AlunoPosGraduacao extends Aluno{
    String orientador;

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.printf("\nOrientador: %s", orientador);
    }
}
