
package escola;
import java.util.ArrayList;

public class Start {


    public static void main(String[] args) {
        Escola e = new Escola();
        e.setNome("ETEC De João Ninguém");
        e.getNome();

        ArrayList<Aluno> a = new ArrayList<Aluno>();
        Aluno a1 = new Aluno();
        a1.setNome("Alfredo");
        a1.setNota1(2);
        a1.setNota2(3);
        a1.setNota3(4);
        a1.setNota4(5);
        
        Aluno a2 = new Aluno();
        a2.setCodAluno(03);
        a2.setNome("Edilson");
        a2.setNota1(5);
        a2.setNota2(1);
        a2.setNota3(7);
        a2.setNota4(9);
        
        Aluno a3 = new Aluno();
        a3.setCodAluno(04);
        a3.setNome("Clóvis Basilio");
        a3.setNota1(9);
        a3.setNota2(9);
        a3.setNota3(9);
        a3.setNota4(9);
        
        Aluno a4 = new Aluno();
        a4.setCodAluno(05);
        a4.setNome("Robson");
        a4.setNota1(2);
        a4.setNota2(3);
        a4.setNota3(4);
        a4.setNota4(8);
        
        Aluno a5 = new Aluno();
        a5.setCodAluno(06);
        a5.setNome("Edilson");
        a5.setNota1(1);
        a5.setNota2(1);
        a5.setNota3(1);
        a5.setNota4(1);
        
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);
        a.add(a5);
      
        ArrayList<Aluno> aa = new ArrayList<Aluno>();
        Aluno a6 = new Aluno();
        a6.setNome("Alfredo");
        a6.setNota1(2);
        a6.setNota2(3);
        a6.setNota3(4);
        a6.setNota4(5);
        
        Aluno a7 = new Aluno();
        a7.setCodAluno(03);
        a7.setNome("Edilson");
        a7.setNota1(5);
        a7.setNota2(1);
        a7.setNota3(7);
        a7.setNota4(9);
        
        Aluno a8 = new Aluno();
        a8.setCodAluno(04);
        a8.setNome("Clóvis Basilio");
        a8.setNota1(9);
        a8.setNota2(9);
        a8.setNota3(9);
        a8.setNota4(9);
        
        Aluno a9 = new Aluno();
        a9.setCodAluno(05);
        a9.setNome("Robson");
        a9.setNota1(2);
        a9.setNota2(3);
        a9.setNota3(4);
        a9.setNota4(8);
        
        Aluno a10 = new Aluno();
        a10.setCodAluno(06);
        a10.setNome("Edilson");
        a10.setNota1(1);
        a10.setNota2(1);
        a10.setNota3(1);
        a10.setNota4(1);
        
        aa.add(a6);
        aa.add(a7);
        aa.add(a8);
        aa.add(a9);
        aa.add(a10);
      
        
        Turma t1 = new Turma();
        t1.setNomeTurma("Turma B");
        t1.getNomeTurma();
        t1.ExibirAlunos();
        t1.setA(a);
        t1.ExibirAlunos();
        
        Turma t2 = new Turma();
        t2.setNomeTurma("Turma A");
        t2.getNomeTurma();
        t2.ExibirAlunos();
        t2.setA(aa);
        
        
        
        ArrayList<Turma> t= new ArrayList<Turma>();
        
       
        
    }
    
}
