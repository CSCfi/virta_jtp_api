#VIRTA Julkaisurajapinta

##Prerequisites

###Setup the environment
 
**Building:** Java JDK 1.8, Maven 3
**Database:** MS SQL Server 2011 with proper schema
**Running:** JDK 8, currently embeds Tomcat 8.

###Configure DB access

Fill up the proper database access configuration to `src/main/webapp/META-INF/context.html`

###Build data-model project

See `./data-model/README.md`

##Running the application

    $ mvn clean package
 
    $ sh target/bin/julkaisu-api
    
    
##Note about Native APR usage

Native APR library is enabled if embedded Tomcat finds it. When assembling project you could add it 
as `-Dnative.apr.path`.

    $ mvn clean package -Dnative.apr.path=/usr/local/Cellar/tomcat-native/1.2.2/lib
    
##Make release

Making release updates project version numbers and tags project to scm.

    $ mvn clean release:prepare

##Installing to server

Build project with
    
    $ mvn clean package
    
Copy distribution zip file `target/julkaisu-api-[version]-bin.zip` to server and unzip it.
Folders in zip file:
       
       init - Includes daemon start stop init script.
       bin - Executable for starting application.
       config - Default server configuration file server.properties and default api configuration file api.properties
       repo - Application libraries.
       webapp/api-doc - HTML api documentation
       webapp/META-INF - Context configuration file context.xml
       
Edit `webapp/META-INF/context.xml` for proper database information.

Copy `init/julkaisu-api` script to servers `/etc/init.d/` folder and start service with

    $ service julkaisu-api start
    
##Changing JAVA_OPTS in server

Init script includes `/etc/sysconfig/julkaisu-api` file if found. In this file you can set JAVA_OPTS of java process.
For example:

    JAVA_OPTS="-Xms128m -Xmx256m -Dserver.properties=/home/jutiapp/server.properties -Dapi.properties=/home/jutiapp/api.properties"
       # virta_jtp_api
