public class PaintJob {
    // Bob is a wall painter and he needs your help. You have to write a program, that helps bob
    // calculate how many buckets of paint he needs to buy before going to work. Bob might also have some
    // extra buckets at home. He also knows the area that he can cover with one bucket of paint

    // Write a method called getBucketCount with 4 parameters:
    // 1. Width: double
    // 2. Height: double
    // 3. areaPerBucket: double
    // 4. extraBuckets: int
    // The method needs to return a value of type int that represents the number of buckets that bob needs to buy
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        // if one of the parameters width, height or areaPerBucket is <=0 return -1
        // if extraBuckets < 0, return -1
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        } else {
            return (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
        }
    }

    // Bob does noe like to enter 0 for the extraBuckets parameter so he needs another method.
    // Write another overloaded method named getBucketCount with 3 parameters
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height,areaPerBucket,0);
    }

    // In some cases, Bob does not know the width and height of the wall but he knows the area of a wall.
    public static int getBucketCount(double area, double areaPerBucket) {
        return getBucketCount(area, 1,areaPerBucket,0);
    }
}
