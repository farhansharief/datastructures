package datastructures;

import java.util.Arrays;

public class IntArrayList {

	private int[] items;
	private int size;
	
	
	public IntArrayList() {
		this.items = new int[0];
		this.size = 0;
	}
	
	public void add(int item) {
		if (isFUll()) {
			resize(size + 1);
		}
		
		items[size] = item;
		size++;
	}
	
	public void add(int index, int element) {
		if (isFUll()) {
			resize(size + 1);
		}
		
		moveFromIndex(index);
		
		items[index] = element;
		size++;
	}
	
	public void addAll(int[] elements) {
		if (isFUll()) {
			resize(size + elements.length);
		}
		
		for (int i = 0; i < elements.length; i++) {
			items[size + i] = elements[i];
		}
		
		size += elements.length;
	}
	
	public int get(int index) {
		if (index >= size) {
			throw new RuntimeException("Index: " + index + " is out of bounds");
		}
		return items[index];
	}
	
	public void remove(int index) {
		size--;
		for (int i = index; i < size; i++) {
			items[i] = items[i + 1];
		}
	}
	
	public void clear() {
		items = new int[0];
		size = 0;
	}
	
	public void set(int index, int element) {
		items[index] = element;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFUll() {
		return size == items.length;
	}
	
	private void resize(int newSize) {
		items = Arrays.copyOf(items, newSize);
	}
	
	private void moveFromIndex(int index) {
		for (int i = size; i > index; i--) {
			items[i] = items[i - 1];
		}
	}
	
	public int[] getItems() {
		return items;
	}
	public void setItems(int[] items) {
		this.items = items;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
