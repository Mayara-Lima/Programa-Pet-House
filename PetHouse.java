package Exercicio03;

import java.util.Scanner;

public class PetHouse {
    static Animal x;

    public static void sejaBemVindo() {
        System.out.println("""
                Olá! Sejam bem vindos ao Pet House! Qual bichinho deseja hospedar?\s
                Digite:
                1- Cao\s
                2-Gato
                3- O animal não pode ser hospedado connosco""");
        Scanner input = new Scanner(System.in);
        int bichinho = input.nextInt();
        if (bichinho==1){
            x = new Cao();
            System.out.println("Será um prazer cuidar de do seu cão/cadela!");}
        else if (bichinho==2){
            x = new Gato();
            System.out.println("Será um prazer cuidar do(a) felino(a)!");}
        else { x = new Animal();
            System.out.println("Desculpe-nos, mas só hospedamos cães ou gatos.");}
    }
    public static void acao() {
        x.comer();
        x.dormir();
        x.brincar();
        x.ruido();
        x.banho();
    }

    public static void main(String[]args){
        sejaBemVindo();
        acao();

    }
}