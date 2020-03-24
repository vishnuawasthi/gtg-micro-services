# URL 

http://localhost:8090/members

http://localhost:8090/members

Reference : https://howtodoinjava.com/spring-cloud/spring-cloud-config-server-git/
 
#  http://localhost:8090/actuator/refresh
We set management.endpoints.web.exposure.include=* in the client application to make this is easy to test (since Spring Boot 2.0, the Actuator endpoints are not exposed by default). By default, you can still access them over JMX if you do not set the flag.

Than use 
GET http://localhost:8090/members
You will get the updated values

# Spring Cloud Bus 
	http://localhost:8091/actuator/bus-refresh


# RabbitMQ Admin Dashboard

	http://localhost:15672/#/
	
#Fallback 
http://localhost:8091/members/100	