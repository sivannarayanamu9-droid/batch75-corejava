package com.langaugefundamantals.constructors;

public class MovieData {
	String nameOfTheMovie;
	String director;
	String producer;
	String hero;
	String heroine;
	double budget;

	public MovieData() {
		// TODO Auto-generated constructor stub
	}

	MovieData(MovieData m) {
		System.out.println("No arg constructor called");
		this.nameOfTheMovie = m.nameOfTheMovie;
		this.director = m.director;
		this.producer = m.producer;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.budget = m.budget;

	}

	void showMovieDetails() {
		System.out.println("************* Movie Details *************");
		System.out.println("Movie name :" + nameOfTheMovie);
		System.out.println("name of the director :" + director);
		System.out.println("name of the producer :" + producer);
		System.out.println("name of a hero :" + hero);
		System.out.println("name of heroine :" + heroine);
		System.out.println("budget allocation :" + budget + "Cr");
	}

	public static void main() {
		System.out.println("main method started");

		MovieData obj = new MovieData();
		obj.nameOfTheMovie = "spirit";
		obj.director = "sandeep reddy vanga";
		obj.producer = "DVV ";
		obj.hero = "prabhas";
		obj.heroine = "new one";
		obj.budget = 5000;
		obj.showMovieDetails();

		MovieData obj1 = new MovieData(obj);
		obj1.showMovieDetails();

		System.out.println("main method ended");
	}

}
