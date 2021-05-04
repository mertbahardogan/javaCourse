import java.time.LocalDate;

import Adapter.CheckServiceAdapter;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) throws Exception {

		User userValid = new User(1, "Mert", "Bahardo�an", LocalDate.of(1996, 01, 01), "12312312323");
		User userInvalid = new User(2, "Emre", "Yanl��", LocalDate.of(2010, 01, 01), "123");
		UserManager userManager = new UserManager(new CheckServiceAdapter());
		userManager.add(userValid);
		
		Game game1=new Game(1,"GTAV",250);
		GameManager gameManager =new GameManager();
		gameManager.add(game1);
		
		Campaign campaign1=new Campaign(1,"19 May Campaign",19);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		
		System.out.println("*********************");
		
		Sale sale1=new Sale(1,userValid,campaign1,game1);
		SaleManager saleManager=new SaleManager();
		saleManager.add(sale1);
		
	}

}