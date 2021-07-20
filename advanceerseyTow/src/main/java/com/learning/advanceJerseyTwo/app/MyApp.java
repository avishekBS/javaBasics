package com.learning.advanceJerseyTwo.app;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/webapi")
public class MyApp extends Application{
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> classes = new HashSet<Class<?>>();
		if (!classes.isEmpty()) {
			for (Class<?> class1 : classes) {
				System.out.println(class1);
			}
		}
		else {
		}
        return classes;
    }
	
}
