package com.etisalat.automation.util;

public interface Constants {

	public static final String COOKIES_XPATH = "//*[text()='Accept All Cookies']";
	public static final String MENU_XPATH = "(//span[@class='ag-icon ag-icon-menu'])[4]";
	public static final String FILTER_CSS_SELECTOR = "div.L_fk.container-fluid.p-0.d-flex.flex-column div.L_fl.d-flex.flex-column.flex-lg-row.flex-grow-1 div.S_N8 section.S_N9:nth-child(4) div.ag-theme-alpine div.ag-root-wrapper.ag-ltr.ag-layout-normal div.ag-theme-alpine.ag-popup div.ag-tabs.ag-menu.ag-focus-managed.ag-ltr.ag-popup-child div.ag-tabs-header.ag-menu-header span.ag-tab:nth-child(2) > span.ag-icon.ag-icon-filter";
	public static final String SEARCH_XPATH = "//span[@class='ag-icon ag-icon-small-right']";
	public static final String VALUE_FILTER_XPATH = "(//input[@class='ag-input-field-input ag-text-field-input'])[4]";
	public static final String SCROLL_XPATH = "//div[@class='ag-body-horizontal-scroll-viewport']";
	public static final String ICON_MENU_XPATH = "(//span[@class='ag-icon ag-icon-menu'])[7]";
	public static final String INPUT_ID = "ag-370-input";
	public static final String MAY_XPATH = "//div[contains(text(),'$79,809')]";
	public static final String script = "arguments[0].scrollLeft += 1250";
}
