package com.scp.Java8Basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaExpressionPart1 {

	public static void main(String[] args) {
		//Find the duplicate elements in given integer using Stream function
		List<Integer> list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
// filter() method which can be used to filter out some elements from object 
//collection based on a particular condition	
		Set<Integer> set = new HashSet<Integer>();
		list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x->System.out.println(x));
		
	 }
	}


