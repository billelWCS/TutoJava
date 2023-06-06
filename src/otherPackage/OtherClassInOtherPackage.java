package otherPackage;

import orienteObjet.Parent;

public class OtherClassInOtherPackage {
    Parent parent = new Parent();
//        int var1 = parent.privateInt; pas possible
//        int var2 = parent.defaultInt; pas possible
//        int var3 = parent.protectedInt; pas possible
        int var4 = parent.publicInt;
}
