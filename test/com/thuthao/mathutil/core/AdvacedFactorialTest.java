/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuthao.mathutil.core;

import static com.thuthao.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Thao
 */
@RunWith(value = Parameterized.class)
public class AdvacedFactorialTest {
    
    // ta viết kỹ thuật mới, tách dât ra hẳn các lệnh kiểm tra hàm
    //data này ta có thể đặt ở file .txt, .csv, . excel, database bên ngoài
    //input và output/ expected là những cặp
    //những cặp cần phải test, do đó data đế test hàm sẽ là mảng 2 chiều
    //hoặc ta tạo luôn 1 mảng 2 chiều ngay đây
    
    @Parameters 
    public static Object[][] initData(){// tên hàm tùy ý
        return new Integer[][] {
                                  {0, 1},
                                  {1, 1},
                                  {2, 2},
                                  {3, 6},
                                  {4, 24},
                                  {5, 120},
                                  {6, 720}
                               };
    }
    
    // ta cần map 2 cột vào 2 biến để nhồi/feed vào hàm checkFatoral
    // ta gọi là testing kiểu tham số hóa
    // parameterzed testing
    
    @Parameter (value = 0) //map cột 0 của tập data
    public int input;
    @Parameter (value = 1)
    public long expected;
    
    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, getFactorial(input));
    }
}
