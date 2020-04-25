/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts4;

/**
 *
 * @author YACOB
 */
public class CourseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Instructor myInstructor = new Instructor("A. Fillah", "Salim", "ST0918");
       TextBook myTextBook = new TextBook("Kekuatan Sholat", "Prof. KH. Muhammad", "Pro U media");
       Course myCourse = new Course("Andai ini Ramadhan Terakhirku", myInstructor, myTextBook);
       System.out.println(myCourse);
    }
    }
