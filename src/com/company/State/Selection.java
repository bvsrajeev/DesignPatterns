package com.company.State;

public class Selection implements ITool {
    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selected selectiontool");
    }
}
