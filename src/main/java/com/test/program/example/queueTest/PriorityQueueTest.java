package com.test.program.example.queueTest;


import com.sun.tools.classfile.LineNumberTable_attribute;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueueTest p = new PriorityQueueTest();
        p.offer(1);
       // p.offer(5);
        p.offer(2);
        p.offer(3);
       // p.offer(4);

        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());
        //System.out.println(p.poll());
      //  System.out.println(p.poll());

    }

    // non-private to simplify nested class access
    transient int modCount = 0;
    private int size = 0;
    // non-private to simplify nested class access
    transient Integer[] queue = new Integer[10];
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;


    /**
     * 添加节点
     * @param e
     * @return
     */
    public boolean offer(Integer e) {
        if (e == null){
            throw new NullPointerException();
        }
        modCount++;
        int i = size;
        if (i >= queue.length) {
            grow(i + 1);
        }
        size = i + 1;
        if (i == 0) {
            queue[0] = e;
        }
        else {
            siftUpComparable(i, e);
        }
        return true;
    }

    /**
     * 从上开始交换节点，用于add节点
     * @param k
     * @param x
     */
    private void siftUpComparable(int k, int x) {
        int key =  x;
        while (k > 0) {
            int parent = (k - 1) >>> 1;
            int e = queue[parent];
            if (key >= e) {
                break;
            }
            queue[k] = e;
            k = parent;
        }
        queue[k] = key;
    }

    /**
     * 扩容
     * @param minCapacity
     */
    private void grow(int minCapacity) {
        int oldCapacity = queue.length;
        // Double size if small; else grow by 50%
        int newCapacity = oldCapacity + ((oldCapacity < 64) ?
                (oldCapacity + 2) :
                (oldCapacity >> 1));
        // overflow-conscious code
        if (newCapacity - MAX_ARRAY_SIZE > 0) {
            newCapacity = hugeCapacity(minCapacity);
        }
        queue = Arrays.copyOf(queue, newCapacity);
    }

    /**
     *
     * @param minCapacity
     * @return
     */
    private static int hugeCapacity(int minCapacity) {
        // overflow
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        return (minCapacity > MAX_ARRAY_SIZE) ?
                Integer.MAX_VALUE :
                MAX_ARRAY_SIZE;
    }

    /**
     * 获取头节点
     * @return
     */
    public Integer poll() {
        if (size == 0){
            return null;
        }
        int s = --size;
        modCount++;
        Integer result =  queue[0];
        Integer x = queue[s];
        queue[s] = null;
        if (s != 0){
            siftDownComparable(0, x);
        }
        return result;
    }


    /**
     * 向下移动叶子节点 用于poll节点
     * @param k
     * @param x
     */
    private void siftDownComparable(int k, int x) {
        int key = x;
        // loop while a non-leaf
        int half = size >>> 1;
        while (k < half) {
            // assume left child is least
            int child = (k << 1) + 1;
            int c = queue[child];
            int right = child + 1;
            if (right < size && (c < queue[right])) {
                c = queue[child = right];
            }
            if (k <= c) {
                break;
            }
            queue[k] = c;
            k = child;
        }
        queue[k] = key;
    }
}
