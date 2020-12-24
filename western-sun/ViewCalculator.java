public class ViewCalculator {

    public static int countOfWestSettingSunView(int[] heights) {
        int count = 0;
        if (heights != null && heights.length > 0) {
            count = 1;
            for (int i = 0; i < heights.length - 1; i++) {
                if (heights[i] > heights[i+1]) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] heights = new int[args.length];
        for(int i = 0; i < args.length; i++) {
            heights[i] = Integer.parseInt(args[i]);
        }
        System.out.println(countOfWestSettingSunView(heights));
    }

}
