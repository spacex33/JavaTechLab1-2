import org.junit.Assert;
import org.junit.Test;

public class CalculationJavaFXTest {

    Calculation calc = new Calculation();

    @Test(expected=NullPointerException.class)
    public void conjNullNullNull() throws Exception {
        boolean result = calc.conj(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void conjNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.conj(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void conjNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.conj(null,false);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void conjTrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.conj(true,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void conjTrueTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.conj(true,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void conjTrueFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.conj(true,false);
        Assert.assertEquals(false,result);
    }

    @Test
    public void conjFalseNullFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.conj(false,null);
        Assert.assertEquals(false,result);
    }

    @Test
    public void conjFalseTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.conj(false,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void conjFalseFalseFalse() throws Exception {
    Calculation calc = new Calculation();
    boolean result = calc.conj(false,false);
    Assert.assertEquals(false,result);
    }

//------------------------

    @Test(expected=NullPointerException.class)
    public void dizNullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void dizNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void dizNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(null,false);
        Assert.assertEquals(null,result);
    }

    @Test
    public void dizTrueNullTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(true,null);
        Assert.assertEquals(true,result);
    }

    @Test
    public void dizTrueTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(true,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void dizTrueFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(true,false);
        Assert.assertEquals(true,result);
    }

    @Test(expected=NullPointerException.class)
    public void dizFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(false,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void dizFalseTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(false,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void dizFalseFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.diz(false,false);
        Assert.assertEquals(false,result);
    }


//----------------------
    @Test(expected=NullPointerException.class)
    public void shefferNullNullNull() throws Exception {
    Calculation calc = new Calculation();
    boolean result = calc.sheffer(null,null);
    Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void shefferNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void shefferNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(null,false);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void shefferTrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(true,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void shefferTrueTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(true,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void shefferTrueFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(true,false);
        Assert.assertEquals(true,result);
    }

    @Test
    public void shefferFalseNullTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(false,null);
        Assert.assertEquals(true,result);
    }

    @Test
    public void shefferFalseTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(false,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void shefferFalseFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.sheffer(false,false);
        Assert.assertEquals(true,result);
    }
//--------------------- peirce


    @Test(expected=NullPointerException.class)
    public void peirceNullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void peirceNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void peirceNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(null,false);
        Assert.assertEquals(null,result);
    }

    @Test
    public void peirceTrueNullFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(true,null);
        Assert.assertEquals(false,result);
    }

    @Test
    public void peirceTrueTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(true,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void peirceTrueFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(true,false);
        Assert.assertEquals(false,result);
    }

    @Test(expected=NullPointerException.class)
    public void peirceFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(false,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void peirceFalseTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(false,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void peirceFalseFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.peirce(false,false);
        Assert.assertEquals(true,result);
    }

    //----------------------- XNOR

    @Test(expected=NullPointerException.class)
    public void XNORNullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void XNORNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void XNORNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(null,false);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void XNORTrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(true,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void XNORTrueTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(true,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void XNORTrueFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(true,false);
        Assert.assertEquals(false,result);
    }

    @Test(expected=NullPointerException.class)
    public void XNORFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(false,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void XNORFalseTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(false,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void XNORFalseFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XNOR(false,false);
        Assert.assertEquals(true,result);
    }

//------------------------------ XOR

    @Test(expected=NullPointerException.class)
    public void XORNullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(null,null);
        Assert.assertEquals(null,result);
}

    @Test(expected=NullPointerException.class)
    public void XORNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void XORNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(null,false);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void XORTrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(true,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void XORTrueTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(true,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void XORTrueFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(true,false);
        Assert.assertEquals(true,result);
    }

    @Test(expected=NullPointerException.class)
    public void XORFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(false,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void XORFalseTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(false,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void XORFalseFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.XOR(false,false);
        Assert.assertEquals(false,result);
    }

//----------------------------   implFromAToB

    @Test(expected=NullPointerException.class)
    public void implFromAToBNullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void implFromAToBNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void implFromAToBNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(null,false);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void implFromAToBTrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(true,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void implFromAToBTrueTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(true,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void implFromAToBTrueFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(true,false);
        Assert.assertEquals(false,result);
    }

    @Test//(expected=NullPointerException.class)
    public void implFromAToBFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(false,null);
        Assert.assertEquals(true,result);
    }

    @Test
    public void implFromAToBFalseTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(false,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void implFromAToBFalseFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromAToB(false,false);
        Assert.assertEquals(true,result);
    }


//-------------------------------------------    implFromBToA

    @Test(expected=NullPointerException.class)
    public void implFromBToANullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void implFromBToANullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void implFromBToANullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(null,false);
        Assert.assertEquals(null,result);
    }

    @Test//(expected=NullPointerException.class)
    public void implFromBToATrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(true,null);
        Assert.assertEquals(true,result);
    }

    @Test
    public void implFromBToATrueTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(true,true);
        Assert.assertEquals(true,result);
    }

    @Test
    public void implFromBToATrueFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(true,false);
        Assert.assertEquals(true,result);
    }

    @Test(expected=NullPointerException.class)
    public void implFromBToAFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(false,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void implFromBToAFalseTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(false,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void implFromBToAFalseFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.implFromBToA(false,false);
        Assert.assertEquals(true,result);
    }

//--------------------------------    decrement

    @Test(expected=NullPointerException.class)
    public void decrementNullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void decrementNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void decrementNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(null,false);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void decrementTrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(true,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void decrementTrueTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(true,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void decrementTrueFalseTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(true,false);
        Assert.assertEquals(true,result);
    }

    @Test//(expected=NullPointerException.class)
    public void decrementFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(false,null);
        Assert.assertEquals(false,result);
    }

    @Test
    public void decrementFalseTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(false,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void decrementFalseFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.decrement(false,false);
        Assert.assertEquals(false,result);
    }

//---------------------------------    increment


    @Test(expected=NullPointerException.class)
    public void incrementNullNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(null,null);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void incrementNullTrueNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(null,true);
        Assert.assertEquals(null,result);
    }

    @Test(expected=NullPointerException.class)
    public void incrementNullFalseNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(null,false);
        Assert.assertEquals(null,result);
    }

    @Test//(expected=NullPointerException.class)
    public void incrementTrueNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(true,null);
        Assert.assertEquals(false,result);
    }

    @Test
    public void incrementTrueTrueFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(true,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void incrementTrueFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(true,false);
        Assert.assertEquals(false,result);
    }

    @Test(expected=NullPointerException.class)
    public void incrementFalseNullNull() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(false,null);
        Assert.assertEquals(null,result);
    }

    @Test
    public void incrementFalseTrueTrue() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(false,true);
        Assert.assertEquals(false,result);
    }

    @Test
    public void incrementFalseFalseFalse() throws Exception {
        Calculation calc = new Calculation();
        boolean result = calc.increment(false,false);
        Assert.assertEquals(true,result);
    }

}