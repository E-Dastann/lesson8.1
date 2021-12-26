package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero{
    public Magic(int health, int damage,String name) {
        super(health, damage,
                SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int magics1 = RPG_Game.random.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i]!=this){
                heroes[i].setHealth(heroes[i].getHealth()+magics1);
                System.out.println("Magic увеличил силу ");

            }

        }



    }
}
