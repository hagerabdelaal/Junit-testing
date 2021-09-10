/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pc14
 */
public class myclassTest {
    myclass test;
    
    public myclassTest() {
    }
    
    @Before
    public void setUp() {
        test = new myclass();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMySquare() {
        int a = 5;
        int result;
        result = test.mySquare(a);
        assertEquals(25, result);
        
    }
    
    @Test
    public void testMyAdd() {
        int a = 5;
        int b = 10;
        int result;
        result = test.myAdd(a, b);
        assertEquals(15, result);
        
    }
    
    @Test
    public void testMyMax() {
        int a = 8;
        int b = 7;
        int result1;
        result1 = test.myMax(a, b);
        assertEquals(a, result1);
        
        
        int c = 3;
        int d = 4;
        int result2;
        result2 = test.myMax(c, d);
        assertEquals(d, result2);
        
        int e = 10;
        int f = 10;
        int result3 = test.myMax(e, f);
        assertEquals(0, result3);
        
        
    }
    
}
