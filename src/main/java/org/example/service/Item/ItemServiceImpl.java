package org.example.service.Item;

import org.example.base.service.BaseServiceImpl;
import org.example.model.Item;
import org.example.repository.item.ItemRepository;
import org.hibernate.SessionFactory;

public class ItemServiceImpl extends BaseServiceImpl<Item,Long, ItemRepository> implements ItemService {
    public ItemServiceImpl(ItemRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
