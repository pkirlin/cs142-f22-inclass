package functions;

public class FunctionPractice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Test 1: " + distance(1, 2, 3, -4));
        System.out.println("Test 2: " + distance(0, 0, 1, 1));
        System.out.println("now testing sumRange");
        System.out.println("Test 1: " + sumRange(1, 9));
        System.out.println("now testing totalDistance");
        System.out.println("Test 1: " + totalDistance(new int[] {1,2,3,-4,-3,0}));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double temp = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double temp2 = Math.sqrt(temp);
        return temp2;
    }

    public static int sumRange(int lower, int upper) {
        int total = 0;
        for (int ctr = lower; ctr <= upper; ctr++) {
            System.out.println("My number is " + ctr);
            total += ctr;
        }
        return total;
    }

    public static double totalDistance(int[] points) {
        double total = 0;
        for (int i = 0; i < points.length - 2; i += 2) {
            System.out.print(points[i] + " ");
            System.out.println(points[i+1]);
            double dist = distance(points[i], points[i+1], points[i+2], points[i+3]);
            total += dist;
            // total += distance(......
        }
        return total;
    }
}
