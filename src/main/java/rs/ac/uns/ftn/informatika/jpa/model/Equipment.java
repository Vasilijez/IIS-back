package rs.ac.uns.ftn.informatika.jpa.model;

import rs.ac.uns.ftn.informatika.jpa.dto.EquipmentBasicDTO;
import rs.ac.uns.ftn.informatika.jpa.enumeration.EquipmentType;

import javax.persistence.*;

@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToOne
    private Company company;
    @Column
    private String description;
    @Column
    private EquipmentType type;
    @Column
    private Double price;
    @Column
    private Integer quantity;

    public Equipment() {
    }

    public Equipment(Integer id, String name, Company company, String description, EquipmentType type, Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.description = description;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }
    public Equipment(EquipmentBasicDTO dto, Company company) {
        this.name = dto.getName();
        this.company = company;
        this.description = dto.getDescription();
        this.type = EquipmentType.valueOf(dto.getEquipmentType().replaceAll("\\s", "")); //removing spaces from input JSON
        this.price = dto.getPrice();
        this.quantity = dto.getQuantity();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EquipmentType getType() {
        return type;
    }

    public void setType(EquipmentType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void updateProperties(EquipmentBasicDTO dto) {
        this.name = dto.getName();
        this.description = dto.getDescription();
        this.type = EquipmentType.valueOf(dto.getEquipmentType().replaceAll("\\s", "")); //removing spaces from input JSON
        this.price = dto.getPrice();
        this.quantity = dto.getQuantity();
    }
}
