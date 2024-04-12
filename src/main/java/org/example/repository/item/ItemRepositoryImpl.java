package org.example.repository.item;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.model.Item;
import org.example.repository.item.ItemRepository;
import org.hibernate.SessionFactory;

public class ItemRepositoryImpl extends BaseRepositoryImpl<Item,Long> implements ItemRepository {
    public ItemRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Item> getEntityClass() {
        return Item.class;
    }
}
