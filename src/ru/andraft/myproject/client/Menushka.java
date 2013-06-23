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
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
	  //РАБОТАЕТ,ОПТИМИЗИРУЮ ОБЯЗАТЕЛЬНО !!!11
//<inherits name="com.smartgwt.SmartGwt"/> 

	public class Menushka extends AbsolutePanel {  
		String MARK = "Marketing";
		private static final String [] COURSES = {"1 Курс","2 Курс","3 Курс","4 Курс"};
		MenuItem[] coursesMenuItem1 = new MenuItem[COURSES.length];
		MenuItem[] coursesMenuItem2 = new MenuItem[COURSES.length];
		MenuItem[] coursesMenuItem3 = new MenuItem[COURSES.length];
		MenuItem[] coursesMenuItem4 = new MenuItem[COURSES.length];
		String SALE = "Sales";
		String MAN = "Manufacturing";
		String SERV = "Services";
		IMenuButton bDirection;
		boolean Semest = false;
	        Menu mDirection ;
	    	IMenuButton bCategory;
	    	Label labka;
	    public Menushka() {	  
	        Canvas main = new Canvas();
	      
	        for(int i=0;i<COURSES.length;i++){
	        	coursesMenuItem1[i]=new MenuItem(COURSES[i]);
	        	coursesMenuItem2[i]=new MenuItem(COURSES[i]);
	        	coursesMenuItem3[i]=new MenuItem(COURSES[i]);
	        	coursesMenuItem4[i]=new MenuItem(COURSES[i]);
	        }
	        MenuItem marketing = new MenuItem(MARK);
	         Menu menuMarketing = new Menu();  
	        menuMarketing.setData(coursesMenuItem1);
	        marketing.setSubmenu(menuMarketing); 
	        getClick(MARK,coursesMenuItem1);
	  
	        MenuItem sales = new MenuItem(SALE);
	        Menu menuSales = new Menu();  
	        menuSales.setData(coursesMenuItem2);  
	        sales.setSubmenu(menuSales);
	        getClick(SALE,coursesMenuItem2);  
	  
	        MenuItem manuf = new MenuItem(MAN);              
	        Menu menuManufacturing = new Menu();  
	        menuManufacturing.setData(coursesMenuItem3);  
	        manuf.setSubmenu(menuManufacturing);
	        getClick(MAN,coursesMenuItem3);
	       
	        MenuItem service = new MenuItem(SERV); 
	        Menu menuServices = new Menu();  
	        menuServices.setData(coursesMenuItem4);  
	        service.setSubmenu(menuServices);
	        getClick(SERV,coursesMenuItem4);
	        
	        mDirection= new Menu();  
	        mDirection.setCanSelectParentItems(true);  
	        mDirection.setData(marketing,sales,manuf,service);  
	        mDirection.setWidth(130);
	        
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
	    private void getClick(final String s,MenuItem[] g){
        com.smartgwt.client.widgets.menu.events.ClickHandler handler=new com.smartgwt.client.widgets.menu.events.ClickHandler() {
	        	
	            public void onClick(MenuItemClickEvent event) {
	                bDirection.setTitle(s+" "+event.getItem().getTitle());
	                bCategory.setDisabled(false);} 
	        };
	        for(MenuItem m:g)
	            	m.addClickHandler(handler);
	    }
		
	    		
	    	
	    }
	  
	