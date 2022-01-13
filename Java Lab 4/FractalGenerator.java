import java.awt.geom.Rectangle2D;


public abstract class FractalGenerator {


    public static double getCoord(double rangeMin, double rangeMax, int size, int coord) {

        assert size > 0;
        assert coord >= 0 && coord < size;

        double range = rangeMax - rangeMin;
        return rangeMin + (range * (double) coord / (double) size);
    }


    // позволяет генератору фракталов определить наиболее «интересную»
    // область комплексной плоскости для конкретного фрактала


    public abstract void getInitialRange(Rectangle2D.Double range);


    // Обновляет текущий диапазон, чтобы он был центрирован по указанным координатам,
    // и для увеличения или уменьшения с указанным коэффициентом масштабирования.

    public void recenterAndZoomRange(Rectangle2D.Double range, double centerX, double centerY, double scale) {

        double newWidth = range.width * scale;
        double newHeight = range.height * scale;

        range.x = centerX - newWidth / 2;
        range.y = centerY - newHeight / 2;
        range.width = newWidth;
        range.height = newHeight;
    }


    // реализует итеративную функцию для фрактала Мандельброта
    //Учитывая координату <em> x </em> + <em>iy</em> на комплексной плоскости,
    //вычисляет и возвращает количество итераций перед фракталом функция выходит за пределы ограничивающей
    // области для этой точки. Дело в том, что не исчезает, пока не будет указан предел итераций с результатом -1.

    public abstract int numIterations(double x, double y);
}
