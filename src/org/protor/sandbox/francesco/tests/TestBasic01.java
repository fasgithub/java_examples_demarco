package org.protor.sandbox.francesco.tests;

import java.util.Arrays;

import org.protor.sandbox.francesco.basic.A;
import org.protor.sandbox.francesco.basic.B;

public class TestBasic01 {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.setI(1);
		a1.setD(-0.5);
		a1.setS("Oggetto A1");
		
		A a2 = new A(2, 3.1415, "Oggetto A2");
		
		System.out.println("----------------");
		
		B b1 = new B();
		System.out.println(b1);
		
		b1.setSa(new String[] {"de!","si","Pre"});
		System.out.println(b1);
		
		System.out.println("----------------");
		
		for(int k = 0; k < b1.getSa().length; k++)
			System.out.println(b1.getSa()[k]);
		
		String[] s1 = b1.getSa();
		System.out.println("----------------");
		s1[0] = "AAAAA";
		String[] s2 = new String[] {b1.getSa()[0], b1.getSa()[1], b1.getSa()[2]};
		String[] s3 = new String[3];
		for(int k = 0; k < 3; k++)
			s3[k] = b1.getSa()[k];
		
		for(String s : b1.getSa())
			System.out.println(s);
		
		String[] s1a = Arrays.copyOf(b1.getSa(), b1.getSa().length+1);
		
		s1a[0] = "GGGGG";
		
		for(String s : b1.getSa()) {
			try {
				System.out.println(s.toUpperCase());
			} catch (Exception e) {
				System.err.println("AAAAAAAAA");;
			}
		}
	}
}
