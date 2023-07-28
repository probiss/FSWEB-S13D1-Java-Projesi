public class Mission1 {
    public static boolean mission1(int clock, boolean isHav) {
        if(clock < 0 || clock > 23) {
            return false;
        }
        if(isHav && (clock < 8 || clock >= 22)) {
            return true;
        }
        return false;
    }

    //

    public static void main(String[] args) {
        System.out.println(mission1(-4, true));
    }
}
