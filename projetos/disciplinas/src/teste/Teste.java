package teste;

import java.util.ArrayList;
import model.*;

public class Teste {
    public static void main(String[] args) {
        //alunos
        Aluno a1 = new Aluno(1212, "Arthur");
        Aluno a2 = new Aluno(1234, "João");
        Aluno a3 = new Aluno(1290, "Ewerton");
        Aluno a4 = new Aluno(6722, "Iris");
        Aluno a5 = new Aluno(3526, "William");
        
        Aluno a10 = new Aluno(3344, "Leonardo");
        Aluno a11 = new Aluno(5544, "Benk");
        Aluno a12 = new Aluno(7878, "Junior");
        Aluno a13 = new Aluno(7655, "Thiago");
        Aluno a14 = new Aluno(8877, "Priscila");
        
        //array de alunos
        ArrayList<Aluno> alunos1 = new ArrayList();
        alunos1.add(a1);
        alunos1.add(a2);
        alunos1.add(a3);
        alunos1.add(a4);
        alunos1.add(a5);
        
        ArrayList<Aluno> alunos2 = new ArrayList();
        alunos2.add(a10);
        alunos2.add(a11);
        alunos2.add(a12);
        alunos2.add(a13);
        alunos2.add(a14);
        
        //professor
        Professor p1 = new Professor();
        p1.setNome("Alencar");
        p1.setSiape(99999999);
        
        //turmas
        Turma t1 = new Turma();
        t1.setEdicao("2018/1");
        t1.setProfessor(p1);
        t1.setAluno(alunos1);
        
        Turma t2 = new Turma();
        t2.setEdicao("2018/2");
        t2.setProfessor(p1);
        t2.setAluno(alunos2);
        
        //array de turmas
        ArrayList<Turma> turmas = new ArrayList();
        turmas.add(t1);
        turmas.add(t2);
        
        //disciplina
        Disciplina d1 = new Disciplina();
        d1.setNome("Programação Orientada a Objetos");
        d1.setCurso("Sistemas Para Internet");
        d1.setTurma(turmas);
        
        view(d1);
    }
    
    //metodo para printar os dados(opcional)
    public static void view(Disciplina d1){
        System.out.println("Disciplinas\n");
        System.out.println("Nome: " + d1.getNome());
        System.out.println("Curso: " + d1.getCurso());
        System.out.println("\nTurmas\n");
        d1.getTurma().stream().map((t) -> {
            System.out.println("Edicão: " + t.getEdicao());
            return t;
        }).map((t) -> {
            System.out.println("\nProfessor: " + t.getProfessor().getNome());
            return t;
        }).map((t) -> {
            System.out.println("\nAlunos: ");
            return t;
        }).map((t) -> {
            t.getAluno().stream().map((a) -> {
                System.out.println("Matrícula: " + a.getMatricula());
                return a;
            }).forEachOrdered((a) -> {
                System.out.println("Nome: " + a.getNome());
            });
            return t;
        }).forEachOrdered((_item) -> {
            System.out.println("\n");
        });
    }
}
