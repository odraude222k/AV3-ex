package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arquivo a = new Arquivo();

        Scanner sc = new Scanner(System.in);
        int ges = 0;
        int get = 0;
        int geb = 0;
        int gep = 0;

        boolean flag = true;
        while (flag) {
            System.out.println("-----------------------------");
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Ordenar por ordem crescente");
            System.out.println("4 - Mostrar quantidade de aluno por curso");
            System.out.println("5 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:

                    sc.nextLine();
                    System.out.println("Nome: ");
                    String nomeAluno = sc.nextLine();
                    System.out.println("Matricula ");
                    int matricula = sc.nextInt();
                    System.out.println("Curso: ");
                    sc.nextLine();
                    String curso = sc.nextLine();
                    System.out.println("Media");
                    float media = sc.nextFloat();

                    Aluno al = new Aluno(nomeAluno, matricula, curso, media);
                    a.escrever(al);
                    break;


                case 2:
                    ArrayList<Aluno> alunos = a.ler();
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matricula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Media: " + alunos.get(i).getMedia());
                    }
                    break;

                case 3:
                    alunos = a.ler();
                    Collections.sort(alunos);
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matricula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Media: " + alunos.get(i).getMedia());
                    }
                    break;

                case 4:
                    alunos = a.ler();

                    for (int i = 0; i < alunos.size(); i++) {

                       if( alunos.get(i).getCurso().equals("GES")){
                           ges++;
                       }
                       if ( alunos.get(i).getCurso().equals("GET")){
                           get++;
                       }
                       if ( alunos.get(i).getCurso().equals("GEB")){
                           geb++;
                       }
                       if ( alunos.get(i).getCurso().equals("GEP")){
                           gep++;
                       }
                    }
                    System.out.println("Alunos de GES: " + ges);
                    System.out.println("Alunos de GET: " + get);
                    System.out.println("Alunos de GEB: " + geb);
                    System.out.println("Alunos de GEP: " + gep);
                    break;
                case 5:
                    flag = false;
                    break;

            }
        }
    }
}