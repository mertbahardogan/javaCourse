package Abstract;

public interface BaseRepository<T> {
	
	void add(T entity) throws Exception;
	void delete(T entity);
	void update(T entity);
	}
