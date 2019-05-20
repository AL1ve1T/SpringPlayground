package com.aliveit.infoservice.repositories;

import com.aliveit.infoservice.model.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service, String> {
}
