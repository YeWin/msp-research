# 1. Disable database initialize process, and insert a new User
$ java -Dspring.datasource.initialize=false -jar target/SpringBootSpringSecurityMybatisThymeleafCRUD-0.0.1-SNAPSHOT.jar

#The MBG Maven plugin includes one goal:

mybatis-generator:generate
#The goal is not automatically executed by Maven. It can be executed in two ways.

#The goal can be executed from the command line with the command:

mvn mybatis-generator:generate
#You can pass parameters to the goal with standard Maven command line properties. For example:

mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
#This will run MBG and instruct it to overwrite any existing Java files it may find.


mvn useful command
-clean
-compile
-install
-test-compile
-compile