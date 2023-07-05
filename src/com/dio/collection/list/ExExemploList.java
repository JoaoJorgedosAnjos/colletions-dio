package com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;



public class ExExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(1d);
        notas.add(2.2);
        notas.add(9.1);
        notas.add(5.8);
        notas.add(8.5);
        notas.add(10.5);

        System.out.println(notas.get(0));
        notas.remove(0);
        System.out.println(notas);

    }
    /*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/


}
