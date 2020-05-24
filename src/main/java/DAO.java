import java.util.ArrayList;

public interface DAO<T> {
	
	ArrayList<T> getAll();
	
	T getPersonel(int i);
	
	//void createTable(T t);
    
    void add(T t);
     
    void delete(T t);
    
    void update(T t);
    
    
    void create();
	

}
