import java.util.Stack;

public class MaximumArea {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int [arr.length];
        int nsl[] = new int [arr.length];
        
        // next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1 ; i>=0 ; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();

        for(int i = 0 ; i<=arr.length ; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        for(int i = 0; i<arr.length ; i++){
            int height = arr[i];
            int width = nsr[i] - nsr[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea , maxArea);
        }
        // System.out.println("max area in histogram = " , maxArea);
        // return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6 , 3 ,9 ,5 ,8};
        maxArea(arr);
    }
}
