package com.integrant.aptar.pharma.model;

import java.io.Serializable;

/**
 * The Class AptarResponse.
 */
public class AptarResponse implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The code. */
	private Integer code;
	
	/** The description. */
	private String description;
	
	/**
	 * Instantiates a new aptar response.
	 *
	 * @param code the code
	 * @param description the description
	 */
	public AptarResponse(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
}
