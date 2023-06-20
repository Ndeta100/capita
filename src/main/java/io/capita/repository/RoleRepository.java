package io.capita.repository;


import io.capita.domain.Role;

import java.util.Collection;

public interface RoleRepository<T extends Role> {
    //Basic CRUD operations
    T create(T data);
    T get(Long id);
    T update(T  data);
    Boolean delete(Long id);
    Collection<T> list(int page , int pageSize);
    //More complex Operations
    void addRoleTOUser(Long userId, String roleName);
}
