package Hot100.double_point;

public class leecode_11_盛最多水的容器 {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentHeight = Math.min(height[left], height[right]);
            int currentWidth = right - left;
            int currentArea = currentHeight * currentWidth;
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

//    public static int maxArea(int[] height){
//        int i = 0, j = height.length - 1;
//        int maxWater = (j - i + 1) * Math.min(height[i], height[j]);
//        while (i < j){
//            if(height[i] < height[j]){
//                int k = i;
//                while(height[k] <= height[i]){
//                    k ++;
//                }
//                if(k < j){
//                    int area = Math.min(height[k], height[j]) * (j - k);
//                    if(area > maxWater){
//                        maxWater = area;
//                    }
//                }else{
//                    return maxWater;
//                }
//
//            }else{
//                int k = j;
//                while(height[k] <= height[j] && k > i){
//                    k --;
//                }
//                int area = Math.min(height[k], height[j]) * (k - i + 1);
//                if(area > maxWater){
//                    maxWater = area;
//                }
//            }
//        }
//        return maxWater;
//    }
}
