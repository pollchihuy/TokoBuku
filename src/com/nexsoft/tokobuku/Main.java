package com.nexsoft.tokobuku;

import java.util.ArrayList;
import java.util.List;

import com.nexsoft.tokobuku.controller.Controller;
import com.nexsoft.tokobuku.model.ModelBuku;
import com.nexsoft.tokobuku.uicomponent.Component;
import com.nexsoft.tokobuku.uicomponent.Label;
import com.nexsoft.tokobuku.uicomponent.MultiLineLabel;
import com.nexsoft.tokobuku.uicomponent.UIManager;
import com.nexsoft.tokobuku.uicomponent.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UIManager manager = new UIManager();
		List<ModelBuku> lstBuku = new ArrayList<ModelBuku>();
		ModelBuku buku1 = new ModelBuku("KKN di desa Penyanyi", "12345", 15000, "Intan", "PT Buku Bajakan");
		ModelBuku buku2 = new ModelBuku("Stranger Things", "23456", 20000, "Antoni", "PT Buku Asli");
		
		lstBuku.add(buku1);
		lstBuku.add(buku2);
		Controller controller = new Controller(manager, lstBuku);
		controller.start();
		

	}

}
