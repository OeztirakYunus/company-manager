package at.htl.workloads.service;


import javax.persistence.*;

@Entity
public class Service {
    @EmbeddedId
    private ServiceId id;
    private String serviceName;
    private String description;
    private Double price;

    public ServiceId getId() {
        return id;
    }

    public void setId(ServiceId id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
