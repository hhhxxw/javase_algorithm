package Hot100.double_point;

/**
 * 没有思路
 *
 * @author hxw
 * @date 2025-05-31 20:22
 */
public class leecode_42_接雨水 {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
    public static int trap(int[] height){
        // 定义两个指针，指向数组的左右两边
        int left = 0;
        int right = height.length - 1;
        // 记录左右两边的最大高度
        int leftMax = 0;
        int rightMax = 0;

        // 记录结果
        int result = 0;
        // 移动较小的一边
        while(left <= right){
            if(height[left] <= height[right]){
                if(height[left] > leftMax){
                    leftMax = height[left];
                }else{
                    result += leftMax - height[left];
                }
                left ++;
            }else{
                if(height[right] > rightMax){
                    rightMax = height[right];
                }else{
                    result += rightMax - height[right];
                }
                right --;
            }
        }
        return result;
    }
}
