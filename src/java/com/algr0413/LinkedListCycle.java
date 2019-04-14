package com.algr0413;

import com.util.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: head = [3,2,0,-4], pos = 1
 *      * Output: true
 *      * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *      *
 *      * Input: head = [1,2], pos = 0
 *      * Output: true
 *      * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *      *
 *      * Input: head = [1], pos = -1
 *      * Output: false
 *      * Explanation: There is no cycle in the linked list.
 */
public class LinkedListCycle {
    /**
     * 如何判断它为循环列表
     * 1.将所有的遍历过的节点用某个结构存储起来，然后每遍历一个节点，
     * 都在这个结构中查找是否遍历过，如果找到有重复，则说明该链表存在循环
     *
     * 2.快慢指针的思想：定义两个指向头结点的指针pfast ,pslow，让它们的步长不一样，比如pfast步长2n，pslow步长为1n。然后，就让它们同时从头结点开始遍历链表。如果链表是循环的，
     * 也即带有环的，那么快慢指针总有再相遇的时候。就像操场跑步，操场是个环，跑的快的同学总会再遇上跑的慢的同学。
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != slow){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
