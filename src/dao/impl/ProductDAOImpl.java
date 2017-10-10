package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.ProductDAO;
import pojo.Product;

public class ProductDAOImpl extends HibernateTemplate implements ProductDAO {

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return find("from Product");
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		
		return (Product)get(Product.class,id);
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		save(product);
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		super.delete(product);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		super.update(product);
	}

}
