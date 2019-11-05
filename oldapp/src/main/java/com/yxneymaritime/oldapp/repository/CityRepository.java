package com.yxneymaritime.oldapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yxneymaritime.oldapp.model.City;


@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	

}
