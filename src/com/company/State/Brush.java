package com.company.State;

public class Brush implements ITool {
    @Override
    public void mouseUp() {
        System.out.println("colored with brush");
    }

    @Override
    public void mouseDown() {
        System.out.println("selected brusshing tool");
    }
}
