package rw.ac.auca.PhotoStudioManagmentSystemSpring.client.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.auca.PhotoStudioManagmentSystemSpring.client.domain.Client;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {


}