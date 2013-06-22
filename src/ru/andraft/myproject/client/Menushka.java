package ru.andraft.myproject.client;


	import com.smartgwt.client.docs.Positioning;
import com.smartgwt.client.util.SC;  
import com.smartgwt.client.widgets.Canvas;  
import com.smartgwt.client.widgets.menu.IMenuButton;  
import com.smartgwt.client.widgets.menu.Menu;   
import com.smartgwt.client.widgets.menu.MenuItem;  
import com.smartgwt.client.widgets.menu.events.ItemClickEvent;  
import com.smartgwt.client.widgets.menu.events.ItemClickHandler;  
	   
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
	  
	public class Menushka extends AbsolutePanel{  
	  
	    public Menushka() {  
	  
	        Canvas main = new Canvas();
	        Menu mDirection = new Menu();  
	        mDirection.setCanSelectParentItems(true);  
	        mDirection.setData(getLocalItemsAsArray());  
	        mDirection.setWidth(130);  
	        mDirection.addItemClickHandler(new ItemClickHandler() {  
	            public void onItemClick(ItemClickEvent event) {  
	                SC.say("You picked the \"" + event.getItem().getTitle()  
	                        + "\"");  
	            }  
	        });
	        IMenuButton bDirection = new IMenuButton("Направление", mDirection);  
	        bDirection.setWidth(130);
	        main.addChild(bDirection);
	        
	        Menu mSemester = new Menu();  
	        mSemester.setCanSelectParentItems(true);  
	        mSemester.setWidth(130);  
	        mSemester.addItemClickHandler(new ItemClickHandler() {  
	            public void onItemClick(ItemClickEvent event) {  
	                MenuItem item = event.getItem();  
	                SC.say("You picked the \""  
	                        + item.getAttributeAsString("categoryName")  
	                        + "\" category.");  
	            }  
	        });  
	  
	        IMenuButton bCategory = new IMenuButton("Семестр", mSemester);  
            bCategory.setLeft(130);
	        bCategory.setWidth(130);	                
	        main.addChild(bCategory); 
	        
	        Menu mAbout = new Menu();  
	        mAbout.setCanSelectParentItems(true);  
	        mAbout.setWidth(130);  
	        mAbout.addItemClickHandler(new ItemClickHandler() {  
	            public void onItemClick(ItemClickEvent event) {  
	                MenuItem item = event.getItem();  
	                SC.say("You picked the \""  
	                        + item.getAttributeAsString("categoryName")  
	                        + "\" category.");  
	            }  
	        });  
	  
	        IMenuButton cCategory = new IMenuButton("О нас", mSemester);  
            cCategory.setLeft(260);
	        cCategory.setWidth(130);
	        main.addChild(cCategory);
	        main.setLeft(Window.getClientWidth()/2-260);
	        main.draw(); 
	        this.add(main);
	    }  
	  
	    private MenuItem[] getLocalItemsAsArray() {  
	  
	        MenuItem[] m = new MenuItem[4];  
	  
	        m[0] = new MenuItem("Marketing");  
	        Menu menuMarketing = new Menu();  
	        menuMarketing.setData(new MenuItem("Первый курс"), new MenuItem("Второй курс"),new MenuItem("Третий курс"),new MenuItem("Четвертый курс"));
	        m[0].setSubmenu(menuMarketing);  
	  
	        m[1] = new MenuItem("Sales");  
	        Menu menuSales = new Menu();  
	        menuSales.setData(new MenuItem("Первый курс"), new MenuItem("Второй курс"),new MenuItem("Третий курс"),new MenuItem("Четвертый курс"));  
	        m[1].setSubmenu(menuSales);  
	  
	        m[2] = new MenuItem("Manufacturing");  
	        Menu menuManufacturing = new Menu();  
	        menuManufacturing.setData(new MenuItem("Первый курс"), new MenuItem("Второй курс"),new MenuItem("Третий курс"),new MenuItem("Четвертый курс"));  
	        m[2].setSubmenu(menuManufacturing);  
	  
	        m[3] = new MenuItem("Services");  
	        Menu menuServices = new Menu();  
	        menuServices.setData(new MenuItem("Первый курс"), new MenuItem("Второй курс"),new MenuItem("Третий курс"),new MenuItem("Четвертый курс"));  
	        m[3].setSubmenu(menuServices);  
	  
	        return m;  
	    }  
	  
	}  