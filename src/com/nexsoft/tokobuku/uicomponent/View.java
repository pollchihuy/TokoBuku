package com.nexsoft.tokobuku.uicomponent;

import java.util.ArrayList;
import java.util.List;

import com.nexsoft.tokobuku.adapter.OnClickListener;

public class View  {

	String name = "";
	int height =0 ;
	int width = 0 ;
	
	List<Component> lstView = new ArrayList<Component>();
	
	public View() {
		
	}
	
	
	public void addComponent(Component component) {
		lstView.add(component);
	}
	
	
	public void draw() {
		
		for (Component component : lstView) {
			component.draw();
		}
		
	}
	
	public View(String name, int height , int width) {
		this.name = name;
		this.height = height;
		this.width = width;
	}
}
