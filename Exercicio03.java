package com.company;
import java.util.Scanner;
/*
Faça um programa que receba:
O valor da conta de luz
Conta de água
Conta de telefone
Escola do filho
Fatura do cartão
Gastos com supermercado
... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".
*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor da conta de luz: ");
        Double valorContaDeLuz = scanner.nextDouble();
        System.out.print("Insira o valor da conta de água: ");
        Double valorContaDeAgua = scanner.nextDouble();
        System.out.print("Insira o valor da conta de telefone: ");
        Double valorContaDeTelefone = scanner.nextDouble();
        System.out.print("Insira o valor da escola do filho: ");
        Double valorContaDeEscola = scanner.nextDouble();
        System.out.print("Insira o valor da fatura do cartão: ");
        Double valorContaDeCartao = scanner.nextDouble();
        System.out.print("Insira o valor da conta do supermercado: ");
        Double valorContaDoSupermercado = scanner.nextDouble();
        int valorTotal = 0;
        valorTotal += valorContaDeLuz;
        valorTotal += valorContaDeAgua;
        valorTotal += valorContaDeTelefone;
        valorTotal += valorContaDeEscola;
        valorTotal += valorContaDeCartao;
        valorTotal += valorContaDoSupermercado;
        System.out.println("A conta final do mês deu: "+valorTotal);

    }

}