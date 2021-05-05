import java.time.LocalDate;

import Adapter.CheckServiceAdapter;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) throws Exception {

		User userValid = new User(1, "Mert", "Bahardoðan", LocalDate.of(1996, 01, 01), "12312312323",false);
		User userInvalid = new User(2, "Emre", "Yanlýþ", LocalDate.of(2010, 01, 01), "123",false);
		UserManager userManager = new UserManager(new CheckServiceAdapter());
		userManager.add(userInvalid);
		
		Game game1=new Game(1,"GTAV",250);
		GameManager gameManager =new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1=new Campaign(1,"19 May Campaign",19);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		System.out.println("*********************");
		
		Sale sale1=new Sale(1,userValid,campaign1,game1);
		Sale sale2=new Sale(2,userInvalid,null,game1);
		SaleManager saleManager=new SaleManager();
		saleManager.add(sale1);
		saleManager.add(sale2);
		
		
	}

}
