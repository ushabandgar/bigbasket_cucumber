package com.bigbasket.base;

public interface Locator {
	String shopByCategoryMenu = "css##button[id*='headlessui-menu-button-:R5bab6:']";
	String categoryList = "xpath##//li[@class=\"jsx-1259984711\" and @role=\"none\"]";
	String shopByCatgeorySubCategories = "css##a[class=\"FilterByCategory___StyledLink3-sc-c0pkxv-4 bqthFs\"]";
	String filterSection = "xpath##//section[@class=\"slug___StyledMotionSection-sc-1pgl3kl-1 gzSUtc\"]";
	String brandListCheckbox = "xpath##//div[@id=\"side-filter-by-rating\"][2]/div[2]/span/input";
	String brandListNames = "xpath##//div[@id=\"side-filter-by-rating\"][2]/div[2]/span/label";
}
