/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcjenkinsoui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xafree
 */
public class CalcJenkinsOuiTest {
    
    public CalcJenkinsOuiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of plus method, of class CalcJenkinsOui.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        int a = 2;
        int b = 2;
        CalcJenkinsOui instance = new CalcJenkinsOui();
        int expResult = 4;
        int result = instance.plus(a, b);
        assertEquals(expResult, result);

    }

    /**
     * Test of soustraction method, of class CalcJenkinsOui.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        int a = 3;
        int b = 2;
        CalcJenkinsOui instance = new CalcJenkinsOui();
        int expResult = 1;
        int result = instance.soustraction(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class CalcJenkinsOui.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int diviseur = 2;
        int diviser = 10;
        CalcJenkinsOui instance = new CalcJenkinsOui();
        int expResult = 5;
        int result = instance.division(diviseur, diviser);
        assertEquals(expResult, result);
    }

    /**
     * Test of mutiplication method, of class CalcJenkinsOui.
     */
    @Test
    public void testMutiplication() {
        System.out.println("mutiplication");
        int a = 2;
        int b = 2;
        CalcJenkinsOui instance = new CalcJenkinsOui();
        int expResult = 4;
        int result = instance.mutiplication(a, b);
        assertEquals(expResult, result);
    }
    
}
