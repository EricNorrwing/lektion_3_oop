package com.EricNorrwing.Lektion_3_temp;

import com.EricNorrwing.Lektion_3_temp.model.Student;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        //com.company(or personal)name.region(optional).appname

        // Design adds value faster than it adds cost
        // Static > Alla referenser pekar på samma plats
        /* Method Syntax
        * #1 Visibility modifier, public, protected, no-mod, private
        * #2 Static: Exclude if not needed
        * #3 Datatype to return: (int, String, bool.....)(If no return, apply "void")
        * #4 Name: camelcase (addTwoNumbersTogether())
        * #5 Sample: Private static int addTwoNumbersTogether(){}
        * */

        //Instansiering, skapandet av en instans av en klass med attribut
        //Kontruktor (constructor)(is a method, but becomes a constructor if the name is the same as the class)

        //OOP testing
        //instantiate object (Student)

        Student benny = new Student(15, "Benny", 2005);
        Student frida = new Student(17, "Frida", 1997);
        Student eric = new Student(15, "Eric", 1935);
        System.out.println(benny+ "\n" + frida + "\n" + eric + "");


        System.out.println("Is this the first COMMIT!?");


        /*System.out.println(randomNumber());
        System.out.println("The random numbers add to:");
        for (int i = 0; i < 2; i++) {
            //create variables first, then initialize
            int x;
            int y;

            x = randomNumber();
            y = randomNumber();

            System.out.println(addition(x,y));

        }

         */
        //this is a new comment
        System.out.println("This is a new commit coming through");
    }


    public static int addition(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static int randomNumber(){
        int x = (int)(Math.random()*100) +1;
        return x;
    }


}


