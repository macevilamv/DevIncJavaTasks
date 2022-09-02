package by.incubator.task14;

import java.util.*;

public class MyHashSet<K> implements Set<K> {
    private HashMap<K, Object> storage;
    private static final Object holder = new Object();

    public MyHashSet() {
        storage = new HashMap<>();
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean add(K k) {
        return storage.put(k, storage) == null;
    }

    @Override
    public boolean remove(Object o) {

        return storage.remove(o) == storage;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return storage.containsKey(o);
    }

    @Override
    public Iterator<K> iterator() {
        return storage.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
}
