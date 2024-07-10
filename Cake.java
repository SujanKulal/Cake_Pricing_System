public class Cake {
    private int price;
    private boolean veg;

    private static final int extraCherriesCost = 49;
    private static final int extraChocolatesCost = 79;
    private static final int packingCost = 29;

    private int baseCakePrice;

    private boolean isExtraCherriesAdded = false;
    private boolean isExtraChocolatesAdded = false;
    private boolean isOptedTakeAway = false;

    public Cake(boolean veg){
        this.veg = veg;
        if (this.veg){
            this.price = 199;
        }else {
            this.price = 299;
        }
        baseCakePrice = this.price;
    }

    public void addExtraCherries(){
        isExtraCherriesAdded = true;
         this.price += extraCherriesCost;
    }

    public void addExtraChocolates(){
        isExtraChocolatesAdded = true;
        this.price += extraChocolatesCost;
    }

    public void takeAway(){
        isOptedTakeAway = true;
        this.price += packingCost;
    }

    public void printBill(){
        String bill = "";
        System.out.println("BaseCakePrize: " + baseCakePrice);
        if(isExtraCherriesAdded){
            bill += "Extra Cherries Added: " + extraCherriesCost + "\n";
        }
        if(isExtraChocolatesAdded){
            bill += "Extra Chocolates Added: " + extraChocolatesCost +"\n";
        }
        if(isOptedTakeAway){
            bill += "TakeAway: " + packingCost + "\n";
        }
        bill+= "Total Bill: " + this.price + "\n";
        System.out.println(bill);
    }

    public static void main(String[] args) {
        Cake baseCake = new Cake(false);
        baseCake.addExtraCherries();
        baseCake.addExtraChocolates();
        baseCake.printBill();
    }
}
