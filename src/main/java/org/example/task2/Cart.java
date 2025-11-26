package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(Item[] contents) {
        this.contents = contents;
    }

    public void add(Item item) {
        if (isFull()) {
            System.out.println("Cart is full!");
            return;
        }
        this.contents[this.index] = item;
        this.index++;
    }

    public void removeById(long id) {
        if (this.index == 0)
            return;

        int pos = findItem(id);
        if (pos == -1)
            return;
        shiftLeft(pos);
    }
        
        private int findItem(long id) {
        for (int i = 0; i < this.index; i++) {
            if (this.contents[i].getId() == id)
                return i;
        }
        return -1;
    }

    private void shiftLeft(int start) {
        for (int i = start; i < this.index - 1; i++) {
            this.contents[i] = this.contents[i + 1];
        }
        this.contents[this.index - 1] = null;
        this.index--;
    }

    public boolean isFull() {
        return this.index == this.contents.length;
    }

    public int getSize() {
        return this.index;
    }

    public Item getItem(int i) {
        return this.contents[i];
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(contents) +
                '}' + "\n";
    }
}
