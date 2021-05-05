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
		// Kesinlikle entities dýþýnda newleme yapýlmamalýdýr!

		// ToDo: Spring IoC ile iyi koda çevrilecek.
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());

		Product product = new Product(1, 2, "Apple", 12, 50);
		productService.add(product);
	}

}
