#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.concurrent.CompletableFuture;

import ${package}.Person;
import ${package}.intrf.async.${serviceName};

/**
 * a simple service implementation 
 */
public class ${serviceName}Imp implements ${serviceName} {
	@Override
	public CompletableFuture<Void> createPerson(Person person) {
		return CompletableFuture.completedFuture(null);
	}

	@Override
	public CompletableFuture<Person> getPerson(Integer personId) {
		return CompletableFuture.completedFuture(new Person().withPersonId(
				personId).withPersonName("sasha"));
	}	
}
