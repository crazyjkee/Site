package ru.andraft.myproject.client;

import com.google.gwt.user.client.ui.*;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
public class Chyshok implements EntryPoint, ClickHandler {
	Button butS = new Button("Войти");
	Label label = new Label(""+Window.getClientWidth());
	public void onModuleLoad() {
		RootPanel log = RootPanel.get("log");
		log.add(label);
		RootPanel header = RootPanel.get("header");
		header.add(new Header());
		final RootPanel enter = RootPanel.get("enter");
		 String g = enter.getElement().getInnerHTML();
	     butS.setText(g);
		butS.addClickHandler(new ClickHandler(){
			
			@Override
			public void onClick(ClickEvent event) {
				
			
				
			}
			
		});
		log.add(butS);
			

	
	  Button b = new Button("Click and wait 5 seconds");
	    b.addClickHandler(this);

	    RootPanel.get().add(b);
	  }

	

	@Override
	public void onClick(ClickEvent event) {
	
	    Timer t = new Timer() {
	      public void run() {
	        Window.alert("Nifty, eh?");
	      }
	    };

	    // Schedule the timer to run once in 5 seconds.
	    t.schedule(5000);
	}
		} 
	
 	
	
	
   
		
		
