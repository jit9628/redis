package com.cache.redis.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Invoice implements Serializable {

  
    /**
	 * 
	 */
	private static final long serialVersionUID = -8450381741842170620L;
	@jakarta.persistence.Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer invId;
    private String invName;
    private Double invAmount;
}