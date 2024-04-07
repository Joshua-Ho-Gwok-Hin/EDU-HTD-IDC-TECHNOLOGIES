package idc.orm.ControlSvcRepo;

import idc.orm.OneToMany.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepository
        extends JpaRepository<Qualification, Long> {
}