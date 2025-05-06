public class TrapWater {
    public static int TrapRainWater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i<n ;i++){
            int waterLevel = Math.min(leftMax[i], RightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrapRainWater(height));
    }
}
