package by.incubator.task14;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V> implements Map<K,V> {
    private Node<K,V>[] table;
    private final static int DEFAULT_CAPACITY = 16;
    private final static double DEFAULT_LOAD_FACTOR = 0.75d;
    private final static double EXPANDABILITY_FACTOR = 0.4;
    private int capacity;
    private int size;
    private double loadFactor;

    public MyHashMap () {
        this.capacity = DEFAULT_CAPACITY;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        table = new Node[DEFAULT_CAPACITY];
    }

    public MyHashMap(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        table = new Node[capacity];
    }

    @Override
    public V get(Object key) {
        int index = indexFor(hash((K) key));
        Node<K, V> pointer = table[index];

        if (table[index] == null) {
            return null;
        } else if (!((K) key).equals(table[index].key)) {
            return findValue((K) key, pointer);
        } else {
            return table[index].value;
        }
    }

    @Override
    public V put(K key, V value) {
       Node<K,V> added;
       int index = indexFor(hash(key));

       if (size >= capacity * loadFactor) {
           table = expandTable();
       }

       if (table[index] == null) {
           table[index] = new Node<>(key, value);
       } else if (table[index].key != key) {
           added = new Node<>(key, value);
           added.next = table[index];
           table[index] = added;
       } else {
           added = new Node<>(key, value);
           added.next = table[index].next;
           table[index] = added;
       }
       size++;

       return table[index].value;
    }

    private Node<K,V>[] expandTable() {
        Node<K,V>[] expanded = new Node[capacity + (int)(capacity * EXPANDABILITY_FACTOR)];
        System.arraycopy(table, 0, expanded, 0, capacity);

        return expanded;
    }

    @Override
    public V remove(Object key) {
        int index = indexFor(hash((K) key));
        Node<K,V> rmObj = table[index];

        if (table[index].next == null) {
            table[index] = null;
        } else {
            table[index] = table[index].next;
        }
        size--;

        return rmObj.value;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return (get(key) == null)? defaultValue : get(key);
    }

    private static class Node<K,V> implements Map.Entry<K,V> {
        final K key;
        V value;
        Node<K,V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return value;
        }
    }

    @Override
    public boolean remove(Object key, Object value) {
        return Map.super.remove(key, value);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }


    private int hash(K key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    private int indexFor(int hash) {
        return hash & (capacity - 1);
    }

    private V findValue(K key, Node <K,V> pointer) {
        while (!(key.equals(pointer.key))) {
            pointer = pointer.next;
        }
        return pointer.value;
    }
}
