public class Main {
    public static void main(String[] args) {

    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <=0) || (areaPerBucket <=0) || (extraBuckets<0)){
            return -1;
        }

        int bucketCount;
        double area = width * height;
        double areaCoveredWithExtraBuckets = areaPerBucket * extraBuckets;
        double remainingArea = area - areaCoveredWithExtraBuckets;
        double neededBuckets = remainingArea/areaPerBucket;
        bucketCount = (int) Math.ceil(neededBuckets);

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <=0) || (areaPerBucket <=0)){
            return -1;
        }

        double area = width * height;
        double neededBuckets = area/areaPerBucket;
        return (int) Math.ceil(neededBuckets);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if ((area <= 0) || (areaPerBucket <= 0)){
            return -1;
        }

        double neededBuckets = area/areaPerBucket;
        return (int) Math.ceil(neededBuckets);
    }
}