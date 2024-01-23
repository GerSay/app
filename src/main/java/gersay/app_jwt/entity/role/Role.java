package gersay.app_jwt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;


@Data
@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    
    @Override
    public String getAuthority() {
        return null;
    }
}
