package com.vibe.desafiovibe.dto;

import java.io.Serializable;

public class LinkDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String rel;
	
	private String href;

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

}
