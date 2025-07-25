package Hot100.linked_list;

public class leecode_234_回文链表 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {
        int[] arr = new int[100010];
        int size = 0;
        while(head != null){
            arr[size ++] = head.val;
            head = head.next;
        }
        
        int i = 0, j = size - 1;
        while(i < j){
            if(arr[i] == arr[j]){
                i ++;
                j --;
            }else{
                return false;
            }
        }
        return true;
    }
}
