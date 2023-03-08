public class Main {
    public static void main(String[] args) {

        // --Exercises 1 and 2--
        Person firstPerson = new Person("Damian", 22, false);
        Person secondPerson = new Person("Remus", 33, true);
        Person thirdPerson = new Person("Cristina", 18, false);

        // --Exercises 3 and 4--
        //First Product
        Product firstProduct = new Product("Apple", 2.50, 0, "Fruit");
        firstProduct.isCategory("Fruit");
        firstProduct.hasStock();
        //Second Product
        Product secondProduct = new Product("Blender", 85.77, 12, "Kitchen product");
        secondProduct.isCategory("Appliances");
        secondProduct.hasStock();
        //Third Product
        Product thirdProduct = new Product("Orange", 3.75, 500, "Fruit");
        thirdProduct.isCategory("Fruit");
        thirdProduct.hasStock();

        //Exercise 5
        Bottle firstBottle = new Bottle(3, 2, true);
        firstBottle.openTheBottle();//corner case in action: the bottle is already opened
        firstBottle.closeTheBottle();
        firstBottle.drinkFromBottle(1.5);
        firstBottle.availableLiquid();
        firstBottle.emptyCapacity();
        firstBottle.hasLiquid();
        firstBottle.drinkFromBottle(5);//corner case in action: not enough liquid to drink

    }
}