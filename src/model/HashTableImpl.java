package model;

public class HashTableImpl<K, V> implements HashTable<K, V> {

    private static final int DEFAULT_CAPACITY = 10;

    private Node<K, V>[] table;
    private int size;

    public HashTableImpl() {
        this(DEFAULT_CAPACITY);
    }

    public HashTableImpl(int capacity) {
        table = new Node[capacity];
    }

    @Override
    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> node = table[index];

        if (node == null) {
            table[index] = new Node<>(key, value);
            size++;
        } else {
            while (node.next != null) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
                node = node.next;
            }

            node.next = new Node<>(key, value);
            size++;
        }
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }

        return null;
    }

    @Override
    public void remove(K key) {
        int index = hash(key);
        Node<K, V> node = table[index];

        if (node == null) {
            return;
        }

        if (node.key.equals(key)) {
            table[index] = node.next;
            size--;
            return;
        }

        Node<K, V> previous = node;
        node = node.next;

        while (node != null) {
            if (node.key.equals(key)) {
                previous.next = node.next;
                size--;
                return;
            }
            previous = node;
            node = node.next;
        }
    }

    public int size() {
        return size;
    }

    private int hash(K key) {
        return key.hashCode() % table.length;
    }

}