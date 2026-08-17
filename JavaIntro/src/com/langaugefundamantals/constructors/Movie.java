package com.langaugefundamantals.constructors;

public class Movie {
	String name;
	String director;
	String producer;
	String hero;
	String heroine;
	double budget;
	Movie()
	{
		//this("unknown");
		System.out.println("No arg constructor called");		
	}
	Movie(String name)
	{
		this.name=name;
	}
	Movie(Movie m,String director)
	{
		this.name=m.name;
		this.director=director;
		
	}
	Movie(Movie m,String producer,String hero,String heroine)
	{		
		this.name=m.name;
		this.director=m.director;
		this.producer=producer;
		this.hero=hero;
		this.heroine=heroine;
		
	}
	Movie(Movie m,double budget)
	{
		this.name=m.name;
		this.director=m.director;
		this.producer=m.producer;
		this.hero=m.hero;
		this.heroine=m.heroine;
		this.budget=budget;
	}
	void displayMovieDetails()
	{
		System.out.println("**************** Movie Details ****************");
		System.out.println("Nameof a movie :"+name);
		System.out.println("name of a director :"+director);
		System.out.println("name of a producer :"+producer);
		System.out.println("name of a hero :"+hero);
		System.out.println("name of a heroine :"+heroine);
		System.out.println("Budget to be allocation :"+budget);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
		Movie obj=new Movie();
		obj.displayMovieDetails();
		
		Movie obj2=new Movie("Spirit");
		obj2.displayMovieDetails();
		
		Movie obj3=new Movie(obj2,"Sandeep Reddy Vanga");
		obj3.displayMovieDetails();
		
		Movie obj4 = new Movie(obj3,"Adhidha surprise","Prabhas","Anupam Kher");
		obj4.displayMovieDetails();
		
		Movie obj5=new Movie(obj4,50000);
		obj5.displayMovieDetails();	
		
		System.out.println("main method ended");

	}

}
