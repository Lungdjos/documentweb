package com.lung.documentweb.repos;

import com.lung.documentweb.entities.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document, Integer> {
}
