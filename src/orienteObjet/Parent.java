package orienteObjet;

public class Parent {

    private int privateInt = 1;
    int defaultInt = 2;
    protected int protectedInt = 3;
    public int publicInt = 4;

    public void modifierTesing(){
        int var1 = this.privateInt;
        int var2 = this.defaultInt;
        int var3 = this.protectedInt;
        int var4 = this.publicInt;
    };

}
