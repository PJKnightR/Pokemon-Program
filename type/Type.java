package type;

import java.util.ArrayList;

public abstract class Type {
    protected String name;
    //0 = offense, 1 = defense
    protected byte[][] typeAdvantages;
    protected byte[] typeNulls;
    static final double TYPE_ADVANTAGE_MULT = 2, TYPE_DISADVANTAGE_MULT = 0.5;

    String getName(){
        return name;
    }

    public static Type[] getTypes(){
        return new Type[]{new TypeGrass(), new TypeWater(), new TypeFire(), new TypeBug(), new TypeDragon(), new TypeDark(), new TypeNormal(), new TypeFlying(), new TypePoison(), new TypeIce(), new TypePsychic(), new TypeSteel(), new TypeFighting(),
        new TypeGhost(), new TypeGround(), new TypeRock(), new TypeElectric(), new TypeFairy()};
    }

    Type[] getTypeAdvantagesOffensive(){
        ArrayList<Type> hold = new ArrayList<>();
        for(byte i : typeAdvantages[0]){
            hold.add(getTypes()[i]);
        }
        return hold.toArray(new Type[hold.size()]);
    }

    int getTypeAdvantageOffensiveNum(){
        return typeAdvantages[0].length;
    }

    Type[] getTypeAdvantagesDefensive(){
        ArrayList<Type> hold = new ArrayList<>();
        for(byte i : typeAdvantages[1]){
            hold.add(getTypes()[i]);
        }
        return hold.toArray(new Type[hold.size()]);
    }

    int getTypeAdvantageDefensiveNum(){
        return typeAdvantages[1].length;
    }

}