package br.com.blz.testjava.domain.exception;

import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends BusinessException {

	private static final long serialVersionUID = 8096495668912406179L;

	public ProductNotFoundException() {
        super("products-3", HttpStatus.NOT_FOUND);
    }

}
