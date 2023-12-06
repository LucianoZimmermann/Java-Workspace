package entities;

import entities.enums.Author;
import entities.enums.Genre;

public class Movies {
	private Author author;
	private Integer index;
	private String title;
	private Genre genre;
	private Integer release;
	
	public Movies() {
	}
	
	public Movies(Author author, Integer index, String title, Genre genre, Integer release) {
		this.author = author;
		this.index = index;
		this.title = title;
		this.genre = genre;
		this.release = release;
	}

	

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Integer getRelease() {
		return release;
	}

	public void setRelease(Integer release) {
		this.release = release;
	}

	@Override
	public String toString() {
		return "Index: "
				+ index
				+ "\nAutor: " 
				+ author
				+ "\nNome: " 
				+ title
				+ "\nGênero: " 
				+ genre
				+ "\nData de Lançamento: "
				+ release;
	}
}
