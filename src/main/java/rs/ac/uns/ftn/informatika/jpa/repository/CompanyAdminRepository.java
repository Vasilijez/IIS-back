package rs.ac.uns.ftn.informatika.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.uns.ftn.informatika.jpa.model.CompanyAdmin;

@Repository
public interface CompanyAdminRepository extends JpaRepository<CompanyAdmin, Integer> {
    CompanyAdmin findByFirstNameAndLastName(String firstName, String lastName);
}
