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

        boolean flag = true;
        while (flag) {
            System.out.println("-----------------------------");
            System.out.println("Menu");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Ordenar por ordem crescente");
            System.out.println("4 - Ordenar por ordem decrescente");
            System.out.println("5 - Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:

                        sc.nextLine();
                        System.out.println("Nome: ");
                        String nomeProd = sc.nextLine();
                        System.out.println("Preco ");
                        double precoprod = sc.nextDouble();
                        System.out.println("genero: ");
                        sc.nextLine();
                        String tipoprod = sc.nextLine();
                        Produto prod = new Produto(nomeProd, precoprod, tipoprod);
                        a.escrever(prod);
                        break;


                case 2:
                    ArrayList<Produto> produtos = a.ler();
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Genero: " + produtos.get(i).getTipo());
                        System.out.println("Preco: " + produtos.get(i).getPreco());
                    }
                    break;

                case 3:
                    produtos = a.ler();
                    Collections.sort(produtos);
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Tipo " + produtos.get(i).getTipo());
                        System.out.println("Preco " + produtos.get(i).getPreco());
                    }
                    break;

                case 4:
                    produtos = a.ler();
                    Collections.sort(produtos, Collections.reverseOrder());
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Tipo " + produtos.get(i).getTipo());
                        System.out.println("Preco " + produtos.get(i).getPreco());
                    }
                    break;
                case 5:
                    flag = false;
                    break;

            }
        }
    }
}