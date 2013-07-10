package ru.andraft.myproject.client;
import java.util.Date;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import static ru.andraft.myproject.client.Chyshok.enter;
public class Header extends AbsolutePanel{
	private static final String VOITI="Войти",VIITI="Выйти";
	final static String g = enter.getElement().getInnerHTML();
    final static String l[]=g.split(" ");
	Label last = new Label("Дата входа");
	Button butS = new Button(VIITI);
	public static String getUserka(String s){
		if(l[0].equals("no"))
			System.out.println("Не поймал имя");
		else
			s=l[0];
		return s;
		
	}
    public Header(){
	 this.setPixelSize(Window.getClientWidth(), 30); 
	 this.add(last,Window.getClientWidth()-300,10);	
		
		if(l[0].equals("no"))butS.setText(VOITI);
		else this.add(new Label("Hello "+l[0]+" "+ new Date().toString()),70,0);		
		this.add(butS,0,0);
		
		butS.addClickHandler(new ClickHandler(){	
			@Override
			public void onClick(ClickEvent event) {
				String c = event.getRelativeElement().getInnerText();
				int i=1;
				if(c.equals(VOITI))i=2;
                Window.Location.replace(l[i]);
				
			}
			
		});
	
	 
	 
 }
protected void onLoad(){
	 super.onLoad(); 
	 
	 
 }
protected void onUnload(){
	super.onUnload();
	
}};
