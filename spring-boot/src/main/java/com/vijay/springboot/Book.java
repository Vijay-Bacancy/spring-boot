package com.vijay.springboot;

public class Book {
	
	private Long Id;
	private String name;
	private String auther;
	
	public Book(Long id, String name, String auther) {
		super();
		Id = id;
		this.name = name;
		this.auther = auther;
	}

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getAuther() {
		return auther;
	}

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + ", auther=" + auther + "]";
	}

	
}
