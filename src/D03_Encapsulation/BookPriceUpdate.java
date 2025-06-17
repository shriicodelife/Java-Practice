package D03_Encapsulation;
//4. Book Price Update
//Task:
//Class Book with private price.
//Allow updating price only if it’s above 0.
//Use getPrice() to read the current price.
//
//✔ Goal: Use encapsulation to protect wrong price values.
public class BookPriceUpdate {
    private int price;
    public void setPrice(int price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println("Invalid Price");
        }
    }
    public int getPrice(){
        return price;

    }
    //main method

    public static void main(String[] args) {
        BookPriceUpdate bookPriceUpdate = new BookPriceUpdate();
        bookPriceUpdate.setPrice(200);
        System.out.println("Valid Book price: ₹" + bookPriceUpdate.getPrice());

        bookPriceUpdate.setPrice(90);
        bookPriceUpdate.setPrice(9000);

        System.out.println("Final stored price: ₹" + bookPriceUpdate.getPrice());


    }

    }
