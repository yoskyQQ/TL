package Mentor.model;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Mentor.ItemDAO;

@Service
@Transactional
public class ItemService {
	@Autowired
private ItemDAO iDao;
	
	public void insert(Item item) throws ClassNotFoundException, SQLException {//0413註解19-30
		 iDao.insert(item);
	}
//	public Item update(Item item) {
//		return iDao.save(item);
//	}
//	public void deleteById(Integer itemId) {
//		iDao.deleteById(itemId);
//	}
//	public Item findById(Integer itemId) {
//		Optional<Item> op1 = iDao.findById(itemId);
//		return op1.get();
//	}
}
