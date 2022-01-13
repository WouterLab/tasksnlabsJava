// Этот класс позволяет исследовать различные части фрактала с помощью
// создания и отображения графического интерфейса Swing и обработки событий, вызванных различными
// взаимодействия с пользователем.

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class FractalExplorer
{
    // Целочисленный размер отображения - это ширина и высота отображения в пикселях.
private int displaySize;

    // Ссылка JImageDisplay для обновления отображения с помощью различных методов по мере вычисления фрактала.

private JImageDisplay display;

    // Объект FractalGenerator, использующий ссылку базового класса для отображения других типов фракталов в будущем.

private FractalGenerator fractal;

    // указывает  диапазон комплексной плоскости, которая выводится на экран.
private Rectangle2D.Double range;

    // конструктор, который принимает значение
    //размера отображения в качестве аргумента, затем сохраняет это значение в
    //соответствующем поле, а также инициализирует объекты диапазона и
    //фрактального генератора


public FractalExplorer(int size)
    {
displaySize = size;
fractal = new Mandelbrot();
range = new Rectangle2D.Double();
fractal.getInitialRange(range);
display = new JImageDisplay(displaySize, displaySize);

    }

    // инициализирует графический интерфейс Swing

public void createAndShowGUI()
    {
display.setLayout(new BorderLayout());
JFrame myframe = new JFrame("Fractal Explorer");
myframe.add(display, BorderLayout.CENTER);

        // Параметры кнопки
JButton resetButton = new JButton("Reset Display");
ResetHandler handler = new ResetHandler();
resetButton.addActionListener(handler);
myframe.add(resetButton, BorderLayout.SOUTH);
MouseHandler click = new MouseHandler();
display.addMouseListener(click);

        // Операция закрытия окна по умолчанию
myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Данные операции правильно разметят содержимое окна, сделают его видимым

myframe.pack();
myframe.setVisible(true);
myframe.setResizable(false);
    }

    // вывод на экран фрактала

private void drawFractal()
    {
        // Просмотр каждого пикселя на дисплее
for (int x=0; x<displaySize; x++){
for (int y=0; y<displaySize; y++){

// Поиск соответствующих координат xCoord и yCoord в области отображения фрактала.
double xCoord = fractal.getCoord(range.x, range.x + range.width, displaySize, x);
double yCoord = fractal.getCoord(range.y,  range.y + range.height, displaySize, y);

int iteration = fractal.numIterations(xCoord, yCoord);

// Если число итераций равно -1 (т.е. точка не выходит за границы, установите пиксель в черный цвет
if (iteration == -1){
display.drawPixel(x, y, 0);
}

else {
float hue = 0.7f + (float) iteration / 200f;
int rgbColor = Color.HSBtoRGB(hue, 1f, 1f);
display.drawPixel(x, y, rgbColor);
}

            }
        }

        // Обновление  JimageDisplay в соответствии с текущим изображением.
        display.repaint();
    }

    // класс для обработки событий java.awt.event.ActionListener от кнопки сброса.
private class ResetHandler implements ActionListener
    {
    // Обработчик должен сбросить
        // диапазон к начальному, определенному генератором, а затем перерисовать
    //фрактал


public void actionPerformed(ActionEvent e)
        {
fractal.getInitialRange(range);
drawFractal();
        }
    }
    // класс для обработки событий java.awt.event.MouseListener с дисплея

private class MouseHandler extends MouseAdapter
    {
        //  При получении события о щелчке мышью, класс должен
        //отобразить пиксельныекооринаты щелчка в область фрактала, а затем вызвать
        //метод генератора recenterAndZoomRange() с координатами, по которым
        //щелкнули, и масштабом 0.5. Таким образом, нажимая на какое-либо место на
        //фрактальном отображении, вы увеличиваете его!


@Override
public void mouseClicked(MouseEvent e)
        {
int x = e.getX();
double xCoord = fractal.getCoord(range.x, range.x + range.width, displaySize, x);
int y = e.getY();
double yCoord = fractal.getCoord(range.y, range.y + range.height, displaySize, y);
fractal.recenterAndZoomRange(range, xCoord, yCoord, 0.5);
drawFractal();
        }
    }

public static void main(String[] args)
    {
FractalExplorer displayExplorer = new FractalExplorer(800);
displayExplorer.createAndShowGUI();
displayExplorer.drawFractal();
    }
}
