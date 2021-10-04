/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuthao.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Thao
 */
public class FactorialTest {
    
     //check cem có th ngoại lệ hay ko khi đua data cà chớn!
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        // ta ko dung ham assertEquals( 2 value so sanh)
        // ngoai le chi co the thay no xh hay ko???
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }
    
  
}

//qyu uoc xanh do
//1. neu xanh. tat ca tinh huong xai ham phai xanh
//2. do, chi can mot tinh huong xai ham bi do coi nhu bo
// do: 
// hoac ban tinh toan tron thuat toan trong ha sai
// hoac ban ky vong sai