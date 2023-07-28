public class Mission3 {
    public static boolean isCatPlaying(boolean isSummer, int degree) {
        if(isSummer == true && degree > 25 && degree < 45) {
            return true;
        }

        if(isSummer == false && degree > 25 && degree < 35) {
            return true;
        }

        return false;
    }
        public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 30)); }
}
