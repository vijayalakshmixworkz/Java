package com.xworkz.movieProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie_information")
public class MovieEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "movie_name", nullable = false)
	private String movie_name;
	@Column(name = "director_name", nullable = false)
	private String director_name;
	@Column(name = "budget", nullable = false)
	private long budget;
	@Column(name = "ticket_price", nullable = false)
	private float ticket_price;

	public MovieEntity() {

	}

	
	public MovieEntity(int id, String movie_name, String director_name, long budget, float ticket_price) {
		super();
		this.id = id;
		this.movie_name = movie_name;
		this.director_name = director_name;
		this.budget = budget;
		this.ticket_price = ticket_price;
	}


//	public MovieEntity(String movie_name, String director_name, long budget, float ticket_price) {
//		super();
//		this.movie_name = movie_name;
//		this.director_name = director_name;
//		this.budget = budget;
//		this.ticket_price = ticket_price;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getDirector_name() {
		return director_name;
	}

	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public float getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(float ticket_price) {
		this.ticket_price = ticket_price;
	}

	@Override
	public String toString() {
		return "MovieEntity [id=" + id + ", movie_name=" + movie_name + ", director_name=" + director_name + ", budget="
				+ budget + ", ticket_price=" + ticket_price + "]";
	}

}
