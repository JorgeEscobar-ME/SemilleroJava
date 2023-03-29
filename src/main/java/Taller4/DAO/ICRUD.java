package Taller4.DAO;

import java.util.List;

public interface ICRUD {
    public void save(Object object);
    public void update(Object object);
    public void delete(String id);
    public Object find(String id);
    public List show();
}
