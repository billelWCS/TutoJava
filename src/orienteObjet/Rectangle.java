package orienteObjet;

public class Rectangle {
    public int hauteur;
    public int largeur;
    public int surface;
    public String color = "grey";

    public Rectangle(int hauteur, int largeur, int surface){
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.surface = surface;
    }

    public Rectangle(int hauteur, int largeur){
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.surface = hauteur * largeur;
    }


}
