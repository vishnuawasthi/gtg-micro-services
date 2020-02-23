#### Rest Services     #######

1. Conversion api 
	http://localhost:8083//exchange-rate/USD/to/INR
	

2. I am running two instance of exchange service at below 
	set vm Argument 
	-Dserver.port=8085

	http://localhost:8085//exchange-rate/USD/to/INR
	
	http://localhost:8086//exchange-rate/USD/to/INR



#### H2 Database config #######

1. H2 Database console running at 

	http://localhost:8083/h2-console
	
	Remember: The JDBC URL must be the same as you have specified in the 	application.properties file. Do not write anything in the User Name and Password 	field. The default User Name is sa

2. In order to use the H2 console enable it by putting below property file entry

	spring.h2.console.enabled=true	