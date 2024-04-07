package idc.orm.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "login_tbl", uniqueConstraints = {
        @UniqueConstraint(name = "uc_login_user_name",
                columnNames = {"user_name"})
})
public class Login {

    @Id
    @Column(name = "login_id")
    private Long id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "pass_word")
    private String password;

    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "login_id")
    private UserProfile userProfile;

//    public void setId(UserProfile userProfile) {
//        this.userProfile = userProfile;
//        this.id = userProfile.getId();
//    }
}
