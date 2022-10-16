package com.etisalat.automation.model;

import com.poiji.annotation.ExcelCellName;

public class TableSearchTestingData {

	@ExcelCellName(value = "url")
	private String url;

	@ExcelCellName(value = "valueFilter")
	private String valueFilter;

	@ExcelCellName(value = "mayValue")
	private String mayValue;

	@ExcelCellName(value = "expectedResult")
	private String expectedResult;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getValueFilter() {
		return valueFilter;
	}

	public void setValueFilter(String valueFilter) {
		this.valueFilter = valueFilter;
	}

	public String getMayValue() {
		return mayValue;
	}

	public void setMayValue(String mayValue) {
		this.mayValue = mayValue;
	}

	public String getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(String expectedResult) {
		this.expectedResult = expectedResult;
	}

}
