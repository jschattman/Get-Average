
package mycalculator;


public class MyCalculator {

    public double getAverage(int x, int y) {
        return (x+y)/2;
    }
    
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        System.out.println( mc.getAverage(30, 20));
        System.out.println( mc.getAverage(50, 10));
    }
    
}
