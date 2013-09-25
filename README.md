# MWE: Grizzly Server

### Dependencies:

* [Maven] (http://maven.apache.org/)
* [Grizzly] (http://grizzly.java.net/)
* [Jersey] (http://jersey.java.net/)

### Get it:

```
git clone git@github.com:boldt/GrizzlyServer.git
```

### Build it:

```	
cd GrizzlyServer/
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
curl -X GET http://localhost:12345/helloworld
```
