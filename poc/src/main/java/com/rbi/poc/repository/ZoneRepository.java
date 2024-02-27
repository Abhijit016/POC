package com.rbi.poc.repository;

import com.rbi.poc.model.Zone;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface ZoneRepository extends CouchbaseRepository<Zone, Integer> {
}
