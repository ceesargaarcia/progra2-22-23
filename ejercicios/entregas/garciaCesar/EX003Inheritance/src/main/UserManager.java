package src.main;

public class UserManager extends Manager {
	public UserManager() {
		super(maxUsers);
	}

	public void registerUser(User user) {
		// registrar usuario
	}

	public boolean isUserAdmin(User user) {
		// determinar si el usuario es admin
		return false;
	}
}