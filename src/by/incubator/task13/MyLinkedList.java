package by.incubator.task13;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MyLinkedList <T> implements List<T> {
    private Node first;
    private Node last;
    private int size = 0;

    MyLinkedList() {
        first = new Node();
        last = first;
    }

    public boolean add(T value) {
        Node newNode = new Node(value);
        newNode.prev = first;
        first.next = newNode;
        first = newNode;
        size++;

        return true;
    }

    @Override
    public T get(int index) {
        return (T) find(index).value;
    }

    @Override
    public T remove(int index) {
        Node removed = find(index);
        Node pointer = removed.next;

        if (removed.next != null && removed.prev != null) {
            while (pointer.next != null) {
                pointer.index -= 1;
                pointer = pointer.next;
            }
            pointer.index -= 1;
            removed.next.prev = removed.prev;
            removed.prev.next = removed.next;
            removed.next = null;
            removed.prev = null;
        } else if (removed.next == null) {
            removed.prev.next = null;
            removed.prev = null;
        } else if (removed.prev == null) {
            while (pointer.next != null) {
                pointer.index = pointer.prev.index;
                pointer = pointer.next;
            }
            removed.next.prev = null;
            removed.next = null;
        }
        size--;
        return (T) removed.value;
    }

    private Node find(int index) {
        Node pointer = last.next;

        while (pointer.index != index) {
            if (pointer.next != null) {
                pointer = pointer.next;
            }
        }
        return pointer;
    }

    static class Node <T>{
        T value;
        Node prev;
        Node next;
        int index;

        static int counter = 0;

        Node () {}

        Node (T value) {
        this.value = value;
        this.index = counter++;
        }
}

    @Override
    public int size() {
        return this.size;
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
    public void forEach(Consumer<? super T> action) {
        List.super.forEach(action);
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
    public boolean removeIf(Predicate<? super T> filter) {
        return List.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<T> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        List.super.sort(c);
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

    @Override
    public Spliterator<T> spliterator() {
        return List.super.spliterator();
    }

    @Override
    public Stream<T> stream() {
        return List.super.stream();
    }

    @Override
    public Stream<T> parallelStream() {
        return List.super.parallelStream();
    }
}
