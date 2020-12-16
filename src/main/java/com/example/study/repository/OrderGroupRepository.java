package com.example.study.repository;


import com.example.study.Model.entity.OrderGruop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderGroupRepository extends JpaRepository<OrderGruop,Long> {
}