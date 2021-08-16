package SortedCollections;

import java.util.HashMap;

public class StoredCollectionsMain {
    private  static  StockList  stockList = new StockList();
    public static void main(String[] args) {

        StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);
        temp = new StockItem("car",12.50,2);
        stockList.addStock(temp);
        temp = new StockItem("chair",62.0,10);
        stockList.addStock(temp);
        temp = new StockItem("cup",0.5,200);
        stockList.addStock(temp);
        temp = new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp = new StockItem("door",72.95,4);
        stockList.addStock(temp);
        temp = new StockItem("juice",2.5,36);
        stockList.addStock(temp);
        temp = new StockItem("phone",96.99,35);
        stockList.addStock(temp);
        temp = new StockItem("towel",2.40,80);
        stockList.addStock(temp);
        temp = new StockItem("vase",8.76,40);
        stockList.addStock(temp);
        temp = new StockItem("pen",1.12);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timsBasket = new Basket("Tim",new HashMap<>());
        sellItem(timsBasket,"car",1);
        System.out.println(timsBasket);

        sellItem(timsBasket,"car",1);
        sellItem(timsBasket,"spanner",5);
        System.out.println(timsBasket);

        sellItem(timsBasket,"juice",4);
        sellItem(timsBasket,"cup",12);
        sellItem(timsBasket,"bread",1);
        System.out.println(timsBasket);


        System.out.println(stockList);

    }

    public static  int sellItem(Basket basket, String item,int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem==null){
            System.out.println("We don't sell "+ item);
            return 0;
        }
        if(stockList.sellStock(item,quantity)!=0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}
