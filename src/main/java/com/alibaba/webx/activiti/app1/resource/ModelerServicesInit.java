package com.alibaba.webx.activiti.app1.resource;

import org.restlet.routing.Router;

public class ModelerServicesInit {
	public static void attachResources(Router router) {
	    //router.attach("/editor", EditorRestResource.class);
	    router.attach("/editor/plugins", PluginRestResource.class);
	    router.attach("/editor/stencilset", StencilsetRestResource.class);
	    
	   router.attach("/model/{modelId}/json", ModelEditorJsonRestResource.class);
	   router.attach("/model/{modelId}/save",ModelSaveRestResource.class);
	  }
}
