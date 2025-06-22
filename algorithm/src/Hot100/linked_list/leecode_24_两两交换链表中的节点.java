package Hot100.linked_list;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-22 21:06
 */
public class leecode_24_两两交换链表中的节点 {
    public static void main(String[] args) {

    }
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next != null && cur.next.next != null){
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;


            // 交换两个结点
            cur.next = node2;
            node1.next = node2.next;
            node2.next = node1;

            // 移动指针移动到下一组的前驱
            cur = node1;
        }
        return dummy.next;
    }

}
