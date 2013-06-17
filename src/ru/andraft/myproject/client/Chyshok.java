package ru.andraft.myproject.client;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Node;
import com.google.gwt.user.client.Window;


public class Chyshok implements EntryPoint {	
	public void onModuleLoad() {
		Label label = new Label(""+Window.getClientWidth());
		RootPanel log = RootPanel.get("log");
		log.add(label);
		RootPanel header = RootPanel.get("header");
		header.add(new Header());
        RootPanel testik = RootPanel.get("testik");
        String g =testik.getElement().getOffsetParent().getFirstChild().toString();
        Label ssilka = new Label("Сработало лол "+this.virezAdress(g));
        testik.add(ssilka);
 	}
	public String virezAdress(String s){
		int i,j;
		if(s.contains("Hello")){
		i=s.indexOf("/");
		j=s.lastIndexOf("j")+3;
		return s.substring(i, j).trim();
		}else{
			i=s.indexOf("/");
			j=s.indexOf("▫");
			String g=s.substring(i, j).trim();
			return g;
			}		
		
		
	}
}
