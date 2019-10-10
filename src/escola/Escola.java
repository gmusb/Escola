
package escola;

public class Escola {
    private String nome;
    private Turma[] turma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma[] getTurma() {
        return turma;
    }

    public void setTurma(Turma[] turma) {
        this.turma = turma;
    }
    
    
    public void ExibirTurma(){
        for(int i = 0; i < turma.length; i++) 
            System.out.printf("Turma: ", i, turma[ i ]); 
        } 
}
