package jp.co.internous.deneb.model.domain.dto;

import java.sql.Timestamp;

import jp.co.internous.deneb.model.domain.MstProduct;

public class CartDto{
	
	private int id;
	private String productName;
	private String imageFullPath;
	private int price;
	private int productCount;
	private int subtotal;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	public CartDto() {
	}
	
	public CartDto(String imageFullPath, String productName, int productCount) {
		this.imageFullPath = imageFullPath;
		this.productName = productName;
		this.productCount = productCount;
	}
	
	public CartDto(MstProduct p) {
	this.setId(id);
	this.setImageFullPath(p.getImageFullPath());
	this.setProductName(p.getProductName());
	this.setPrice(p.getPrice());
	this.setProductCount(productCount);
	this.setSubtotal(subtotal);
	this.setCreatedAt(createdAt);
	this.setUpdatedAt(updatedAt);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImageFullPath() {
		return imageFullPath;
	}

	public void setImageFullPath(String imageFullPath) {
		this.imageFullPath = imageFullPath;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}