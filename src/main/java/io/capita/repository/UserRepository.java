package io.capita.repository;

import io.capita.domain.User;

import java.util.Collection;

public interface UserRepository <T extends User>{
    //Basic CRUD operations
    T create(T data);
    T get(Long id);
    T update(T  data);
    Boolean delete(Long id);
    Collection<T> list(int page , int pageSize);
    //More complex Operations
}
