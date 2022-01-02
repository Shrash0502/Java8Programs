package com.scp.Java8Basic;

public class ProgramToMultiplyTwoNos {

	public static void main(String[] args) {
		FunctionalInerfacePart1 total = (a,b)->(a*b);
		
		System.out.println(total.multiply(6, 7));
	}

}
