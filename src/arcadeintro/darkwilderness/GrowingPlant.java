package arcadeintro.darkwilderness;

/*
For upSpeed = 100, downSpeed = 10 and desiredHeight = 910, the output should be
growingPlant(upSpeed, downSpeed, desiredHeight) = 10.
 */
public class GrowingPlant {
    public static void main(String[] args) {

        int upSpeed = 5;
        int downSpeed = 2;
        int desiredHeight = 7;

        System.out.println(growingPlant2(upSpeed, downSpeed, desiredHeight));
    }

    private static int growingPlant2(int upSpeed, int downSpeed, int desiredHeight) {
        int days = 1;
        int height = upSpeed;
        if (height >= desiredHeight) {
            return days;
        }
        height -= downSpeed;
        for (; height <= desiredHeight; ++days) {
            height += upSpeed;
            if (height >= desiredHeight) {
                return ++days;
            }
            height -= downSpeed;
        }
        return days;
    }
}
