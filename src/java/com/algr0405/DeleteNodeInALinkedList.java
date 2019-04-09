package com.algr0405;

import com.util.ListNode;

public class DeleteNodeInALinkedList {
    /**
     * 遍历node
     * 让上一个节点的next 指向下一个
     * Input: head = [4,5,1,9], node = 5
     * Output: [4,1,9]
     * @param node
     */
    public void deleteNode(ListNode node) {
        //把node.next 的值 赋给现在的node
        node.val = node.next.val;
        //1. 4 -> 1(node) -> 1 -> 9
        //2.跳过old 的1
        //node.next 直接指向 9
        //3. 4 -> 1 -> 9
        node.next = node.next.next;
    }
}
