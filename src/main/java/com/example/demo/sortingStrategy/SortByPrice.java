package com.example.demo.sortingStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.example.demo.item.StockItem;

public class SortByPrice implements SortingStrategy {

	@Override
	public ArrayList<StockItem> ascendingOrder(ArrayList<StockItem> products) {
		
		Collections.sort(products, new Comparator<StockItem>() {
		    @Override
		    public int compare(StockItem c1, StockItem c2) {
		        return Double.compare(c1.getPrice(), c2.getPrice());
		    }
		});
		
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getPrice());
		}

		return products;
	}

	@Override
	public ArrayList<StockItem> descendingOrder(ArrayList<StockItem> products) {
		Collections.sort(products, new Comparator<StockItem>() {
		    @Override
		    public int compare(StockItem c1, StockItem c2) {
		        return Double.compare(c1.getPrice(), c2.getPrice());
		    }
		});
		Collections.reverse(products);
		
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getPrice());
		}
		return products;
	}


}
