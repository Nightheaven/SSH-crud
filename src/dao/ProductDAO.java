package dao;

import java.util.List;

import pojo.Product;

public interface ProductDAO {
	public List<Product> list();
	public void add(Product product);
	public void delete(Product product);
	public void update(Product product);
	public Product get(int id);
}
