package otherPackage;
import orienteObjet.Parent;

public class ChildInOtherPackage extends Parent {

    public void modifierTesting (){

        Parent parent = new Parent();
//        int var1 = parent.privateInt;
//        int var2 = parent.defaultInt;
//        int var3 = parent.protectedInt;
        int var4 = parent.publicInt;
    }
}
