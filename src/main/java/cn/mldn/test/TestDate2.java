package cn.mldn.test;

import cn.mldn.util.MD5Code;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate2 {
	public static void main(String[] args) throws Exception {
		int i=0;
		int j=0;
		do{
		    int  z=i++;
			System.out.println(z);
			i++;
			j+=i;
		}while (i<7);
		System.out.println(j);
	}
}
