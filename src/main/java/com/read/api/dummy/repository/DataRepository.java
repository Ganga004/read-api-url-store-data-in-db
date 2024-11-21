package com.read.api.dummy.repository;

import com.read.api.dummy.entity.DataFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<DataFields, Integer> {

}
