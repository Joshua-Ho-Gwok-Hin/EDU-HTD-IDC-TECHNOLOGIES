package pers.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<ProjectClass,Long> {

    List<ProjectClass> findProjectById(Long p);
}
