package com.company;
import java.util.Scanner;
/*
crie um programa que receba o valor de um produto e exiba o valor final da compra. Esse valor fimal será o valor do
produto mais o valor do frete use o valor do frete com mais 15Reais[
caso seja maior  ou igual que 100 reais nao cobra o frete.
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        byte valorDoFrete = 15;
        boolean valoProdutoMaiorOuIgualACem = valorProduto >= 100;
        Double valorComFrete = valorProduto + valorDoFrete;
        if ( valoProdutoMaiorOuIgualACem) {
            System.out.println("O valor final é: " + valorProduto);
        } else {
            System.out.println("O valor do produto deu: "+valorComFrete);
        }
        scanner.close();
    }
}
