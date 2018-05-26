package com.gkaraffa.jerseyrest1.service;

import com.gkaraffa.jerseyrest1.model.Person;
import com.gkaraffa.jerseyrest1.model.Response;

public interface PersonService {

  public Response addPerson(Person p);

  public Response deletePerson(int id);

  public Person getPerson(int id);

  public Person[] getAllPersons();

}
