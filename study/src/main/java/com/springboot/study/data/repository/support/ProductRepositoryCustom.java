package com.springboot.study.data.repository.support;

import com.springboot.study.data.entity.Product;

import java.util.List;

public interface ProductRepositoryCustom {

    List<Product> findByName(String name);
}
