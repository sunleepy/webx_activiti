package com.alibaba.webx.activiti.app1.resource;

import org.restlet.data.Form;
import org.restlet.data.Status;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pengsong
 */
public class ModelSaveRestResource extends ServerResource {

    protected static final Logger LOGGER = LoggerFactory.getLogger(ModelSaveRestResource.class);

    @Put
    public void saveModel(Form modelForm) {
        
        try {
            
            @SuppressWarnings("unused")
			String json = modelForm.getFirstValue("json_xml");
            
        } catch (Exception e) {
            
            LOGGER.error("Error saving model", e);
            setStatus(Status.SERVER_ERROR_INTERNAL);
        }
    }
}
