import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Brick's Store");
        List<Item> inv = new ArrayList();
        float total = 0.0f;

        Item h1 = new Item("Skyflakes", "Crackers", 6.00f);
        Item c2 = new Item("Coke", "Softdrink", 7.00f);
        Item z2 = new Item("Emperador", "Liquor", 6.00f);
        Item r4 = new Item("Ariel", "Detergent", 6.00f);
        Item f5 = new Item("Gatsby", "Hair gel", 12.00f);
       

        inv.add(h1);
        inv.add(c2);
        inv.add(z2);
        inv.add(r4);
        inv.add(f5);
      
        for(Item p: inv){
           
           if(e.Getname()=="Liquor"){
                System.out.println("Item found!");
            }
            
            else{
                System.out.println("Item not found!");
            }
            total = total + e.Getprice();
        }
        
        System.out.println(total);
    }
}
