package ua.epam;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.epam.Arithmetics;

import static org.junit.Assert.*;

/**
 * Created by Olga_Voronina on 9/7/2016.
 */
public class ArithmeticsTest {
    private Arithmetics sum;
    private Arithmetics div;
    private Arithmetics mult;
    private Arithmetics del;

    double value1 = 7;
    double value2 = 6;

    @Before
    public void runSum(){sum = new Arithmetics(); } //inicialization
    public void runDiv(){ div = new Arithmetics();} //inicialization}
    public void runMult(){ mult = new Arithmetics();} //inicialization
    public void runDel(){ del = new Arithmetics();} //inicialization



    //assertEquals
    @Test
    public void testGetDel() {
        double m = del.getDel(value1, value2);
        Assert.assertEquals(Math.round(m), 1.0, 0.0001);
    }

    @Test
    public void testGetMult(){
        double m = mult.getMult(value1, value2);
        Assert.assertEquals(m, 42.0, 0.0001);

    }
    @Test
    public void testGetDiv() {
        double m = div.getDiv(value1, value2);
        Assert.assertEquals(m, 1.0, 0.0001);
    }
    @Test
    public void testGetSum() {;
        double m = sum.getSum(value1, value2);
        Assert.assertEquals(m, 13.0, 0.0001);
    }


    //assertTrue
    @Test
    public void testGetDelTrue() {
        double m = del.getDel(value1, value2);
        Assert.assertTrue( Math.round(m) == 1.0);
    }

    @Test
    public void testGetMultTrue(){
        double m = mult.getMult(value1, value2);
        Assert.assertTrue( m == 42.0);

    }
    @Test
    public void testGetDivTrue() {
        double m = div.getDiv(value1, value2);
        Assert.assertTrue( m == 1.0);
    }
    @Test
    public void testGetSumTrue() {
        double m = sum.getSum(value1, value2);
        Assert.assertTrue( m == 13.0);
    }

    //assertFalse
    @Test
    public void testGetDelTalse() {
        double m = del.getDel(value1, value2);
        Assert.assertFalse( m == 1.0);
    }

    @Test
    public void testGetMultFalse(){
        double m = mult.getMult(value1, value2);
        Assert.assertFalse( m == 45.0);

    }
    @Test
    public void testGetDivFalse() {
        double m = div.getDiv(value1, value2);
        Assert.assertFalse( m == 12.0);
    }
    @Test
    public void testGetSumFalse() {
        double m = sum.getSum(value1, value2);
        Assert.assertFalse( m == 11.0);
    }





}