package oa;

import java.util.HashSet;
import java.util.Set;

public class A2 {
	public static int numIdleDrives(int[] x, int[] y) {
		Set<String> robotPosition = new HashSet<>();
		int i;
		for (i = 0; i < x.length; i++) {
			robotPosition.add(x[i] + "," + y[i]);
		}
		
		int idleRobot = 0;
		for (int i = 0; i < x.length; i++) {
	        int xi = x[i];
	        int yi = y[i];

	        // 计算该机器人上下左右的位置
	        String left = (xi - 1) + "," + yi;
	        String right = (xi + 1) + "," + yi;
	        String down = xi + "," + (yi - 1);
	        String up = xi + "," + (yi + 1);

	        // 如果上下左右的位置都有机器人，则该机器人是空闲的
	        if (robotPositions.contains(left) && 
	            robotPositions.contains(right) && 
	            robotPositions.contains(down) && 
	            robotPositions.contains(up)) {
	            idleCount++;  // 增加空闲机器人的计数
	        }
	    }

	    return idleCount;  // 返回空闲机器人的总数
	}
		
		
		return numIdleDrives;
	}
	
	public static void main(String[] args) {
        // 示例测试数据
        int[] x = {1, 1, 2, 2, 2, 3, 3, 3, 4, 5};
        int[] y = {1, 2, 2, 3, 1, 1, 2, 3, 5, 1};
        System.out.println(numIdleDrives(x, y));  // 输出：2
    }

}
