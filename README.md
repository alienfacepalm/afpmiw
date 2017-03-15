I have never used Spring before, and I have not written any Java in years. 

I ran out of time to finish it, I have been very busy with other interviews, who also have audition type challenges, but in JavaScript frameworks which I know inside and out. 

I only got as far as creating 2 end points. 

For the product list I have it generating a json output using Jackson from a Java Object class called Product. 
I tried to use a Jackson annotation to have the root element say "products" but it just isn't working, I need more time to figure out why. 

As far as the authentication, surge pricing, and tests I simply ran out of time, there is nothing here for those. I would need to research Spring authentication and how to implement, and I ran out of time.



To run it, just run the jar in the target directory. 

java -jar afp-0.0.1-SNAPSHOT.jar

Navigate to localhost:8080

http://localhost:8080/products //json feed, as stated @JsonRootName(value="products") isn't working, not sure why, so the root is "Product[]" which is wrong
http://localhost:8080/buy?sku=003 //This would likely be a POST method not a GET as this uses here
