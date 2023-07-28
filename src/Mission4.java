public class Mission4 {
    public static double area(double value1, double value2) {
        if( value1 >= 0 && value2 >=0 ) {
            return value1 * value2;
        } else {
            return -1 ;
        }
    }
    public static void main(String[] args) {
        System.out.println(area(-9, 99));
    }
}
