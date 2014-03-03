package com.alibaba.webx.activiti.app1.resource;

import java.io.InputStream;

import org.restlet.data.MediaType;
import org.restlet.representation.InputRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class StencilsetRestResource extends ServerResource {
	  
	  @Get
	  public InputRepresentation getStencilset() {
	    InputStream stencilsetStream = this.getClass().getClassLoader().getResourceAsStream("editor/stencilset.json");
	    InputRepresentation stencilsetResultRepresentation = new InputRepresentation(stencilsetStream);
	    stencilsetResultRepresentation.setMediaType(MediaType.APPLICATION_JSON);
	    return stencilsetResultRepresentation;
	  }
	}
