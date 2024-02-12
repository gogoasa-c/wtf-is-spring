package org.gogoasa.WTF.is.Spring._09.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This is the JpaRepository for the Example class.
 * It typically extends JpaRepository<Type, IDType> and is annotated with @Repository.
 */
@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {
    /**
     * This does not really require any methods to be defined, it already has all the CRUD methods
     * inherited from its parent interface, JpaRepository.
     * However, you can add as many custom methods as you want, and JPA takes care of the implementation.
     * Or, if you'd rather run a specific query, you can always use @Query.
     */

    /**
     * You can create a custom method by following the naming convention of Spring Data JPA.
     * The IDE will suggest you whatever methods you can create based on the fields of the class.
     */
    public List<Example> findAllByTypeAndId(String type, Long id);

    /**
     * Or you can use @Query to run a custom query.
     */
    @Query("SELECT e FROM Example e WHERE e.id = 1")
    public List<Example> doSomethingCustom();

    /**
     * You can also use native queries.
     */
    @Query(value = "SELECT * FROM example WHERE id = :id", nativeQuery = true)
    public List<Example> doSomethingCustomNative(Long id);
}
