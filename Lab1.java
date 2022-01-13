package com.company;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Lab1 {

    public static void main(String[] args) {
        Point3d first = new Point3d();
        Point3d second = new Point3d();
        Point3d third = new Point3d();
        Scanner num = new Scanner(System.in);
        first.xCoord = num.nextDouble();
        first.yCoord = num.nextDouble();
        first.zCoord = num.nextDouble();
        second.xCoord = num.nextDouble();
        second.yCoord = num.nextDouble();
        second.zCoord = num.nextDouble();
        third.xCoord = num.nextDouble();
        third.yCoord = num.nextDouble();
        third.zCoord = num.nextDouble();

        if (first.xCoord > second.xCoord) //Сравнение первых двух координат
            System.out.println("Большая координата: " + first.xCoord);
        else
            System.out.println("Большая координата: " + second.xCoord);

        if (first.yCoord > second.yCoord)
            System.out.println("Большая координата: " + first.yCoord);
        else
            System.out.println("Большая координата: " + second.yCoord);

        if (first.zCoord > second.zCoord)
            System.out.println("Большая координата: " + first.zCoord);
        else
            System.out.println("Большая координата: " + second.zCoord);

        double dist = distanceTo(first.xCoord, first.yCoord, first.zCoord, second.xCoord, second.yCoord, second.zCoord);
            System.out.print("Расстояние между двумя точками: ");
            System.out.format("%.2f", dist);
            double xx = distanceTo(first.xCoord, first.yCoord, first.zCoord, second.xCoord, second.yCoord, second.zCoord);
            double yy = distanceTo(first.xCoord, first.yCoord, first.zCoord, third.xCoord, third.yCoord, third.zCoord);
            double zz = distanceTo(third.xCoord, third.yCoord, third.zCoord, second.xCoord, second.yCoord, second.zCoord);
            if (prover(xx, yy, zz)) {
                double S = computeArea(xx, yy, zz);
                System.out.format("\n");
                System.out.println("Площадь треугольника по формуле Герона: " + S);
            }
            else
                System.out.println("\nОшибка: введены одинаковые координаты двух, или более, точек");
    }

    public static double distanceTo (double xx, double xy, double xz, double yx, double yy, double yz) {
        double dist = 0;
        dist = Math.pow((xx-yx),2) + Math.pow((xy-yy),2) + Math.pow((xz-yz),2);
        dist = Math.sqrt(dist);
        return dist; // Метод вычисления расстояния между двумя точками
    }

    public static double computeArea(double x, double y, double z) {
        double P = 0.5 * (x + y + z);
        double S = Math.sqrt(P*(P-x)*(P-y)*(P-z));
        return S; // Вычмисление площади треугольника по формуле Герона
    }

    public static boolean prover(double xx, double yy, double zz) {
        if (xx==0 || yy==0 || zz==0)
            return false;
        return true;
    }
}
