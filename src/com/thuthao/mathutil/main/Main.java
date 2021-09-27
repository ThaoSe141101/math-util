/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuthao.mathutil.main;

import com.thuthao.mathutil.core.MathUtil;

/**
 *
 * @author Thao
 */
public class Main {
    public static void main(String[] args) {
        //test MANUAL, đưa data, gọi hàm check, so sánh expecetd vs
        // tất cả, đặc biệt phần cmp là phải bằng mắt, cho từng tình huống
        System.out.println("0! - 1?" + MathUtil.getFactorial(0));
        System.out.println("1! - 1?" + MathUtil.getFactorial(1));
        System.out.println("2! - 2?" + MathUtil.getFactorial(2));
        System.out.println("3! - 6?" + MathUtil.getFactorial(3));
    }
    
}
