package com.akilesh;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // The first two parameters are the width and height of the wall.
        // Next we have the area that can be covered with one bucket.
        // Next we have the count of buckets which the painter has in his home.
        // We need to calculate the number of buckets he needs to buy.

        // Validating parameters
        if ((width < 0) || (height < 0) || (areaPerBucket < 0)) {
            return -1;
        }
        double totalArea = width * height;
        if (totalArea < (extraBuckets * areaPerBucket)) {
            return 0;
        }
        double remainingArea = totalArea - (extraBuckets * areaPerBucket);
        double bucketsNeeded = remainingArea / areaPerBucket;
        double roundedValueOfBuckets = Math.ceil(bucketsNeeded);
        return (int) roundedValueOfBuckets;
    }

    // Overloaded method for the case when extra buckets are not available.
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }
}
