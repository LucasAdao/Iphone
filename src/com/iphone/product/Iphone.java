package com.iphone.product;

import com.iphone.service.MP3;
import com.iphone.service.Telefone;
import com.iphone.service.Web;

class Iphone implements MP3,Telefone,Web {
	private final String name = "versio 1plus";

	public String getName() {
		return name;
	}
	
}
	

