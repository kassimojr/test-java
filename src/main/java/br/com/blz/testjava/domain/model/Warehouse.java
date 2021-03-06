package br.com.blz.testjava.domain.model;

import java.io.Serializable;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Warehouse implements Serializable {

	private static final long serialVersionUID = 1265441929555769032L;
	
	@JsonIgnore
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String locality;
    private Integer quantity;
    private String type;

    public Integer getQuantity() {		
    	return Optional.ofNullable(quantity).orElse(0);
    }
}
