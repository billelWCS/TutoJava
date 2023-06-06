package orienteObjet;

public class OtherClassInTheSamePackage {

    public void modifierTesting (){
        Parent parent = new Parent();

//        int var1 = parent.privateInt; pas possible
        int var2 = parent.defaultInt;
        int var3 = parent.protectedInt;
        int var4 = parent.publicInt;
    }
}
