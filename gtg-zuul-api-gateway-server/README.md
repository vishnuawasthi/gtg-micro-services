# Zuul api points only when you have request with below format 

 	http://localhost:8765/{application-name}/{uri}
 	
 	The port 8765 is the default port for the Zuul API Gateway server.
 	
 	
# Zuul reqeuet 

		http://localhost:8765/gtg-currency-conversion-service/convert?from=USD&to=INR&amount=40 	
		
# When we call Exchange api through zuul. We get below logs 
2020-02-21 16:14:35.474  INFO 9668 --- [nio-8765-exec-4] com.app.filter.ZuulLoggingFilter         : request -> org.springframework.cloud.netflix.zuul.filters.pre.Servlet30RequestWrapper@1cde4 request  uri-> /gtg-currency-conversion-service/convert

# uri-> /gtg-currency-conversion-service/convert
2020-02-21 16:14:35.487  INFO 9668 --- [nio-8765-exec-5] com.app.filter.ZuulLoggingFilter         : request -> org.springframework.cloud.netflix.zuul.filters.pre.Servlet30RequestWrapper@c1881e request uri-> /gtg-currency-exchange-service/exchange-rate/USD/to/INR
# request uri-> /gtg-currency-exchange-service/exchange-rate/USD/to/INR
2020-02-21 16:15:55.839  INFO 9668 --- [trap-executor-0] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
		