package gersay.app_jwt.entity.role;

import gersay.app_jwt.entity.role.roletype.PostRoleType;

import java.util.Set;


public interface Role {
    boolean includes(Role role);

    static Set<Role> roots() {
        return Set.of(PostRoleType.ADMIN);
    }
}
