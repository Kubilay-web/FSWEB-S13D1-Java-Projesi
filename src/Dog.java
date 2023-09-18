public class Dog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay < 8) {
                return true;
            } else if (hourOfDay > 23 || hourOfDay < 0) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));  // true dönmeli (Gece 1'de köpek havlıyor)
        System.out.println(shouldWakeUp(false, 2)); // false dönmeli (köpek havlamıyor)
        System.out.println(shouldWakeUp(true, 8));  // false dönmeli (8'den sonra ise tepki vermeliyiz)
        System.out.println(shouldWakeUp(true, -1)); // false dönmeli (-1 geçersiz değer)
    }
}