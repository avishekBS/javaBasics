package com.learning.jersey.learningJerseyTwo.beans;

import javax.ws.rs.QueryParam;

public class QueryParamBeans {
	
	@QueryParam("year") int searchByYear;
	@QueryParam("start") int startIndex;
	@QueryParam("size") int searchSize;
	
	public int getSearchByYear() {
		return searchByYear;
	}
	public void setSearchByYear(int searchByYear) {
		this.searchByYear = searchByYear;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getSearchSize() {
		return searchSize;
	}
	public void setSearchSize(int searchSize) {
		this.searchSize = searchSize;
	}
}
