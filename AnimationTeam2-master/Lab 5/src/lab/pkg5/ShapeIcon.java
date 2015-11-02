/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author anmanokhin
 */
public class ShapeIcon implements Icon {

    public ShapeIcon(int width, int height,
            ArrayList<MoveableShape> shapelist) {
        this.width = width;
        this.height = height;
        this.shapelist = shapelist;
    }


    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        for (MoveableShape shape : shapelist) {
            shape.draw(g2);
        }
    }

    private int width;
    private int height;
    private MoveableShape shape;
    private ArrayList<MoveableShape> shapelist;

}
