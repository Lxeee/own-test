package com.test.program.example.SuanFaTest;

import javax.validation.constraints.Max;

public class HeBingNode {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode l1 = head1;

        l1.next = new ListNode(1);
        l1 = l1.next;
        l1.next = new ListNode(3);
        l1 = l1.next;
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(5);
        l1 = l1.next;

        ListNode head2 = new ListNode(0);
        ListNode l2 = head2;

        l2.next = new ListNode(2);
        l2 = l2.next;
        l2.next = new ListNode(5);
        l2 = l2.next;
        l2.next = new ListNode(7);
        l2 = l2.next;
        l2.next = new ListNode(8);
        l2 = l2.next;




    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2!=null) {
            return l2;
        }
        if (l2==null && l1!=null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
