package com.alibaba.webx.activiti.app1.resource;

import java.io.InputStream;

import org.restlet.data.MediaType;
import org.restlet.representation.InputRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class PluginRestResource extends ServerResource {
	  
	  @Get
	  public InputRepresentation getPlugins() {
	    InputStream pluginStream = this.getClass().getClassLoader().getResourceAsStream("editor/plugins.xml");
	    InputRepresentation pluginResultRepresentation = new InputRepresentation(pluginStream);
	    pluginResultRepresentation.setMediaType(MediaType.APPLICATION_XML);
	    return pluginResultRepresentation;
	  }
	}
