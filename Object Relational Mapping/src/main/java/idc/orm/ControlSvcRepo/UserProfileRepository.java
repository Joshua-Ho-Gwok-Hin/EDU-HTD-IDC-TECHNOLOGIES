package idc.orm.ControlSvcRepo;

import idc.orm.OneToOne.Login;
import idc.orm.OneToOne.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{

    @Query("select u from UserProfile u where u.login.username = ?1 and u.login.password = ?2")
    Optional<UserProfile> findByLogin_UsernameAndLogin_Password(@NonNull String username, @NonNull String password);

    Optional<UserProfile> findByLogin_UsernameContainsAndLogin_PasswordIn(@NonNull String username, @NonNull Collection<String> passwords);

    @Transactional
    @Modifying
    @Query("update UserProfile u set u.firstName = ?1, u.lastName = ?2, u.login = ?3 where u.id = ?4")
    int updateFirstNameAndLastNameAndLoginById(@NonNull String firstName, @Nullable String lastName, @NonNull Login login, @NonNull Long id);
}

