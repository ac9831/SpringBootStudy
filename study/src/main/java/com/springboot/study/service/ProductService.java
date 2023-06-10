package com.springboot.study.service;

import com.springboot.study.data.dto.ProductDto;
import com.springboot.study.data.dto.ProductResponseDto;

public interface ProductService {

    ProductResponseDto getProduct(Long number);

    ProductResponseDto saveProduct(ProductDto productDto);

    void deleteProduct(Long number) throws Exception;
}
