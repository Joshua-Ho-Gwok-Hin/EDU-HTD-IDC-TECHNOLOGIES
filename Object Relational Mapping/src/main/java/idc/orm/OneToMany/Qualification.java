package idc.orm.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "qualification_tbl")
public class Qualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certId", nullable = false)
    private Long id;

    @Column(name = "school")
    private String school;

    @Column(name = "attainment")
    private String attainment;
}