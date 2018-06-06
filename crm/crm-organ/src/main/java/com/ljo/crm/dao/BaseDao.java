package com.ljo.crm.dao;

import java.io.Serializable;
import java.util.List;

/**
 * creator : jb.liang
 * time : 13:43
 */
public interface BaseDao<T,PK extends Serializable>{

    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}
