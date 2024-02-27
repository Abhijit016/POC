package com.rbi.poc.repository;

import com.rbi.poc.model.Module;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends CouchbaseRepository<Module, Integer> {
}
