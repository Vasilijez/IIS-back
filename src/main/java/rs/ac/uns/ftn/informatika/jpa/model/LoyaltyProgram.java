package rs.ac.uns.ftn.informatika.jpa.model;

import rs.ac.uns.ftn.informatika.jpa.enumeration.LoyaltyType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="loyalty_program")
public class LoyaltyProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LoyaltyType type;

    // u mappedby ide naziv polja, a ne naziv tabele
    @OneToMany(mappedBy="loyaltyProgram", fetch = FetchType.EAGER)
    private Set<RegisteredUser> registeredUsers;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private SystemAdmin systemAdmin;

    @Column
    private int minPoints;
    @Column
    private int maxPoints;

    public LoyaltyProgram(SystemAdmin systemAdmin) {
        super();
        this.systemAdmin = systemAdmin;
    }

    public LoyaltyProgram(Integer id, LoyaltyType type, SystemAdmin systemAdmin, int minPoints, int maxPoints) {
        super();
        this.id = id;
        this.type = type;
        this.systemAdmin = systemAdmin;
        this.minPoints = minPoints;
        this.maxPoints = maxPoints;
    }

    public LoyaltyProgram() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LoyaltyType getType() {
        return type;
    }

    public void setType(LoyaltyType type) {
        this.type = type;
    }

    public int getMinPoints() {
        return minPoints;
    }

    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

}
