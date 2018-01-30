package com.foobar.bar.repo;

import org.springframework.data.repository.CrudRepository;

import com.foobar.bar.domain.Bar;

public interface BarRepository extends CrudRepository<Bar, Long> {
	
	Bar findById(Long id);

}
