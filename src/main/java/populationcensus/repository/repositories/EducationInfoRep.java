package populationcensus.repository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import populationcensus.repository.entity.EducationInfo;

@Repository
public interface EducationInfoRep extends JpaRepository<EducationInfo, Long> {
}