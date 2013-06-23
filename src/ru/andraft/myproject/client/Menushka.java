package ru.andraft.myproject.client;

import com.smartgwt.client.util.SC;  
import com.smartgwt.client.widgets.Canvas;  
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.menu.IMenuButton;  
import com.smartgwt.client.widgets.menu.Menu;   
import com.smartgwt.client.widgets.menu.MenuItem;  
import com.smartgwt.client.widgets.menu.events.ItemClickEvent;  
import com.smartgwt.client.widgets.menu.events.ItemClickHandler;  
import com.smartgwt.client.widgets.menu.events.MenuItemClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
	  //РАБОТАЕТ,ОПТИМИЗИРУЮ ОБЯЗАТЕЛЬНО !!!11
//<inherits name="com.smartgwt.SmartGwt"/> 
	public class Menushka extends AbsolutePanel{  
		String MARK = "Marketing";
		String SALE = "Sales";
		String MAN = "Manufacturing";
		String SERV = "Services";
		String PERVAK = "1 курс";
		String VTORYAK = "2 курс";
		String TRETYAK = "3 курс";
		String CHETVERYAK = "4 курс";
		IMenuButton bDirection;
		boolean Semest = false;
	        Menu mDirection ;
	    	IMenuButton bCategory;
	    	Label labka;
	    public Menushka() {	  
	        Canvas main = new Canvas();
	        MenuItem marketing = new MenuItem();
	        marketing = new MenuItem(MARK);
	        MenuItem pervak3 = new MenuItem(PERVAK);
	        MenuItem vtoryak3 = new MenuItem(VTORYAK);
	        MenuItem tretyak3 = new MenuItem(TRETYAK);
	        MenuItem chetveryak3 = new MenuItem(CHETVERYAK);
	         Menu menuMarketing = new Menu();  
	        menuMarketing.setData(pervak3, vtoryak3,tretyak3,chetveryak3);
	        marketing.setSubmenu(menuMarketing);
	        pervak3.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MARK+" "+event.getItem().getTitle());
	                bCategory.setDisabled(false);
	            }
	        });
	        vtoryak3.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MARK+" "+event.getItem().getTitle());   
	                bCategory.setDisabled(false);
	            }
	        });
	        tretyak3.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MARK+" "+event.getItem().getTitle());
	                bCategory.setDisabled(false);
	            }
	        });
	        chetveryak3.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MARK+" "+event.getItem().getTitle());
	                bCategory.setDisabled(false);
	            }
	        });
	  
	        MenuItem sales = new MenuItem(SALE);
	        MenuItem pervak2 = new MenuItem(PERVAK);
	        MenuItem vtoryak2 = new MenuItem(VTORYAK);
	        MenuItem tretyak2 = new MenuItem(TRETYAK);
	        MenuItem chetveryak2 = new MenuItem(CHETVERYAK);
	        Menu menuSales = new Menu();  
	        menuSales.setData(pervak2, vtoryak2,tretyak2,chetveryak2);  
	        sales.setSubmenu(menuSales); 
	        pervak2.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SALE+" "+event.getItem().getTitle()); 
	                bCategory.setDisabled(false);
	            }
	        });
	        vtoryak2.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SALE+" "+event.getItem().getTitle());
	                bCategory.setDisabled(false);
	            }
	        });
	        tretyak2.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SALE+" "+event.getItem().getTitle()); 
	                bCategory.setDisabled(false);
	            }
	        });
	        chetveryak2.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SALE+" "+event.getItem().getTitle());  
	                bCategory.setDisabled(false);
	            }
	        });
	        
	  
	        MenuItem manuf = new MenuItem(MAN);  
	        MenuItem pervak1 = new MenuItem(PERVAK);
	        MenuItem vtoryak1 = new MenuItem(VTORYAK);
	        MenuItem tretyak1 = new MenuItem(TRETYAK);
	        MenuItem chetveryak1 = new MenuItem(CHETVERYAK);
	        
	        Menu menuManufacturing = new Menu();  
	        menuManufacturing.setData(pervak1, vtoryak1,tretyak1,chetveryak1);  
	        manuf.setSubmenu(menuManufacturing);
	        pervak1.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MAN+" "+event.getItem().getTitle()); 
	                bCategory.setDisabled(false);
	            }
	        });
	        vtoryak1.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MAN+" "+event.getItem().getTitle()); 
	                bCategory.setDisabled(false);
	            }
	        });
	        tretyak1.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MAN+" "+event.getItem().getTitle());    
	                bCategory.setDisabled(false);
	            }
	        });
	        chetveryak1.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(MAN+" "+event.getItem().getTitle());
	                bCategory.setDisabled(false);
	            }
	        });
	  
	     
	        MenuItem service = new MenuItem(SERV); 
	        MenuItem pervak = new MenuItem(PERVAK);
	        MenuItem vtoryak = new MenuItem(VTORYAK);
	        MenuItem tretyak = new MenuItem(TRETYAK);
	        MenuItem chetveryak = new MenuItem(CHETVERYAK);
	        Menu menuServices = new Menu();  
	        menuServices.setData(pervak, vtoryak,tretyak,chetveryak);  
	        service.setSubmenu(menuServices);
	        
	        mDirection= new Menu();  
	        mDirection.setCanSelectParentItems(true);  
	        mDirection.setData(marketing,sales,manuf,service);  
	        mDirection.setWidth(130);
	        pervak.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SERV+" "+event.getItem().getTitle());
	                bCategory.setDisabled(false);
	            }
	        });
	        vtoryak.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SERV+" "+event.getItem().getTitle()); 
	                bCategory.setDisabled(false);
	            }
	        });
	        tretyak.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SERV+" "+event.getItem().getTitle()); 
	                bCategory.setDisabled(false);
	            }
	        });
	        chetveryak.addClickHandler(new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(SERV+" "+event.getItem().getTitle());   
	                bCategory.setDisabled(false);
	            }
	        });
	        
	        bDirection = new IMenuButton("Направление", mDirection);  
	        bDirection.setWidth(130);
	        
	        Menu mSemester = new Menu(); 
	        mSemester.setCanSelectParentItems(true); 
	        mSemester.setData(getItemSemester());
	        mSemester.setWidth(130);  
	        mSemester.addItemClickHandler(new ItemClickHandler() {  
	            public void onItemClick(ItemClickEvent event) {  
	            	bCategory.setTitle(event.getItem().getTitle());
	            }  
	        });  
	        bCategory = new IMenuButton("Семестр", mSemester);  
	        bCategory.setDisabled(true);
            bCategory.setLeft(130);
	        bCategory.setWidth(130);	                
	        
	        Menu mAbout = new Menu();  
	        mAbout.setCanSelectParentItems(true); 
	        mAbout.setData(getAboutDev());
	        mAbout.setWidth(130);  
	        mAbout.addItemClickHandler(new ItemClickHandler() {  
	            public void onItemClick(ItemClickEvent event) {  
	                MenuItem item = event.getItem();  
	                SC.say("You picked the \""  
	                        + item.getAttributeAsString("categoryName")  
	                        + "\" category.");  
	            }  
	        });  
	  
	        IMenuButton cCategory = new IMenuButton("О нас", mAbout);  
            cCategory.setLeft(260);
	        cCategory.setWidth(130);
	        main.addChild(bDirection);
	        main.addChild(bCategory);
	        main.addChild(cCategory);
	        main.setLeft(Window.getClientWidth()/2-195);
	        main.draw(); 
	        this.add(main);
	    
	        
	  
	    }
	    private static MenuItem[] getItemSemester() {  
	  	  
	        MenuItem[] i = new MenuItem[4];  
	        i[0] = new MenuItem("Первый семестр");  
	        i[1] = new MenuItem("Второй семестр");  
	        i[2] = new MenuItem("Третий семестр");  
	        i[3] = new MenuItem("Четвертый семестр"); 
	        return i;  
	    }  
	    private MenuItem[] getAboutDev() {  	  
	      MenuItem[] a = new MenuItem[4];  
	        a[0] = new MenuItem("Первая лалка"); 
	        a[1] = new MenuItem("Вторая лалка");  
	        a[2] = new MenuItem("Третья лалка");  
	        a[3] = new MenuItem("Четвертая лалка");
	        return a;  
	    }  
	    	      
	    		
	    	
	    }
	  
	