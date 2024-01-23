package gersay.app_jwt.entity.role.roletype;

import gersay.app_jwt.entity.role.Role;

import java.util.HashSet;
import java.util.Set;

public enum UserRoleType implements Role {
    VIEWER, EDITOR, REPORTER;

    private final Set<Role> child = new HashSet<>();

    static {
        REPORTER.child.add(VIEWER);
        EDITOR.child.add(VIEWER);
    }

    @Override
    public boolean includes(Role role) {
        return this.equals(role) || child.stream().anyMatch(r -> r.includes(role));
    }
}
