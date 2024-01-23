package gersay.app_jwt.entity.role;

import gersay.app_jwt.entity.User;
import gersay.app_jwt.entity.role.post.Post;
import gersay.app_jwt.entity.role.roletype.PostRoleType;
import jakarta.persistence.*;

@Entity
@Table(name = "post_role")
public class PostRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @Enumerated(EnumType.STRING)
    private PostRoleType type;
}