package com.softdebugs.javapracticemodule.designpattern.adapterpattern;

public class PenAdapter implements Pen {

    private final PilotPen pilotPen = new PilotPen();
    @Override
    public void write(String str) {
        pilotPen.write(str);
    }
}
