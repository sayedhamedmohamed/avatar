package com.integrant.aptar.pharma.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.integrant.aptar.pharma.constants.AppConstants;

@JsonInclude(Include.NON_NULL)
public class BagDTO {

	/** The content. */
	@NotEmpty(message = AppConstants.INVALID_CONTENT)
	@NotNull(message = AppConstants.INVALID_CONTENT)
	private String content;

	/** The type. */
	@NotEmpty(message = AppConstants.INVALID_TYPE)
	@NotNull(message = AppConstants.INVALID_TYPE)
	private String type;

	public String getContent() {
		return content;
	}

	public String getType() {
		return type;
	}
}
