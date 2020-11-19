package Service.Management.Service.Management.repositories;

import Service.Management.Service.Management.entities.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
