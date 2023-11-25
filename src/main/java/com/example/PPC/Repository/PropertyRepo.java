package com.example.PPC.Repository;

import com.example.PPC.Model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Long> {
}
