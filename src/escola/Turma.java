
package escola;
import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private ArrayList<Aluno> a= new ArrayList<Aluno>();

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public ArrayList<Aluno> getA() {
        return a;
    }

    public void setA(ArrayList<Aluno> a) {
        this.a = a;
    }
    public void ExibirAlunos(){
        System.out.println(a); 
    }
}
