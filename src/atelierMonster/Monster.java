package atelierMonster;

public class Monster {
    private String name;
    private int damage;
    private int life;

    public Monster (String name, int damage, int life){
        this.name =name;
        this.damage = damage;
        this.life =life;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getLife() {
        return this.life;
    }

    public void attack (Monster adverse){
        adverse.setLife(adverse.getLife()-this.damage);
        if (adverse.getLife()>0){
            System.out.println(adverse.getName()+" has "+adverse.getLife()+" points remaining");
        }else {
            System.out.println(adverse.getName()+" is KO!");
        }
    }
}
