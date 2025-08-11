package Level_3;
import java.util.Arrays;

public class FootballHeights {

    public int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150–250 cm
        }
        return heights;
    }

    public int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        FootballHeights fh = new FootballHeights();

        int[] heights = fh.generateHeights();

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + fh.findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + fh.findTallest(heights) + " cm");
        System.out.println("Mean Height: " + fh.findMean(heights) + " cm");
    }
}
