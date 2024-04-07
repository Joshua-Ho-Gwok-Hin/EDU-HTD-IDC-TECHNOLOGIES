package idc.orm.ControlSvcRepo;

import idc.orm.OneToOne.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
}

