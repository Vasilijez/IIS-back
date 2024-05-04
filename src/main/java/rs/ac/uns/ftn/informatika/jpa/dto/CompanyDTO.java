package rs.ac.uns.ftn.informatika.jpa.dto;

import rs.ac.uns.ftn.informatika.jpa.model.Company;
import rs.ac.uns.ftn.informatika.jpa.model.CompanyAdmin;
import rs.ac.uns.ftn.informatika.jpa.model.Equipment;
import rs.ac.uns.ftn.informatika.jpa.model.Location;

import java.util.ArrayList;
import java.util.List;

public class CompanyDTO {
    private Integer id;
    private String name;
    private Location location;
    private String description;
    private Double averageScore;
    private List<EquipmentDTO> equipment;

    private List<CompanyAdminDTO> admins;

    private List<ReservationDTO> reservationDTOS;
    public CompanyDTO() {
    }

    public CompanyDTO(Integer id, String name, Location location, Double averageScore, List<EquipmentDTO> equipment) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.averageScore = averageScore;
        this.equipment = equipment;
    }
    public CompanyDTO(Integer id, String name, Location location, Double averageScore, List<EquipmentDTO> equipment, List<CompanyAdminDTO> admins) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.averageScore = averageScore;
        this.equipment = equipment;
        this.admins = admins;
    }

    public CompanyDTO(Integer id, String name, Location location, String description, Double averageScore, List<EquipmentDTO> equipment, List<CompanyAdminDTO> admins, List<ReservationDTO> reservationDTOS) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.averageScore = averageScore;
        this.equipment = equipment;
        this.admins = admins;
        this.reservationDTOS = reservationDTOS;
    }

    public CompanyDTO(Integer id, String name, Location location, String description, Double averageScore, List<EquipmentDTO> equipment, List<CompanyAdminDTO> admins) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.averageScore = averageScore;
        this.equipment = equipment;
        this.admins = admins;
    }

    public  CompanyDTO(Company company){
        this.id = company.getId();
        this.name = company.getName();
        this.location = company.getLocation();
        this.averageScore = company.getAverageScore();
        this.equipment = equipmentToDTO(company.getEquipment());
        this.admins =companyAdminsToDTO(company.getCompanyAdmins());
        this.description = company.getDescription();
    }
    public List<EquipmentDTO> equipmentToDTO(List<Equipment> equipment){
        List<EquipmentDTO> equipmentDTOS = new ArrayList<>();
        for (Equipment e: equipment) {

            EquipmentDTO equipmentDTO = new EquipmentDTO(e);

            equipmentDTOS.add(equipmentDTO);
        }
        return equipmentDTOS;
    }
    public List<CompanyAdminDTO> companyAdminsToDTO(List<CompanyAdmin> admins){
        List<CompanyAdminDTO> adminDTOS = new ArrayList<>();
        for (CompanyAdmin ca: admins) {

            CompanyAdminDTO adminDTO = new CompanyAdminDTO(ca);

            adminDTOS.add(adminDTO);
        }
        return adminDTOS;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public List<EquipmentDTO> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<EquipmentDTO> equipment) {
        this.equipment = equipment;
    }

    public List<CompanyAdminDTO> getAdmins() {
        return admins;
    }

    public void setAdmins(List<CompanyAdminDTO> admins) {
        this.admins = admins;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ReservationDTO> getReservationDTOS() {
        return reservationDTOS;
    }

    public void setReservationDTOS(List<ReservationDTO> reservationDTOS) {
        this.reservationDTOS = reservationDTOS;
    }
}
