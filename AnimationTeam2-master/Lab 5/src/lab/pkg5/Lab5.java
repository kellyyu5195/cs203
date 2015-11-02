/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 * This program implements an animation that moves a car shape.
 */
public class Lab5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final MoveableShape shape1 = new CarShape(0, 0, CAR_WIDTH);
        final MoveableShape shape2 = new CarShape(120, 0, CAR_WIDTH);
        final MoveableShape shape3 = new CarShape(240, 0, CAR_WIDTH);
        
        shapeList = new ArrayList<>();
        shapeList.add(shape1);
        shapeList.add(shape2);
        shapeList.add(shape3);
        
        ShapeIcon icon = new ShapeIcon(ICON_WIDTH, ICON_HEIGHT, shapeList);
        
        final JLabel label = new JLabel(icon);
        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        final int DELAY = 100;
        // Milliseconds between timer ticks
        javax.swing.Timer t = new javax.swing.Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                for (MoveableShape shape: shapeList) {
                    shape.translate(5, 0);
                }
                label.repaint();
            }
        });
        t.start();

    }

    private static final int ICON_WIDTH = 400;
    private static final int ICON_HEIGHT = 100;
    private static final int CAR_WIDTH = 100;
    private static ArrayList<MoveableShape> shapeList;
}
