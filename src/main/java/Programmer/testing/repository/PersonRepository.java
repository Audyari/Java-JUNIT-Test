package Programmer.testing.repository;

import Programmer.testing.Data.Person;

public interface PersonRepository {

    Person selectById(String id);

    void insert(Person person);

}