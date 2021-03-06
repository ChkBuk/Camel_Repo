package com.camel.micro.camelmicroservicesa;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;

public class Test_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
//		list.add(-4);list.add(3);
//		list.add(-9);list.add(4);
//		list.add(0);list.add(1);
		list.add(1);list.add(1);
		list.add(0);list.add(-1);
		list.add(-1);
		plusMinus(list);
	}

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int zero,positive,negative;
        zero =0; positive =0; negative=0;
        for (Integer integer : arr) {
            if(integer==0){
                zero++;
            }else if(integer>0){
                positive++;
            }else{
                negative++;
            }
        }
        getRatio(positive, arr.size());
        getRatio(negative, arr.size());
        getRatio(zero, arr.size());
        
    }
    public static void getRatio(int value, double length){
        double val  = value/length;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(6);
        String text = df.format(val);
        System.out.println(padRightZeros(text, 8));
    }
    
    public static String padRightZeros(String inputString, int length) {
    	//System.out.println(inputString);
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(inputString);
        while (sb.length() < length ) {
            sb.append('0');
        }
        

        return sb.toString();
    }
}
