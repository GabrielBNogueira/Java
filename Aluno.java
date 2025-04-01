public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getNota() {
        return nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

    public void exibirDetalhes(){
        System.out.printf("\nNome: %s", nome);
        System.out.printf("\nMatricula: %s", matricula);
        System.out.printf("\nNota: %f", nota);
    }
}
