public class RandomTest {

    public static void main(String[] args) {

    }

    //已知一个函数x固定返回0 1 但是概率不想等 用这个函数x实现一个等概率返回0 1 的函数
    public static int x() {
        return Math.random() > 0.84 ? 0 : 1;
    }

    public static int y() {
        int ans = 0;
        do {
            ans = x();
        } while (ans == x());
        return ans;
    }


    //已知一个函数等概率返回 0～5上的整数  如何通过这个函数实现等概率返回 0～9上的整数
    public static int z() {
        return (int) Math.random() * 6;
    }

    public static int w() {
        int ans = 0;
        do {
            ans = z();
        } while (ans == 2);
        return ans < 2 ? 0 : 1;
    }
}
