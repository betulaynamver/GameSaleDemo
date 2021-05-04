package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : isimli kullan�c� sisteme eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " "  + user.getLastName() + " : isimli kullan�c� sistemden silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : isimli kullan�c� bilgileri g�ncellendi");
		
	}

}
