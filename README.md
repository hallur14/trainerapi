# trainerapi

## Instructions:

- Open in your favorite Java IDE, e.g. IntelliJ Idea or Eclipse.
- Run TrainerApiApplication.
- Your terminal should show you the port that the service is running on, e.g. http://localhost:8080
- The local repository is prepopulated with a few trainers.
- To see a list of all the trainers use Postman and send a GET request to http://localhost:8080/trainers your browser will also work for this.
- To see a single trainer use URL: http://localhost:8080/trainers/id where ID is an intiger e.g. 1.
- To add a new trainer use Postman and send a POST request to http://localhost:8080/trainers using a json body like the one below.

```
{
    "email": "trainer@campgladiator.com",
    "phone": "5128881234",
    "firstName": "Fearless",
    "lastName": "Contender"
}
```
