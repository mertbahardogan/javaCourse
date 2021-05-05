package Concrete;

import Entities.Sale;

public class SaleManager {

	public void add(Sale entity) {
		if (entity.getUser().getIsValid() == true) {
			System.out.println("Game sold!  " + entity.toString());
		}
		else {
			System.out.println("Game can not sale. Invalid person type!");
		}

	}

}
