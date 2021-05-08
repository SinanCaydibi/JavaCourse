package gameProje;

public class GameManager implements GameServices {

	@Override
	public void addGame(User user, Game game) {
		System.out.println(user.getUserName()+" user"+ " "+ game.getGameName() +" "+" game added");
	}

	@Override
	public void deleteGame(User user, Game game) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName()+" user"+ " "+ game.getGameName() +" "+" game added");
	}

	@Override
	public void updateGame(User user, Game game) {
		// TODO Auto-generated method stub
		System.out.println(user.getUserName()+" user"+ " "+ game.getGameName() +" "+" game added");
	}
	

}
