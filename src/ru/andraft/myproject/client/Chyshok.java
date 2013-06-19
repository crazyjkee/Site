package ru.andraft.myproject.client;

import com.google.gwt.user.client.ui.*;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
public class Chyshok implements EntryPoint {
	private static final String VOITI="Войти",VIITI="Выйти";
	Button butS = new Button(VIITI);
	
	Label label = new Label(""+Window.getClientWidth());
	
	public void onModuleLoad() {
	    final RootPanel log = RootPanel.get("log");
		final RootPanel header = RootPanel.get("header");
		header.add(new Header());
		final RootPanel enter = RootPanel.get("enter");
		final String g = enter.getElement().getInnerHTML();
		final String l[]=g.split(" ");
		
		if(l[0].equals("no"))butS.setText(VOITI);
		
		butS.addClickHandler(new ClickHandler(){	
			@Override
			public void onClick(ClickEvent event) {
				String c = event.getRelativeElement().getInnerText();
				int i=1;
				if(c.equals(VOITI))i=2;
                Window.Location.replace(l[i]);
				
			}
			
		});
		
		log.add(butS);
	  }
	}	