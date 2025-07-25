package Hot100.linked_list;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-18 20:22
 */
public class leecode_141_环形链表 {
    public static void main(String[] args) {

    }

        public boolean hasCycle(ListNode head) {
            if(head == null || head.next == null){
                return false;
            }

            // 定义快慢指针
            ListNode slow = head;
            ListNode fast = head.next;

            while(slow != fast){
                if(fast == null || fast.next == null){
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
}
