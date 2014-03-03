package com.alibaba.webx.activiti.app1.resource;

import java.io.InputStream;

import org.restlet.representation.InputRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class DefaultResource extends ServerResource {

    @Get
    public InputRepresentation execute() {
        InputStream resource = this.getClass().getResourceAsStream("test.html");
        InputRepresentation output = new InputRepresentation(resource);
        return output;
    }

}
