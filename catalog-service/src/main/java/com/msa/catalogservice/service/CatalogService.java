package com.msa.catalogservice.service;

import com.msa.catalogservice.jpa.CatalogEntity;
import com.msa.catalogservice.jpa.CatalogRepository;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}

