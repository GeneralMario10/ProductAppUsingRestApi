package com.springbootrestapi.restapi.repository;
import com.springbootrestapi.restapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    

}
