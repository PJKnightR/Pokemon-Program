/**
 * Created by hidden on 11/16/16.
 */
public class PokemonBulbasaur extends Pokemon{

    public PokemonBulbasaur(Player user){
        name = "Bulbasaur";
        lev = levelGenerator(user);
        iv = ivGenerator(); //will need seperate generators for each stats IVs
        //id = 1;
        //pokeNum = 1; //for the pokedex
        exp = Math.pow(lev * 10 , 2);
        type = "Grass";
        atk = (49 * 2 + iv) * lev / 100 + 5;
        def = (49 * 2 + iv) * lev / 100 + 5;
        spAtk = (65 * 2 + iv) * lev / 100 + 5;
        spDef = (65 * 2 + iv) * lev / 100 + 5;
        spd = (45 * 2 + iv) * lev / 100 + 5;
        hp = (45 * 2 + iv) * lev / 100 + 10;
        att = new String[]{"Vine Whip", "Razorleaf", "Seed Bomb", "Solarbeam"};
        attPower = new int[]{45, 55, 80, 120};
        attType1 = new String[]{"Grass", "Grass", "Grass", "Grass"};
        attType2 = new String[]{"Physical", "Physical", "Physical", "Special"};
    }
}