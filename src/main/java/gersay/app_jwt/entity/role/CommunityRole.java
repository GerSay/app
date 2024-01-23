package gersay.app_jwt.entity.role;

import gersay.app_jwt.entity.User;
import gersay.app_jwt.entity.role.community.Community;
import gersay.app_jwt.entity.role.roletype.CommunityRoleType;
import jakarta.persistence.*;

@Entity
@Table(name = "community_role")
public class CommunityRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "community_id")
    private Community community;

    @Enumerated(EnumType.STRING)
    private CommunityRoleType type;
}
