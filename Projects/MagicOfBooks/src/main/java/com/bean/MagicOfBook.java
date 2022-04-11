package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MagicOfBook {
		@Id
		@Column(name="book_id")
		private int id;
		@Column(name="book_name")
		private String name;
		@Column(name="book_authorName")
		private String authorName;
		@Column(name="book_genre")
		private String genre;
		@Column(name="book_price")
		private float price;
		@Column(name="book_soldCopies")
		private int soldCopies;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public int getSoldCopies() {
			return soldCopies;
		}
		public void setSoldCopies(int soldCopies) {
			this.soldCopies = soldCopies;
		}
		
		@Override
		public String toString() {
			return "MagicOfBook [id=" + id + ", Book_name=" + name + ", authorName=" + authorName + ", genre=" + genre
					+ ", price=" + price + ", soldCopies=" + soldCopies + "]";
		}
		
		public MagicOfBook(int id, String name, String authorName, String genre, float price, int soldCopies) {
			super();
			this.id = id;
			this.name = name;
			this.authorName = authorName;
			this.genre = genre;
			this.price = price;
			this.soldCopies = soldCopies;
		}
		
		public MagicOfBook() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
}
