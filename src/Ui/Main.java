package Ui;

import model.HashTable;
import model.HashTableImpl;

public class Main {

    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTableImpl<>();

        hashTable.put(1, "Uno");
        hashTable.put(2, "Dos");
        hashTable.put(3, "Tres");

        System.out.println("El valor de la clave 1 es: " + hashTable.get(1));
        System.out.println("El valor de la clave 2 es: " + hashTable.get(2));
        System.out.println("El valor de la clave 3 es: " + hashTable.get(3));

        hashTable.remove(2);

        System.out.println("El valor de la clave 2 es: " + hashTable.get(2));

        System.out.println("El tamaño de la tabla es: " + hashTable.size());
    }

}
