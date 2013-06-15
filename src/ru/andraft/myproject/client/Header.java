package ru.andraft.myproject.client;

import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class Header extends AbsolutePanel{
	
	
	
	Label last = new Label("Дата входа");
 public Header(){
	 this.setPixelSize(Window.getClientWidth(), 40); 
	 this.add(last,Window.getClientWidth()-300,10);	 
 }
protected void onLoad(){
	 super.onLoad();
	 
	 String msg = Cookies.getCookie("Data");
	 last.setText(msg);
	 
 }
protected void onUnload(){
	super.onUnload();
	Cookies.setCookie("Data",System.currentTimeMillis()+"");
}




	};

