package Hot100.linked_list;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-06-25 19:34
 */
public class leecode_2_两数相加 {
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy1 = new ListNode();
        ListNode dummy2 = new ListNode();
        dummy1.next = l1;
        dummy2.next = l2;
        int l1_len = 0;
        int l2_len = 0;
        while(dummy1.next != null){
            dummy1 = dummy1.next;
            l1_len ++;
        }
        while(dummy2.next != null){
            dummy2 = dummy2.next;
            l2_len ++;
        }
        ListNode res = new ListNode();
        if(l1_len > l2_len){
            res = l1;
            // 变成一样长
            while(l1_len != l2_len){
                res = res.next;
                l1_len --;
            }
            if(res.val + l2.val >= 10){
                res.val = (res.val + l2.val) % 10;
                if(res.next != null){
                    l1.next.val += 1;
                }else{
                    ListNode node = new ListNode();
                    node.val = 1;
                    node.next = null;
                    res.next = node;
                }
            }else{
                res.val = res.val + l2.val;
            }
        }else{
            res = l2;
            // 变成一样长
            while(l1_len != l2_len){
                res = res.next;
                l2_len --;
            }
            if(l1.val + res.val >= 10){
                res.val = (l1.val + res.val) % 10;
                if(res.next != null){
                    res.next.val += 1;
                }else{
                    ListNode node = new ListNode();
                    node.val = 1;
                    node.next = null;
                    res.next = node;
                }
            }else{
                res.val = (l1.val + res.val);
            }
        }

        return res;
    }
}
