package com.integrant.aptar.pharma.model;

import java.io.Serializable;

/**
 * The Class Bag.
 */
public class Bag implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private String id;
	
	/** The content. */
	private String content;
	
	/** The type. */
	private String type;
	
	/**
	 * Instantiates a new bag.
	 *
	 * @param id the id
	 * @param content the content
	 * @param type the type
	 */
	public Bag(String id, String content, String type) {
		this.id = id;
		this.content = content;
		this.type = type;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
}
