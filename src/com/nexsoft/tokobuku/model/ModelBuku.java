package com.nexsoft.tokobuku.model;

public class ModelBuku {
	
	private String judulBuku;
	private String isbn;
	private int harga;
	private String pengarang;
	private String penerbit;
	
	
	public ModelBuku() {
		
	}
	
	public ModelBuku(String judulBuku, String isbn, int harga, String pengarang, String penerbit) {
		super();
		this.judulBuku = judulBuku;
		this.isbn = isbn;
		this.harga = harga;
		this.pengarang = pengarang;
		this.penerbit = penerbit;
	}
	
	public String getJudulBuku() {
		return judulBuku;
	}
	public void setJudulBuku(String judulBuku) {
		this.judulBuku = judulBuku;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public String getPengarang() {
		return pengarang;
	}
	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}
	public String getPenerbit() {
		return penerbit;
	}
	public void setPenerbit(String penerbit) {
		this.penerbit = penerbit;
	}
}
