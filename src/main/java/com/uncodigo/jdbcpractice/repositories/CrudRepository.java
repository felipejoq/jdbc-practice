package com.uncodigo.jdbcpractice.repositories;

public interface CrudRepository<T> {
    void save(T entity);
    void delete(Long id);
    T findById(Long id);
    Iterable<T> findAll();
}
