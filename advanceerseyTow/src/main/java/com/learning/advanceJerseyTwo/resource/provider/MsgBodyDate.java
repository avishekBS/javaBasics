package com.learning.advanceJerseyTwo.resource.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
public class MsgBodyDate implements MessageBodyWriter<Date>, MessageBodyReader<Date>{

	/*
	 * If isWriteable() is true then call writeTo()....
	 * 
	 */
	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		System.out.println("MessageBodyWriter: is Writable:");
		if (type.getName().equals(Date.class.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public long getSize(Date t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		System.out.println("Size.....");
		return 1;
	}

	@Override
	public void writeTo(Date t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		System.out.println("MessageBodyWriter: is Writable: true");
		entityStream.write(t.toString().getBytes());
		
	}

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		System.out.println("MessageBodyReader: is Readable:");
		if (type.getName().equals(Date.class.getName())) {
			return true;
		}
		return false;
	}

	@Override
	public Date readFrom(Class<Date> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
			throws IOException, WebApplicationException {
		System.out.println("MessageBodyReader: is Readable: true");
		Date date = null;
		try {
			date = type.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

}
