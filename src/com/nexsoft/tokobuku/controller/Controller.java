package com.nexsoft.tokobuku.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nexsoft.tokobuku.model.ModelBuku;
import com.nexsoft.tokobuku.uicomponent.Component;
import com.nexsoft.tokobuku.uicomponent.Label;
import com.nexsoft.tokobuku.uicomponent.MultiLineLabel;
import com.nexsoft.tokobuku.uicomponent.UIManager;
import com.nexsoft.tokobuku.uicomponent.View;

public class Controller {
	
	UIManager manager;
	List<ModelBuku> buku;
	
	public Controller (UIManager manager , List<ModelBuku> buku) {
		this.manager = manager;
		this.buku = buku;
	}
	
	public void start() {
		MenuUI();		
	}
	
	
	
	public void MenuUI(){
		
	    View canvas = new View();
	   
		
		List<String> menu = new ArrayList<String>();
		menu.add("1. Tambah Buku");
		menu.add("2. Lihat Buku");
		menu.add("3. Keluar     ");
		MultiLineLabel multi = new MultiLineLabel(menu);
		
		canvas.addComponent(HeaderUI());
		canvas.addComponent(multi);
		canvas.addComponent(FooterUI());
		
		manager.addView(canvas);
		
		manager.render();
		System.out.print("Masukan pilihan anda?:");
		Scanner in = new Scanner(System.in);
		int pilih = in.nextInt();
		
		switch (pilih) {
		case 1: 
			
		TambahBuku();
		break;
		case 2: 
		LihatBuku();	
					
		break;		
		case 3: 
			
	
		break;
		default:
			
		}
	}
	
	
public void TambahBuku() {
	
	
	
    View canvas = new View();
    manager.addView(canvas);
	ModelBuku model = new ModelBuku();
	
	
	canvas.addComponent(HeaderUI());
	
	canvas.addComponent(new Label("Judul Buku ->"));
	manager.render();
	Scanner in = new Scanner(System.in);
	String judul  = in.nextLine();
	
	model.setJudulBuku(judul);
	
	canvas.addComponent(new Label("ISBN ->"));
	manager.render();
    String isbn  = in.nextLine();
	
	model.setIsbn(isbn);
	
   canvas.addComponent(new Label("Harga ->"));
   manager.render();
    int harga  = in.nextInt();
	
	model.setHarga(harga);
	
	
	
	
	
	
	
	buku.add(model);
	String pilih = in.nextLine();
	LihatBuku();
	
	
}
	
	
public void LihatBuku(){
		
	    View canvas = new View();
	   
		
		List<String> menu = new ArrayList<String>();
		
		
		int x =1 ;
		for (ModelBuku book : buku) {
			menu.add(x + ". " +book.getJudulBuku() + " Rp."+ book.getHarga());
			x++;
		}
		
		
		MultiLineLabel multi = new MultiLineLabel(menu);
		
		canvas.addComponent(HeaderUI());
		canvas.addComponent(multi);
		canvas.addComponent(FooterUI());
		
		manager.addView(canvas);
		
		manager.render();
		Scanner in = new Scanner(System.in);
		String pilih = in.nextLine();
		MenuUI();
	}
	
	public MultiLineLabel HeaderUI() {
		
		
		List<String> header = new ArrayList<String>();
		header.add("                   ");
		header.add("    Toko Buku      ");
		header.add("                   ");
		MultiLineLabel multi = new MultiLineLabel(header);
		return multi;
		
	}
	
	public MultiLineLabel FooterUI() {
		
		
		List<String> header = new ArrayList<String>();
		header.add("                   ");
		header.add("    JL BUKU SATU   ");
		header.add("                   ");
		MultiLineLabel multi = new MultiLineLabel(header);
		return multi;
		
	}

}
