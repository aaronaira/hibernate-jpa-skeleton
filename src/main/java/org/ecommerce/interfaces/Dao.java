package org.ecommerce.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> get(int id);

    List<T> getAll();

    void save(T t);

    void upadte(T t, String[] params);

    void delete(T t);
}
