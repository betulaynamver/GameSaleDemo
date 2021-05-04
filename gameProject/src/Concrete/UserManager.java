package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : isimli kullanıcı sisteme eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " "  + user.getLastName() + " : isimli kullanıcı sistemden silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " : isimli kullanıcı bilgileri güncellendi");
		
	}

}
