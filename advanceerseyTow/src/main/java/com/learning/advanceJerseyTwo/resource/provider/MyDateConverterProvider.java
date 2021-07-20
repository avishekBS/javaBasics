package com.learning.advanceJerseyTwo.resource.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;
import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import com.learning.advanceJerseyTwo.model.MyDate;

@Provider
public class MyDateConverterProvider implements ParamConverterProvider{

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		if (rawType.getName().equals(MyDate.class.getName())) {
			return new ParamConverter<T>() {

				@Override
				public T fromString(String value) {
					Calendar calDate = Calendar.getInstance();
					if (value.equals("tommorow")) {
						calDate.add(Calendar.DATE, 1);
					}
					else if (value.equals("yesterday")) {
						calDate.add(Calendar.DATE, -1);
					}
					MyDate mydate = new MyDate(calDate.get(Calendar.DATE), calDate.get(Calendar.MONTH), calDate.get(Calendar.DATE));
					return rawType.cast(mydate);
				}

				@Override
				public String toString(T value) {
					if (value == null) {
						return null;
					}
					return value.toString();
				}
				
			};
		}
		return null;
	}

}
