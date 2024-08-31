package Programmer.testing.ProblemSolving.DUAPULUHSATU;

public interface PersonRepository {

    Person selectById(String id);

    void insert(Person person);
}
