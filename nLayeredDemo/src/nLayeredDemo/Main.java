package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		// Kesinlikle entities d���nda newleme yap�lmamal�d�r!

		// ToDo: Spring IoC ile iyi koda �evrilecek.
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

		Product product = new Product(1, 2, "Apple", 12, 50);
		productService.add(product);
	}

}
