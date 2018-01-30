package com.foobar.foo.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "foo")
public class Foo {
  
  @Id
  @GeneratedValue
  @Column(name = "ID")
  private Long id;
  
  @Column(name = "FOO")
  private String foo;
  
  Foo(String foo) {
    this.foo = foo;
  }
  
  public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFoo() {
	return foo;
}

public void setFoo(String foo) {
	this.foo = foo;
}

Foo() {
    // Default constructor needed by JPA
  }
}