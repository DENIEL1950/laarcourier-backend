package com.laarcourier.laarcourier.Repository;

import com.laarcourier.laarcourier.Entity.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaqueteRepository extends JpaRepository<Paquete, Integer> {


}
