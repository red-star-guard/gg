package c.j.service.ipml;

import c.j.dao.ItemsDao;
import c.j.domain.Items;
import c.j.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemsDaoImpl implements ItemsService{
    @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
