package model;

import java.util.ArrayList;

public class Turma {
    private String Edicao;
    private ArrayList<Aluno> aluno = new ArrayList();
    private Professor professor;

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String Edicao) {
        this.Edicao = Edicao;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
