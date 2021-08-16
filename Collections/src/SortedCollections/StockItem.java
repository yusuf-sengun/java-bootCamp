package SortedCollections;

public class StockItem implements  Comparable<StockItem> {
    private final String name;
    private double price;
    private  int quantity=0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity=0;
    }

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public int getQuantity() { return quantity; }

    public void setPrice(double price) { if(price>0.0){this.price = price;} }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void adjustStock(int quantity){
        int newQuanitity = this.quantity+quantity;
        if(newQuanitity >= 0){
            this.quantity = newQuanitity;
        }
    }
    @Override
    public boolean equals(Object obj){
        System.out.println("Netering StockItem.equals");
        if(obj == this){
            return true;
        }
        if((obj==null)|| (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((StockItem)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("entering StockItem.compareTo");
        if(this == o){
            return 0;
        }
        if(o != null){
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price "+this.price;
    }
}
