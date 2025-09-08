package NasruPracticeforDSA.Optional;

import java.util.Optional;

public class Example1 {
    /*
    Optional is a container  that either Has Somthing in it or Doesn't
    What if there is no Cat named "Nasru" in the dataBase


INTSTEAD OF RETURNING A ACTUAL CAT OBJECT OR NULL
IT INSTEAD RETURNS AN OPTIONAL

OPTIONAL --> IT EITHER CONTAINS A CLASS OR AN OPTIONAL
 THE MAIN PURPOSE OF AN OPTIONAL IS TO EXPLICITLY TELL THE USER OF A
 METHOD THAT THE VALUE THAT WE ARE LOOKING FOR MIGHT NOT EXIST

 OPTIONAL -> HEY I MIGHT NOT HAVE A VALUE  IN HERE, SO YOU HAVE TO BE PREPARED
 TO HANDLE THAT SITUATION
     */
    public static void main(String[] args) {
    Optional<Cat> optionalCat = findCatByName("Nasru");
//        System.out.println(optionalCat.get().getAge()) ;

//        if(optionalCat.isPresent()){
//            System.out.println(optionalCat.get().getAge());
//
//        }
//        else {
//            System.out.println(0);
//        }

//       Cat myCat = optionalCat.orElse(new Cat("Unknown",0));
//        Cat myCat = optionalCat.orElseGet();

//        Cat myCat= optionalCat.orElseThrow();


    optionalCat.map(Cat::getAge)
                .orElse(0);


    }
    private static Optional<Cat> findCatByName(String name){
        Cat cat= new Cat(name,7);
        return Optional.ofNullable(cat);
    }
}
