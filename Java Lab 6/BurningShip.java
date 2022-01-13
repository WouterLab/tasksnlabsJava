import java.awt.geom.Rectangle2D;

public class BurningShip extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2000;

    @Override
    public void getInitialRange (Rectangle2D.Double range){
        range.x = -2;
        range.y = -2.5;
        range.height = 4;
        range.width = 4;
    }

    @Override
    public int numIterations(double x, double y) {
        double r = x;
        double i = y;
        int counter = 0;
        while ((counter < MAX_ITERATIONS)) {
            counter++;
            double k = r * r - i * i + x;
            double m = Math.abs(2 * r * i) + y;
            r = k;
            i = m;
            if ((r * r + i * i) > 4)
                break;
        }
        if (counter == MAX_ITERATIONS)
            return -1;
        return counter;
    }

    @Override
    public String toString() {
        return "Burning Ship";
    }
}
