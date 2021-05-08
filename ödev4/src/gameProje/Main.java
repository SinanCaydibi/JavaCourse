package gameProje;



public class Main {

	public static void main(String[] args) {
		User user1 = new User ();
		user1.setUserId(1);
		user1.setUserName("Sinan");
		user1.setLastName("caydibi");
		user1.setNationalIdentity(12123123);
		user1.setDateOfBirth("12/12/1994");
		
		
		User user2 = new User ();
		user2.setUserId(2);
		user2.setUserName("mehmet");
		user2.setLastName("caydibi");
		user2.setNationalIdentity(10101010);
		user2.setDateOfBirth("12/12/1980");
		
		
		
		
		
		
		
		Campaign campaign1 = new Campaign();
		
		
		campaign1.setId(1);
		campaign1.setCampaignName("May Campaing");
		campaign1.setCampaignDiscount(40);
		
		
        Campaign campaign2 = new Campaign();
		
		
        campaign2.setId(2);
        campaign2.setCampaignName("April Campaing");
        campaign2.setCampaignDiscount(50);
		
        
        
        
        
        
        Game game1 = new Game();
        
        game1.setGameId(1);
        game1.setGameName("GTA V");
        game1.setGamePrice(3000);
        
        Game game2 = new Game();
        
        game1.setGameId(1);
        game1.setGameName("CS GO");
        game1.setGamePrice(2000);
        
        
        
        
        UserManager usermanager1 = new UserManager();
        usermanager1.addUser(user1);
        
        
        
        System.out.println("****************************************************************");
        
        
        User[] users = {user1,user2};
        
        
        for(User user : users) {
        	
        	
        	System.out.println("User id :"+ user.getUserId()+" "+"User Name:"+ user.getUserName()+" "+
                    "User Surname:"+user.getLastName()+" "+"User Identity:"+user.getNationalIdentity()
                    +" "+"BirthDay:"+user.getDateOfBirth());
        }
        System.out.println("****************************************************************");
        
        Game [] games = {game1,game2};
        
        
        for(Game game : games) {
        	  System.out.println("Game id :"+ game.getGameId()+" "+"Game Name:"+ game.getGameName()+" "+
                     "Game Price:"+game.getGamePrice()
                      );       
        	  
        
        }
        
        
        SaleManager saleManager = new SaleManager();
        
        saleManager.buyCampign(campaign2, user2, game2);
        saleManager.buyCampign(campaign1, user1, game1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
