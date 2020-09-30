package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
