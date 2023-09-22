package model;

public class Node<K, V> {

    protected K key;
    protected V value;
    protected Node<K, V> next;

    public Node(K key, V value, Node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Node(K key, V value) {
        this(key, value, null);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public Node<K, V> getNext() {
        return next;
    }

}
