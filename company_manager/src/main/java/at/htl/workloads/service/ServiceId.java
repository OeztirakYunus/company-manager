package at.htl.workloads.service;

import at.htl.workloads.order.Order;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ServiceId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "id")
    private Order order;
    private Short serviceId;

    public ServiceId(){}

    public ServiceId(Order order, Short serviceId) {
        this.order = order;
        this.serviceId = serviceId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Short getServiceId() {
        return serviceId;
    }

    public void setServiceId(Short serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceId serviceId1 = (ServiceId) o;
        return Objects.equals(order.getId(), serviceId1.order.getId()) &&
                Objects.equals(serviceId, serviceId1.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order.getId(), serviceId);
    }
}
