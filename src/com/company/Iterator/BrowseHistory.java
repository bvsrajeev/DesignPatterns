package com.company.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void Push(String Url){
        urls.add(Url);
    }

    public String Pop(){
        return this.urls.remove(urls.size()-1);
    }

    public Iterator createIterator(){
        return new ListIterator();
    }

    public class ListIterator implements Iterator {
        private int currentIndex;
        public ListIterator(){
            currentIndex = 0;
        }

        @Override
        public void next() {
            currentIndex++;
        }

        @Override
        public String current() {
            return urls.get(currentIndex);
        }

        @Override
        public boolean hasNext() {
            return currentIndex <= urls.size()-1;
        }
    }
}
