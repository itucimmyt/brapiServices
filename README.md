# Hermes (BrAPI Services)
This project aims to provide a flexible environment for publishing RESTful services following BrAPI specification. Currently it supports B4R database.

## Requirements
* The project requires JDK and JRE 8.
* Available port for deploying (preset is 9080). If the preset port is not available in the host machine, can be changed in application's configuration.
* A B4R DB instance with all schemas

## Build
You can compile and build the project by using Gradle. The project creates both an executable _jar_ file and a clean _jar_ only with the application classes.

### Considerations
* Build pipelines for Maven and Gradle have subtle differences which must be considered when changing provided configuration. Please refer to their documentation for further information.
* Due to Gradle incremental builds it is recommended to add the task/goal 'clean' to avoid some caching when renaming packages/classes and force a full compilation cycle. Do this specially when building a release package.

```
$ gradle bootRepackage
```
This will create the file _hermes-{version}.jar_ under {projectBaseDir}/build/libs/

To explicitly run tests before packaging add the task 'test'
```
$ gradle test bootRepackage
```

## Run
Simply run it as a regular java executable:
```
$ java -jar hermes-{version}.jar
```
You can specify a server port other than 9080 as:
```
$ java -jar hermes-{version}.jar --server.port=8080
```
Running the application as a _war_ file inside a web application server is supported but not fully tested yet.

## Development run
To run the application directly from code:

```
$ gradle bootRun
```
Press **CTRL+C** to stop execution. When stopping this way, the running Gradle daemon is also stopped (it is a known issue of Gradle). In practice, this has no practical nor visible effects apart from taking a couple of seconds more in the next immediate build.  

## Testing
Example tests provide some minimal coverage. Full coverage must be implemented, possibly by a QA team. The main function of the tests is to provice guidance in test building.

Run task 'test', and optionally 'jacocoTestReport' to generate a code coverage report:
```
$ gradle test jacocoTestReport
```
### Considerations
* Gradle provides a testing report in html.
* Integration tests require a B4R database with very specific CIMMYT's data loaded in it. Consider disabling/customizing these tests if you don't have a copy of this DB for testing.
* Report of test execution is in {projectBaseDir}/build/reports/tests/index.html
* Report of code coverage is in {projectBaseDir}/build/reports/jacoco/test/html/index.html

##Debug
Debug is supported for main code as well as test code. The easiest way to debug is configuring eclipse for debugging a remote application. 
  - a) Go to: Run > Debug Configurations > Remote Java Application
  - b) Add a new Configuration
  - c) Select the project
  - d) Set the port to 5005. (Change the host name if your application runs in a different host)
  - e) Add breakpoints as needed
  - f) save the configuration (do not run it yet)
After configuring eclipse, run from the command line with the proper argument:

```
$ gradle bootRun -Ddebug=true
$ gradle test -Ddebug=true
```

gradle daemon will wait for a listener on specified port. Go to Eclipse and launch the debug configuration. The project will start up and Eclipse will be able to communicate properly.

### Considerations
* Debugging with a IDE is most of the time the easiest way. Current documentation focuses on Eclipse and Eclipse-based IDEs.
