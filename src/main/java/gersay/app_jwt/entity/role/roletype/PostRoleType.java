package gersay.app_jwt.entity.role.roletype;

import gersay.app_jwt.entity.role.Role;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum PostRoleType implements Role {
    ADMIN, MODERATOR;

    private final Set<Role> child = new HashSet<>();

    static {
        ADMIN.child.add(MODERATOR);
        MODERATOR.child.addAll(List.of(CommunityRoleType.EDITOR, CommunityRoleType.REPORTER));
    }

    @Override
    public boolean includes(Role role) {
        return this.equals(role) || child.stream().anyMatch(r -> r.includes(role));
    }
}
