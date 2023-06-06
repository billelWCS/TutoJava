package orienteObjet;

public class Canard {

    private String name;
    private int age ;
    private boolean sleeping;

    private static int nbCanard = 0;

    public Canard(String name, int age, boolean sleeping){
        this.name = name;
        this.age = age;
        this.sleeping = sleeping;
        nbCanard++;
    }

    public Canard(String name, int age){
        this.name = name;
        this.age = age;
        this.sleeping = false;
    }

    public Canard(){
        this.name = "canard par default";
        this.sleeping = true;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isSleeping(){
        return this.sleeping;
    }

    public void setSleeping(boolean sleeping){
        this.sleeping=sleeping;
    }

    public String sePresenter(){
        return "Je suis le canard "+this.name+ " et j'ai "+ this.age+ " an(s)";
    }

    public static String describeCanard(){
        return "Le canard est un oiseau ..etc";
    }

    public static int getNbCanard(){
        return nbCanard;
    }

}
