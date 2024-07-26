package repository;

import model.User;

public interface UserRepository {

	void save(User user);

	void delete(User user);

	User find(int id);

	User update(User user);

}
