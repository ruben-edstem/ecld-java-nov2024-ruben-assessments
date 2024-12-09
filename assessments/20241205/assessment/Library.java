package com.edstem.ecld.assessment;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(String id) {
        items.removeIf(item -> item.getId().equals(id));
    }

    public List<LibraryItem> searchByTitle(String title) {
        List<LibraryItem> foundItems = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }

    public LibraryItem borrowItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id) && item.isAvailable()) {
                item.setAvailable(false);
                return item;
            }
        }
        return null;
    }

    public LibraryItem returnItem(String id) {
        for (LibraryItem item : items) {
            if (item.getId().equals(id) && !item.isAvailable()) {
                item.setAvailable(true);
                return item;
            }
        }
        return null;
    }

    public List<LibraryItem> getOverdueItems() {
        List<LibraryItem> overdueItems = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!item.isAvailable()) {
                overdueItems.add(item);
            }
        }
        return overdueItems;
    }

    public void printAllItems() {
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }
}
