/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.awt.*;

/**
 *
 * @author anmanokhin
 */
public interface MoveableShape {

    /**
     * Draws the shape.
     *
     * @param g2 the graphics context
     */
    void draw(Graphics2D g2);

    /**
     * Moves the shape by a given amount.
     *
     * @param dx the amount to translate in x-direction
     * @param dy the amount to translate in y-direction
     */
    void translate(int dx, int dy);

}
