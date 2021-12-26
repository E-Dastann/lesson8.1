package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero{
    public Berserk(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int berserk= RPG_Game.random.nextInt(50);
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth()-berserk);
            System.out.println("Berserk вернул все уроны ");
            break;





    }
}}
