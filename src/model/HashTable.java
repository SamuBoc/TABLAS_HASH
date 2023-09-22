package model;

public interface HashTable<K, V> {

    // Inserta un elemento en la tabla
    void put(K key, V value);

    // Obtiene un elemento de la tabla
    V get(K key);

    // Elimina un elemento de la tabla
    void remove(K key);

    // Devuelve el número de elementos de la tabla
    int size();

}