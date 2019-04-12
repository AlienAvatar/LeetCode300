package com.algr0412;

import com.util.ListNode;

import java.util.List;

public class IntersectionOfTwoLinkedList {
    /**
     * 求出公共相等的部分
     * 1.检查后面的元素是否相同
     * 2.返回那个元素
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode node = headA;
        while(node.next != null){
            node = node.next;
        }
        node.next = headB;
        ListNode result = listCycle2(headA);
        node.next = null;
        return result;
    }

    private ListNode listCycle2(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || fast.next == null){
                return null;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        fast = fast.next;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
