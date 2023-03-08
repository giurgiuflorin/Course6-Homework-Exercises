public class Bottle {

    private double capacity;
    private  double availableLiquid;
    private boolean open;

    Bottle(double capacity, double availableLiquid, boolean open){
        this.capacity = capacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean hasLiquid(){
        if (availableLiquid > 0){
            System.out.println("The bottle has enough capacity for more liquid.");
            return true;
        } else {
            System.out.println("There is no room for more liquid!");
            return false;
        }
    }

    public double availableLiquid(){
        if (availableLiquid > 0){
            System.out.println("The bottle has " + availableLiquid + "liters left");
        } else {
            System.out.println("The bottle is empty!");
        }
        return this.availableLiquid;
    }

    public double emptyCapacity(){
        double emptyCapacity = capacity - availableLiquid;
        if (emptyCapacity == 0){
            System.out.println("The bottle is full, there is no empty capacity!");
        }
        System.out.println("The bottle has the empty capacity of " + emptyCapacity + "liters.");
        return emptyCapacity;
    }

    public boolean openTheBottle(){
        if (open){
            System.out.println("The bottle is already opened!");
        } else {
        this.open = true;
        System.out.println("Bottle is opened");
        }
        return true;

    }

    public boolean closeTheBottle(){
        if(open){
            System.out.println("Bottle closed");
        } else {
            System.out.println("Bottle already closed");
        }
        return true;
    }

    public double drinkFromBottle(double drink){
        if (availableLiquid <= 0){
            System.out.println("There is zero liquid in the bottle!");
        } else if (availableLiquid < drink) {
            System.out.println("There is no sufficient amount of liquid for your request!");
            return -1;
        }
        availableLiquid -= drink;
        System.out.print("You drinked " + drink + "liters. ");

        return availableLiquid;

    }
}
