package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index = 0;

    public Cart(Item[] contents) {
        this.contents = contents;
    }

    public Cart(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be more than 0");
        this.contents = new Item[capacity];
    }
    
    public void add(Item item) {
        if (item == null) return;
        if (isFull()) return;

        contents[index] = item;
        index++;
    }

    public void removeById(long id) {
        int foundIndex = findIndexById(id);
        if (foundIndex == -1)
            return;

        shiftLeft(foundIndex);
        index--;
    }
        
        private int findIndexById(long id) {
        for (int i = 0; i < this.index; i++) {
            if (contents[i].getId() == id) {
                return i;
        }
        }
        return -1;
    }

    private void shiftLeft(int start) {
        for (int i = start; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index - 1] = null;
    }

    public boolean isFull() {
        return index == contents.length;
    }

    public int getSize() {
        return index;
    }

    public Item getItem(int i) {
        return contents[i];
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
