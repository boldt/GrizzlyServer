# Minimum Working Example: Jersey Server

* Maven
* Jersey 1.17.1

### Get it:

```
git clone git@github.com:boldt/GrizzlyServer.git
```

### Build it:

```	
cd jerseyserver
mvn clean package
```

The file `target/GrizzlyServer-0.0.1-SNAPSHOT.jar` will be created.

### Run it:

Run it on port 12345:

```
java -jar target/GrizzlyServer-0.0.1-SNAPSHOT.jar 12345
```	

### Test it:

```
curl -X GET http://localhost:11111/helloworld
```
