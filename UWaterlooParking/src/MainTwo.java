public class MainTwo {
    public static void main(String[] args) {
        int[][] nums = new int[10][10];
        int num = 0;
        for(int row = 0; row < nums.length;row++){
            for(int col = 0; col < nums[row].length;col++){
                nums[row][col] = num;
                num++;
            }
        }
        for(int row = 0; row < nums.length;row++){
            System.out.println();
            for(int col = 0; col < nums[row].length;col++){
                System.out.print(nums[row][col] + ", ");
            }
        }

    }
}
