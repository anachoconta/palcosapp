package com.usa.palcosapp.repository.crudrepository;

import com.usa.palcosapp.model.Client;
import com.usa.palcosapp.repository.CategoryRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
