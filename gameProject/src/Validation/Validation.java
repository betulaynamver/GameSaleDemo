package Validation;

import Abstract.UserValidationService;
import Entities.User;

public class Validation implements UserValidationService{

	@Override
	public boolean eDevlet(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kişisinin doğrulaması yapılmıştır.");
		return true;
	}

}
