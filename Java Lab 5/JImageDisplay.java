// Этот класс позволяет нам отображать наши фракталы.
import javax.swing.JComponent;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


class JImageDisplay extends JComponent
{
    // управляет изображением, содержимое которого можно записать.


private BufferedImage displayImage;

public BufferedImage getImage() {
        return displayImage;
    }

    // принимает целочисленные значения ширины и высоты, и инициализирует объект BufferedImage новым
    //изображением с этой шириной и высотой, и типом изображения TYPE_INT_RGB.
    public JImageDisplay (int width, int height)
    {
displayImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
Dimension imageDimension = new Dimension(width, height);
super.setPreferredSize(imageDimension);

    }

    // код для отрисовки

    @Override
public void paintComponent(Graphics g)
    {
super.paintComponent(g);
g.drawImage(displayImage, 0, 0, displayImage.getWidth(), displayImage.getHeight(), null);
    }

    //  устанавливает все пиксели изображения в черный цвет

public void clearImage()
    {
int[] blankArray = new int[getWidth() * getHeight()];
displayImage.setRGB(0, 0, getWidth(), getHeight(), blankArray, 0, 1);
    }

    // устанавливает пиксель в определенный цвет

public void drawPixel(int x, int y, int rgbColor)
    {

        displayImage.setRGB(x, y, rgbColor);
}
}
