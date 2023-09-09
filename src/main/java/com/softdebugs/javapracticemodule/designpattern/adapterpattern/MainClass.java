package com.softdebugs.javapracticemodule.designpattern.adapterpattern;


/*
   * Adapter pattern works as a bridge between two incompatible interfaces.

   * This pattern involves a single class which is responsible to join functionalities of independent or incompatible
    interfaces
*/
public class MainClass {

    public static void main(String args[]) {
        Pen pen = new PenAdapter();
        AssignmentWorks aw = new AssignmentWorks();
        aw.start(pen);
    }
}
