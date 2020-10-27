package com.example;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private String picPath;

	
	public String getPicPath() {
		return picPath;
	}

	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	
	
}

//<img th:src="@{/images/${product.picPath}.jpg}" />

//<img th:src="@{/images/'${product.picPath}'.jpg}" />

//<img th:src="@{/images/Moon.jpg}" />
