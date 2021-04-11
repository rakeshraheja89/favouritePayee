what else i need to add
https://spring.io/guides/gs/spring-boot/

1. documentation
2 java docs
3 swagger
4 log4j
5 junit
6 H2 database
7 actuator

https://www.blazemeter.com/blog/spring-boot-rest-api-unit-testing-with-junit


# Spring Boot Web MVC QuickStart

This example demonstrates how you can use Spring Boot and Spring MVC on Kubernetes or OpenShift to implement a REST service.

### Building

The example can be built with

    mvn clean install

### Running the example in Kubernetes

It is assumed a running Kubernetes platform is already running. If not you can find details how to [get started](http://fabric8.io/guide/getStarted/index.html).

Assuming your current shell is connected to Kubernetes or OpenShift so that you can type a command like

```
kubectl get pods
```

or for OpenShift

```
oc get pods
```

Then the following command will package your app and run it on Kubernetes:

```
mvn fabric8:run
```

To list all the running pods:

    oc get pods

Then find the name of the pod that runs this quickstart, and output the logs from the running pods with:

    oc logs <name of pod>

You can also use the [fabric8 developer console](http://fabric8.io/guide/console.html) to manage the running pods, and view logs and much more.


#### Integration Testing

The example includes a [fabric8 arquillian](https://github.com/fabric8io/fabric8/tree/master/components/fabric8-arquillian) Kubernetes Integration Test. 
Once the container image has been built and deployed in Kubernetes, the integration test can be run with:

	mvn test -Dtest=*KT

The test is disabled by default and has to be enabled using `-Dtest`. [Integration Testing](https://fabric8.io/guide/testing.html) and [Fabric8 Arquillian Extension](https://fabric8.io/guide/arquillian.html) provide more information on writing full fledged black box integration tests for Kubernetes. 

### More details

You can find more details about running this [quickstart](http://fabric8.io/guide/quickstarts/running.html) on the website. This also includes instructions how to change the Docker image user and registry.


### Access services using a web browser

When the application is running, you can use a web browser to access the REST service. Assuming that you
have a [Vagrant setup](http://fabric8.io/guide/getStarted/vagrant.html) you can access the REST service with
`http://spring-boot-webmvc-default.vagrant.f8`.

Notice: As it depends on your OpenShift setup, the hostname (route) might vary. Verify with `oc get routes` which
hostname is valid for you.  Add the '-Dfabric8.deploy.createExternalUrls=true' option to your maven commands if you want it to deploy a Route configuration for the service.

The URL `http://spring-boot-webmvc-default.vagrant.f8/ip` can be used to obtain the IP address to show service load-balancing
when running with multiple pods.


#### Integration Testing

The example includes a [fabric8 arquillian](https://github.com/fabric8io/fabric8/tree/master/components/fabric8-arquillian) Kubernetes Integration Test. 
Once the container image has been built and deployed in Kubernetes, the integration test can be run with:

	mvn test -Dtest=*KT

The test is disabled by default and has to be enabled using `-Dtest`. [Integration Testing](https://fabric8.io/guide/testing.html) and [Fabric8 Arquillian Extension](https://fabric8.io/guide/arquillian.html) provide more information on writing full fledged black box integration tests for Kubernetes. 

### More details

You can find more details about running this [quickstart](http://fabric8.io/guide/quickstarts/running.html) on the website. This also includes instructions how to change the Docker image user and registry.


Version 10.0.18363.1440]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone      Clone a repository into a new directory
   init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
   add        Add file contents to the index
   mv         Move or rename a file, a directory, or a symlink
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect     Use binary search to find the commit that introduced a bug
   grep       Print lines matching a pattern
   log        Show commit logs
   show       Show various types of objects
   status     Show the working tree status

grow, mark and tweak your common history
   branch     List, create, or delete branches
   checkout   Switch branches or restore working tree files
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   merge      Join two or more development histories together
   rebase     Reapply commits on top of another base tip
   tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch      Download objects and refs from another repository
   pull       Fetch from and integrate with another repository or a local branch
   push       Update remote refs along with associated objects

--------------------------------------------------------------------------------------


'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git init
Initialized empty Git repository in C:/Users/sonu/eclipse-workspace/spring-boot-microservice/.git/

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git status
On branch master

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git status
On branch master

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git add
Nothing specified, nothing added.
Maybe you wanted to say 'git add .'?

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git add .

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>touch *
'touch' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git status
On branch master

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   pom.xml


C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git commit -m "This is my first spring boot microservice!"

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git branch
* master

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git remote add origin https://github.com/rakeshraheja89/microservices.git

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>git push -u origin master

C:\Users\sonu\eclipse-workspace\spring-boot-microservice>

