import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int buckets;
        buckets = getBucketCount(2.75,3.25,2.5,1);
        System.out.println("1 method, buckets: "+buckets);
        buckets = getBucketCount(7.25,4.3,2.35);
        System.out.println("2 method, buckets: "+buckets);
        buckets = getBucketCount(3.26,0.75);
        System.out.println("3 method, buckets: "+buckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0) return -1;
        int buckets = 0;
        double area, calc;
        area = width*height;
        calc = area/areaPerBucket;
        buckets = (int)Math.ceil(calc) - extraBuckets;
        return buckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <=0) return -1;
        int buckets = 0;
        double area, calc;
        area = width*height;
        calc = area/areaPerBucket;
        buckets = (int)Math.ceil(calc);
        return buckets;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <=0) return -1;
        int buckets = 0;
        double calc;
        calc = area/areaPerBucket;
        buckets = (int)Math.ceil(calc);
        return buckets;
    }
}
