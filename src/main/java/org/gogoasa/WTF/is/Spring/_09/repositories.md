# 0x09: Repositories & communicating with the database

Very well, we've gotten to the layer of the application which is tied closest with the database: the repository.

Repositories are the classes that handle the communication with the database. They're the ones that perform 
the CRUD operations on the database, and they're the ones that handle the data access, but I'm sure you
already had some idea about this.

In Spring, the repositories are created by extending the `JpaRepository` interface, which is part of the Spring 
Data JPA library. This interface provides a lot of methods for working with the database, such as `save`, 
`delete`, `findById`, `findAll`, and many others. It also provides the ability to create custom queries, which 
can be done by using the `@Query` annotation.

If you hop on over to the `example` package in this directory, you can find an `ExampleRepository` class. This
class is an example of what a repository looks like in Spring. It extends the `JpaRepository` interface and
provides some custom queries, which are annotated with the `@Query` annotation, as well as an example of a 
method that is done using the building blocks that JPA offers for creating queries without actually specifying
any implementation.

Again, this is pretty straightforward and the only prerequisite for creating a repository is to have a data class
that represents the table in the database. This is done by using the `@Entity` annotation on the class, and the
`@Id` annotation on the field that represents the primary key of the table.
