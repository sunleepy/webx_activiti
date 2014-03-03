package com.alibaba.webx.activiti.app1.resource;

import java.io.InputStream;

import org.restlet.data.MediaType;
import org.restlet.representation.InputRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class EditorRestResource extends ServerResource {

	@Get
	public InputRepresentation getEditorPage() {
		InputStream editorStream = this.getClass().getClassLoader()
				.getResourceAsStream("editor.html");
		InputRepresentation editorResultRepresentation = new InputRepresentation(
				editorStream);
		editorResultRepresentation.setMediaType(MediaType.APPLICATION_XHTML);
		return editorResultRepresentation;
	}
}
