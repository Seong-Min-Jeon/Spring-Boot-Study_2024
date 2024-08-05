package com.seongmin.shop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface HwRepository extends JpaRepository<Hw, Integer> {

    @Modifying
    @Transactional
    @Query(value = "insert into Hw(title, writtenDate) values (:#{#paramDetail.title}, :#{#paramDetail.writtenDate})")
    int insertData(@Param("paramDetail") Hw hw);

}