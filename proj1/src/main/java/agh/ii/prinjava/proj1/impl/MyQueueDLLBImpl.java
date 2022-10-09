package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems = new DLinkList<>();

    /**
     * Removes the end of the line (first new value)
     * @return last element
     */
    @Override
    public void enqueue(E x) {
        this.elems.addLast(x);
    }

    /**
     * removes the last value of the queue (the first assigned in the queue)
     * @return first element
     */
    @Override
    public E dequeue() {
        return this.elems.removeFirst();
    }

    /**
     * Counts the number of elements in the queue
     * @return number of elements
     */
    @Override
    public int numOfElems() {
        return this.elems.Count();
    }

    /**
     *Returns the head of the queue without removing it
     * @return first in the queue
     */
    @Override
    public E peek() {
        E last = this.elems.removeLast(); //removeLast() used to get the value
        this.elems.addLast(last);// the value back to the queue
        return last;
    }
}
