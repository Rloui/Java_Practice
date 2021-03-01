public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        double area = width * height;
        double areaNeeded = area - (areaPerBucket * extraBuckets);
        double bucketsNeeded = areaNeeded / areaPerBucket;

        if (width >= 0 && height >= 0 && areaPerBucket >= 0 && extraBuckets >= 0) {
            return (int) Math.round(bucketsNeeded);
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double area = width * height;
        double areaNeeded = area - areaPerBucket;
        double bucketsNeeded = areaNeeded / areaPerBucket;

        if (width >= 0 && height >= 0 && areaPerBucket >= 0) {
            return (int) Math.round(bucketsNeeded);
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        double bucketsNeeded = area / areaPerBucket;

        if (area >= 0 && areaPerBucket >= 0) {
            return (int) Math.round(bucketsNeeded);
        } else {
            return -1;
        }
    }


}
