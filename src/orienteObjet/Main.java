package orienteObjet;

public class Main {
    public static void main (String [] args){

        Canard canard1 = new Canard("canard1", 4, true);
        System.out.println("Nous avons :" +Canard.getNbCanard() +" canards");

        Canard canard2 = new Canard("canard2", 2, true);
        System.out.println("Nous avons :" +Canard.getNbCanard() +" canards");

        Canard canard3 = new Canard("canard2", 2, true);
        System.out.println("Nous avons :" +canard2.getNbCanard() +" canards");










//        Canard canard2 = new Canard("canard2", 2);
//        Canard canard3 = new Canard();

        String nameOfCanard = canard1.getName();
        canard1.setName("DonaldDuck");

        canard1.setSleeping(true);
        int ageOfCanard = canard1.getAge();

        Rectangle rec1 = new Rectangle(5, 2, 11);
        Rectangle rec2 = new Rectangle(5, 2);

//        String nameOfCanard = "DonaldDuck";
//        int ageOfCanard = 2;
//        Canard canard4 = new Canard(nameOfCanard, ageOfCanard);
//        System.out.println("L'age du canard avant est : "+ canard4.age);

//        nameOfCanard = "DonaldTrump";
//        ageOfCanard = 3;
//        System.out.println("L'age du canard après est : "+ canard4.age);


//        String nameOfCanard = "DonaldDuck";
//        Canard canard4 = new Canard(nameOfCanard, 2);
//
//        System.out.println("nameOfCanard avant est : "+ nameOfCanard);
//        canard4.name = "DonaldTrump";
//
//        System.out.println("nameOfCanard après est : "+ nameOfCanard);

        Actor jonnyDeep = new Actor("Jonny Deep");
        Movie movie = new Movie("Pirate" , jonnyDeep);

        Actor angelinaJolie = new Actor("Angelina Jolie");
//        System.out.println("le nom de l'acteur avant : "+movie.actor.name);
//        actor.name = "Angelina Jolie";
//        System.out.println("le nom de l'acteur après : "+movie.actor.name);

//        System.out.println("le nom de l'acteur avant : "+jonnyDeep.name);
        movie.actor = angelinaJolie;
//        System.out.println("le nom de l'acteur après : "+jonnyDeep.name);


    }
}
