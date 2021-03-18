/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutn;

/**
 *
 * @author Tran Ngoc Tu
 */
public class MathUtility {
    // day la class mo phong lai class math, chua cac ham xai chung 
    // ko luu lai dieu j -> static
    public static final double PI=3.1415;
    
    
    //21! tran kieu long > 18 so 0
    //bai nay ta tinh tu 0...201 . am khong tinh duoc, 0! = 1! = 1
    
    public  static long  getFactorial(int n){
        if(n < 0 || n > 20)
        throw  new IllegalArgumentException("n must be between 0-20");
        // song sot den day thi n = 0,1...20
        if(n == 0 || n == 1)
            return 1; //0!,1! = 1
        
        long result = 0;
        for (int i = 2; i < n; i++) 
        result *= i;
        
        return  result;
    }
}
