package idc.orm.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableGenerator(name="table_for_initial_val", initialValue=100000)
@Table(name = "user_profile_tbl")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "table_for_initial_val")
    @Column(name = "user_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(mappedBy = "userProfile", cascade = CascadeType.ALL)
    // Remove above ORM for unidirectional (1 way relation)
    private Login login;
}
