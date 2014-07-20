

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TestCalculator {

    @Test
    public void testMaxOk(){
        Calculator calc = new Calculator();
        Integer[] mas = {-1,-2};
        int rez=calc.max(mas);

        assertEquals("testMaxOk не пройден", -1,rez);
    }


    @Test
    public void testMaxNull(){
        Calculator calc = new Calculator();
        Integer[] mas = null;

        try {
            int rez=calc.max(mas);
            fail("testMaxNull: пройдено");
        }catch (NullPointerException ex){
        }

    }

    @Test
    public void testMaxNegativeNumbers(){
        Calculator calc = new Calculator();
        Integer[] mas = {-7,-12,-45,-25};
        int rez=calc.max(mas);

        assertEquals("testMaxNegativeNumbers не пройден", -7,rez);
    }

    @Test
    public void testMaxNullElement(){
        Calculator calc = new Calculator();
        Integer[] mas =  {7,12,null,25};

        try {
            int rez=calc.max(mas);
            fail("testMaxNullElement пройдено");
        }catch (NullPointerException ex){
        }

    }

    @Test
    public void testMaxValues(){
        Calculator calc = new Calculator();
        Integer[] mas = {1,2,11,Integer.MAX_VALUE};
        int rez=calc.max(mas);

        assertEquals("testMaxValues не пройден", Integer.MAX_VALUE,rez);
    }


    @Test
    public void testMaxNetElem(){
        Calculator calc = new Calculator();
        Integer[] mas =  {};

        /*try {
            int rez=calc.max(mas);
            fail("testMaxNetElem не должен был отработать");
        }catch (NullPointerException ex){
        }*/

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");


    }

}
