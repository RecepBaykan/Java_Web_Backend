package repository;

public interface ObjectRepository<Model, ID> {
	
	
	void save(Model model);
	
	void delete(Model model);
	
	void update(Model model);
	
	Model find(ID id);
	
	
	
	

}
