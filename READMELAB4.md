Lab 4 Response:

1. It's important to create separate databases for each microservice because it allows for the services to operate independently of each other. This is important because it allows for them to be decoupled from one another. 

2. We use flyway to do database migrations. It uses SQL files to automatically make migrations. This automation ensures that all instances are up-to-date.

3. Spring Data JPA allows us to write less generic code, saving us time. It also allows us use abstraction within the repositories, using interfaces that can extend JpaRepository.

4. The operation is set to read-only. It calls a function and returns the data without altering it. Setting the operation to read-only reduces the chances of accidental operations performed and should also increase performance when read-only is true.

5. Making sure communication between the services is in the correct state is hard. Our bases have their own database, so we have to keep track of multiple services. There are different dependencies and services we used to make that communication process as simple as possible.

6. The tests run in their own container, free from the old data of previous tests. They also were easy to implement with spring boot test

