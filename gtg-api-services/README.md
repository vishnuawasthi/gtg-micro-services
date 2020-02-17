#Note 
The properties to configure the Config Client must necessarily be read in before the rest of the application’s configuration is read from the Config Server, during the bootstrap phase. Specify the client’s spring.application.name as a-bootiful-client and the location of the Config Server (spring.cloud.config.uri) in configuration-client/src/main/resources/bootstrap.properties, where it will be loaded earlier than any other configuration. The following listing shows that file:

configuration-client/src/main/resources/bootstrap.properties

Examples 

1.Centralized configuration 
	https://spring.io/guides/gs/centralized-configuration/