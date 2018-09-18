package bulletinboard;

import java.util.ArrayList;

public class Menu {

    ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();

    public void addMenu(MenuItem menuItem){

        arrayList.add(menuItem);

    }

    public void run(){

        for(MenuItem mi : arrayList)
        {
            mi.click();
        }

    }

}
