package item;

import game.Player;

public abstract class Item {
    private String itemName;
    private int value;

    public static Item[] itemList(){
        return new Item[]{new ItemEmpty(), new PokeballNormal(), new PokeballGreat(), new PokeballUltra(), new PotionNormal(), new PotionSuper(), new PotionHyper()}; //TODO add the items here
    }

    public abstract int use(Player user);

    public String getItemName() {
        return itemName;
    }

    protected void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getValue() {
        return value;
    }

    protected void setValue(int value) {
        this.value = value;
    }

    /*public int use(Player user){
        int caught = 0;
        double healthGain;

        switch(itemID){
            case 1:
                System.out.println("Go Pokeball!");
                caught = catchPokemon(1);
                return caught;
            case 2:
                System.out.println("Go Greatball!");
                caught = catchPokemon(1.5);
                return caught;
            case 3:
                System.out.println("Go Ultraball!");
                caught = catchPokemon(2);
                return caught;
            case 4:
                user.party[0].setHealth(user.party[0].getHealth() + 20);
                healthGain = user.healthCheck(20);
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
            case 5:
                user.party[0].setHealth(user.party[0].getHealth() + 50);
                healthGain = user.healthCheck(50);
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
            case 6:
                user.party[0].setHealth(user.party[0].getHealth() + 200);
                healthGain = user.healthCheck(200);
                System.out.println("You have regained " + healthGain + " HP.");
                return caught;
        }
        return caught;
    } */

}