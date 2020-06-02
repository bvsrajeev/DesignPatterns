package com.company;

import com.company.Iterator.BrowseHistory;
import com.company.Iterator.Iterator;
import com.company.State.Brush;
import com.company.State.Canvas;
import com.company.memento.Editor;
import com.company.memento.History;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BrowseHistory history = new BrowseHistory();
        history.Push("a");
        history.Push("b");
        history.Push("c");
        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
    public static void drawUiControl(UIControl control){
        control.draw();
    }
    public static ITaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}