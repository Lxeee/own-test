package com.test.program.example.SuanFaTest;

public class SingleLinkedFanZhuan {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        Node res = reverseListNode(n1);
        res.getNext();



    }

    public static Node reverseListNode(Node head){
        //递归终止条件是当前为空，或者下一个节点为空
        if(head==null || head.getNext()==null) {
            return head;
        }
        //这里的cur就是最后一个节点
        Node cur = reverseListNode(head.getNext());
        //这里请配合动画演示理解
        //如果链表是 1->2->3->4->5，那么此时的cur就是5
        //而head是4，head的下一个是5，下下一个是空
        //所以head.next.next 就是5->4
        head.getNext().setNext(head);
        //防止链表循环，需要将head.next设置为空
        head.setNext(null);
        //每层递归函数都返回cur，也就是最后一个节点
        return cur;
  }

}

class Node {

    private Object data;//数据域
    private Node next;//指针域

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}