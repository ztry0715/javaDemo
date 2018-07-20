package com.zhou.gitdemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person(1L,"aa",1));
		list.add(new Person(2L,"aa",2));
		list.add(new Person(3L,"aa",3));
		list.add(new Person(4L,"aa",4));
		list.add(new Person(5L,"aa",5));
		list.add(new Person(6L,"aa",6));
		list.add(new Person(7L,"aa",7));
		list.add(new Person(8L,"aa",8));
		list.stream().forEach(System.out::println);
		
	}
}
