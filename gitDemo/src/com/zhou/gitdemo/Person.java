package com.zhou.gitdemo;

public class Person {
	private Long id;
	private String name;
	private int age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Person(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
