package com.crud.basic;

import java.util.List;

public interface Service1 {

	List<entity> view();

	entity add(entity e);

	entity edit(entity e);

	void delete(int id);

}
