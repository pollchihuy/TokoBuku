package com.nexsoft.tokobuku.uicomponent;

import java.util.ArrayList;
import java.util.List;

public class MultiLineLabel extends Label{

	private List<String> lstTeks = new ArrayList<String>();
	
	public MultiLineLabel(List<String> teks) {
	
		lstTeks = teks;
		super.width = maxWidth()+2;
		super.height = lstTeks.size()+2;
		
	}
	
	
	@Override
	public void content(int width, int height) {
		// TODO Auto-generated method stub
		if(lstTeks.get(height-1).length() > width-1) {
		System.out.print(lstTeks.get(height-1).charAt(width-1));
		}else {
			System.out.print(" ");
		}
	}
	
	
	public int maxWidth() {
		
		int max = 0 ;
		for (String text : lstTeks) {
			if (text.length() > max) {
				max = text.length();
			}
		}
		
		return max;
	}
	
	


}
