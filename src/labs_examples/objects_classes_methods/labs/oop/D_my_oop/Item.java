package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Item {
    boolean isUsed;
    String itemName;
    int itemQuantity;

    public Item(boolean isUsed, String itemName, int itemQuantity) {
        this.isUsed = isUsed;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void useItem(){
        System.out.println("Selling Item...");

    }
    public void discardItem(){

    }
    public void sellItem(){

    }



}
