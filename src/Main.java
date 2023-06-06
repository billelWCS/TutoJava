import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main (String [] args){

        System.out.println("************************\n");

        int myInt  = 3;

        Integer myInteger = 3;
        Double myDouble = 1.11;

        float myFloat = myInteger.floatValue();
        String str = "333";
        myInt = Integer.parseInt(str);
//        System.out.println(myInt + 44);

        boolean myBoolean = myInt == 3;

//        if (myBoolean && 3 == 3 || 12+4 == 3 ){
//            System.out.println("La condition est vrai");
//        }else {
//            System.out.println("La condition est fausse");
//        }

        int [] myTable = new int[3];
        myTable[0] = 12;

        int [] myOtherTable = {1, 3, 5};

        String [] myStringTable = {"coucou" ,"hey", "Hello", "yo"};

//        for (int i=myStringTable.length-1; i >= 0; i--){
//            System.out.println(myStringTable[i]);
//        }

        int [] myTableOfInts = new int [100];

//        for (int i = 0 ; i<myTableOfInts.length; i++){
//            myTableOfInts[i] = i+1;
//            System.out.println("l'indice : "+i+" valeur : "+myTableOfInts[i] );
//        }

        char myChar ;
        String myOtherString;

        String myString = "0123456789";
//        String[] myWords = myString.split(" ");

//        System.out.println(myString.substring(1, 5));

//        System.out.println(Arrays.toString(myWords));

        String myUpperCaseString = myString.toUpperCase();

//        System.out.println(myUpperCaseString);

        String myFirstString = "ABBES";
        String mySecondString = "BE";



//        System.out.println(myFirstString.endsWith(mySecondString)) ;

        int[] temeratures = { 10, -3, -2,   22, -50};
//        System.out.println(colseToZero(temeratures));

//        Les listes
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(14);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(16);
        list2.add(17);

        list.addAll(list2);
        list.add(2, 15);

//        System.out.println("la list avant : "+ list );
        int elemtSupprimee = list.remove(2);
        int elemtRecupere = list.get(list.size()-1);

//        if (list.isEmpty()){
//            System.out.println("la liste est vide");
//        }else {
//            System.out.println("la liste n'est pas vide");
//        }
//
//        System.out.println("la list après : " +list);
//        System.out.println( "l'element supprimé est : "+ elemtSupprimee);
//        System.out.println( "l'element recuperé est : "+ elemtRecupere);
//        System.out.println("la taille de la liste : " + list.size());

        ArrayList<String> listOfStrings = new ArrayList<>();
        String myStr = "first text";
        String myOtherStr = "second text";
        String otherStr = "third text";

        listOfStrings.add(myStr);
        listOfStrings.add(myOtherStr);
        listOfStrings.add(otherStr);

//        System.out.println(listOfStrings);

        myStr = "first text changed";

//        System.out.println(listOfStrings);

//        ArrayList<String> otherListOfStrings = listOfStrings;
//
//        System.out.println(otherListOfStrings);
//        listOfStrings.add("other text");
//        System.out.println(otherListOfStrings);

//        ArrayList<String> otherListOfStrings = (ArrayList<String>) listOfStrings.clone();

        ArrayList<String> otherListOfStrings = new ArrayList<>();

        for (String s : listOfStrings){
//            System.out.println(s);
//            otherListOfStrings.add(s);
        }


//        System.out.println(otherListOfStrings);
//        listOfStrings.add("other text");
//        System.out.println(otherListOfStrings);


        ArrayList<String> myIntLists = new ArrayList<>();
        myIntLists.add("12");
        myIntLists.add("13");
        myIntLists.add("16");

//        int sum = 0;
//        for (String val : myIntLists){
//            sum+= val;
//        }
//        myIntLists.remove(eltASupprime);

        System.out.println(" la liste avant : "+ myIntLists);

        String eltASupprime = "12";

        int indexOfElmtAsupprime = -1;

        for (String val : myIntLists){
            if (val==eltASupprime){
                indexOfElmtAsupprime = myIntLists.indexOf(val);
            }
        }

        if (indexOfElmtAsupprime != -1){
            myIntLists.remove(indexOfElmtAsupprime);
        }



//        for (int i = 0; i<myIntLists.size(); i++){
//            if (myIntLists.get(i)==eltASupprime){
//                myIntLists.remove(myIntLists.get(i));
//            }
//        }

        System.out.println(" la liste après : "+ myIntLists);




        System.out.println("\n************************");
    }











    public static int colseToZero(int[] temeratures){
        int minTemp = Integer.MAX_VALUE;
        int minTempAbs = Integer.MAX_VALUE;

        for (int i=0; i < temeratures.length;i++){
            if (Math.abs(temeratures[i]) < minTempAbs && temeratures[i] > minTemp){
                minTemp = temeratures[i];
                minTempAbs = Math.abs(temeratures[i]);
            }
        }
        return minTemp;
    }

    public void affichage (){
        System.out.println("hello world");
    }

    public int sum (int a , int b){
        return a + b ;
    }


}



