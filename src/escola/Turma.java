
package escola;


public class Turma {
    private String nomeTurma;
    private Aluno[] aluno = new Aluno[0];

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
    
    public void ExibirAlunos(){
        for(int i = 0; i < aluno.length; i++) 
            System.out.printf("Turma: ", i, aluno[ i ]); 
    }
}
