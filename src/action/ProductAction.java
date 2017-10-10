package action;

import java.util.List;

import pojo.Product;
import service.ProductService;

public class ProductAction {
	List<Product> products;
	Product product;
	ProductService productService;
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public ProductService getProductService() {
		return productService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	public String list(){
		products = productService.list();
		return "listProduct";
	}
	public String add(){
		productService.add(product);
		return "listProductAction";
	}
	public String delete(){
		productService.delete(product);
		return "listProductAction";
	}
	public String update(){
		productService.update(product);
		return "listProductAction";
	}
	public String edit(){
		product = productService.get(product.getId());
		return "editProduct";
	}
}
