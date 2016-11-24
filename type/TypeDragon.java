package type;

public class TypeDragon extends Type{
    static final byte SPOT = 4;

    public TypeDragon(){
        name = "Dragon";
        typeAdvantages = new byte[][]{{SPOT}, {TypeGrass.SPOT, TypeWater.SPOT, TypeFire.SPOT, TypeElectric.SPOT}};
        typeNulls = new byte[]{TypeFairy.SPOT};
    }

}