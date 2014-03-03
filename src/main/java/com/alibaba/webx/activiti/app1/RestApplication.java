package com.alibaba.webx.activiti.app1;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.alibaba.webx.activiti.app1.resource.JsonpFilter;
import com.alibaba.webx.activiti.app1.resource.ModelerServicesInit;

public class RestApplication extends Application {
	public RestApplication() {
		super();
	}
  
	@Override
	public synchronized Restlet createInboundRoot() {
	    Router router = new Router(getContext());
	    ModelerServicesInit.attachResources(router);
	    JsonpFilter jsonpFilter = new JsonpFilter(getContext());
	    jsonpFilter.setNext(router);
	    return jsonpFilter;
	}
}
