/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

import java.awt.Graphics2D;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anmanokhin
 */
public class MoveableShapeTest {
    
    public MoveableShapeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of translate method, of class MoveableShape.
     */
    @Test
    public void testTranslate() {
        System.out.println("Testing translate");
        CarShape shape = new CarShape(0, 0, 100);
        shape.translate(10, 15);
        Assert.assertEquals(shape.getX(), 10);
        Assert.assertEquals(shape.getY(), 15);
    }

    public class MoveableShapeImpl implements MoveableShape {

        public void draw(Graphics2D g2) {
        }

        public void translate(int dx, int dy) {
        }
    }
    
}
