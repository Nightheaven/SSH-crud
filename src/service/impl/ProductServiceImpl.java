package service.impl;

import java.util.List;

import dao.ProductDAO;
import pojo.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
	ProductDAO productDAO;
	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return productDAO.list();
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		productDAO.add(product);
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		productDAO.delete(product);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		productDAO.update(product);
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return productDAO.get(id);
	}

}
