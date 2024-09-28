import java.util.*;
public class TrappingWater {
    public static int trappedRainWater(int height[]){
        //calculate left max boundry-array
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for (int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i]);
        }
        //calculate right max boundry-array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i]);
        }
        int trappedWater=0;
        //loop
        for (int i=0;i<n;i++){
            //water level=min(left max boundry,right max boundry)
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water=trapped water-height[i]
            trappedWater=trappedWater+waterlevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
