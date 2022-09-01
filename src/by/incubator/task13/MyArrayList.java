package by.incubator.task13;

import java.util.*;

public class MyArrayList<T> implements List<T> {
    private final static Object [] ZERO_CAPACITY_ARRAY = {};
    private final int DEFAULT_CAPACITY = 10;
    private int capacity = 0;
    private int size = 0;
    private Object[] buffer;

    public MyArrayList() {
        buffer = new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;

        if (capacity == 0) {
            buffer = ZERO_CAPACITY_ARRAY;
        } else {
            buffer = new Object[capacity];
        }
    }

    @Override
    public boolean add(T object) {
        buffer[size++] = object;

        if (size >= capacity)
            buffer = expandBuffer();

        return true;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Error! Unacceptable index value.");

        T rmObj = (T) buffer[index];

        System.arraycopy(buffer, index + 1, buffer, index, size - index - 1);
        buffer[size - 1] = null;
        size--;

        return rmObj;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Error! Unacceptable index value.");

        return (T) buffer[index];
    }

    private Object[] trimBuffer() {
        Object[] trimmedBuffer = new Object[size];
        System.arraycopy(buffer, size, trimmedBuffer, 0, size);

        return trimmedBuffer;
    }

    private Object[] expandBuffer() {
        Object[] expandedBuffer = new Object[(int) (size + (size * 0.4))];
        this.capacity = (int) (size + (size * 0.4));
        System.arraycopy(buffer, 0, expandedBuffer, 0, size);

        return expandedBuffer;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
