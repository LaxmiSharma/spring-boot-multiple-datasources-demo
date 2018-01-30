package com.foobar.foo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foobar.foo.domain.Foo;

@Repository
public interface FooRepository extends CrudRepository<Foo, Long> {
	Foo findById(Long id); 
}
