package com.integrant.aptar.pharma.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The Class Bag.
 */
@Document(collection = "bags")
public class Bag implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Indexed
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
	public Bag(String content, String type) {
		this.id = UUID.randomUUID().toString();
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
