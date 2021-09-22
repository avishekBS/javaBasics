package com.learning.springboot.microservices.model;

import java.util.List;

public class CatalogItemListWrapper {
	
	private List<CatalogItem> listofCatalogItem;

	public List<CatalogItem> getListofCatalogItem() {
		return listofCatalogItem;
	}

	public void setListofCatalogItem(List<CatalogItem> listofCatalogItem) {
		this.listofCatalogItem = listofCatalogItem;
	}
}
