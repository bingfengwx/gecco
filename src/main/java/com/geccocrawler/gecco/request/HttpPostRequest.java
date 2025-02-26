package com.geccocrawler.gecco.request;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.entity.ContentType;

public class HttpPostRequest extends AbstractHttpRequest {

	private static final long serialVersionUID = -4451221207994730839L;

	private Map<String, String> fields;
	/** json 请求post 内容 */
	private String payload;
	
	public HttpPostRequest() {
		super();
		fields = new HashMap<String, String>();
	}

	public HttpPostRequest(String url) {
		super(url);
		fields = new HashMap<String, String>();
	}
	
	public Map<String, String> getFields() {
		return fields;
	}

	public void setFields(Map<String, String> fields) {
		this.fields = fields;
	}

	public void addField(String name, String field) {
		fields.put(name, field);
	}
	
	public String getField(String name) {
		return fields.get(name);
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public void withApplicationJson() {
		this.addHeader("Content-type", ContentType.APPLICATION_JSON.toString());
	}
	public static HttpPostRequest fromJson(JSONObject request) {
		return (HttpPostRequest)JSON.toJavaObject(request, HttpPostRequest.class);
	}
}
