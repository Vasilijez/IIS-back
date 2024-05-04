package rs.ac.uns.ftn.informatika.jpa.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SystemAdmin  extends User{

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="systemAdmin")
    private List<LoyaltyProgram> loyaltyPrograms;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="systemAdmin")
    private List<Company> companies;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="systemAdmin")
    private List<CompanyAdmin> companyAdmins;

    public SystemAdmin() {
    }

    public SystemAdmin(List<LoyaltyProgram> loyaltyPrograms) {
        this.loyaltyPrograms = loyaltyPrograms;
    }

    public SystemAdmin(String email, String firstName, String lastName, String password) {
        super(email, firstName, lastName, password, true); // po default-u je nalog system admin-a enabled, jer se ne registruje
    }

    public SystemAdmin(String email, String firstName, String lastName, String password, List<LoyaltyProgram> loyaltyPrograms) {
        super(email, firstName, lastName, password, true); // po default-u je nalog system admin-a enabled, jer se ne registruje
        this.loyaltyPrograms = loyaltyPrograms;
    }

    public SystemAdmin(String email, String firstName, String lastName){
        super(email, firstName, lastName);
        this.loyaltyPrograms = new ArrayList<>();
    }


    public List<LoyaltyProgram> getLoyaltyPrograms() {
        return loyaltyPrograms;
    }

    public void setLoyaltyPrograms(List<LoyaltyProgram> loyaltyPrograms) {
        this.loyaltyPrograms = loyaltyPrograms;
    }
}
