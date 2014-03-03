/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.webx.activiti.app1.resource;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.restlet.data.Status;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Tijs Rademakers
 */
public class ModelEditorJsonRestResource extends ServerResource {

    protected static final Logger LOGGER       = LoggerFactory
                                                       .getLogger(ModelEditorJsonRestResource.class);
    private ObjectMapper          objectMapper = new ObjectMapper();

    @Get
    public ObjectNode getEditorJson() {
        ObjectNode modelNode = null;
        //String modelId = (String) getRequest().getAttributes().get("modelId");
        try {

            modelNode = objectMapper.createObjectNode();
            ObjectNode editorJsonNode = objectMapper.createObjectNode();
            editorJsonNode.put("id", "canvas");
            editorJsonNode.put("resourceId", "canvas");

            ObjectNode mock = objectMapper.createObjectNode();
            mock.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
            editorJsonNode.put("stencilset", mock);
            modelNode.put("model", editorJsonNode);

        } catch (Exception e) {
            LOGGER.error("Error creating model JSON", e);
            setStatus(Status.SERVER_ERROR_INTERNAL);
        }
        // }
        return modelNode;
    }

}
