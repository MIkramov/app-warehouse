package uz.pdp.warehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.warehouse.entity.User;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    Integer getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();
}
