package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.input.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
    String getName();
    boolean getActive();
    Integer getPhoneNumber();
}
