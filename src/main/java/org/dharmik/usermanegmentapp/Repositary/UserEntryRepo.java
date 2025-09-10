package org.dharmik.usermanegmentapp.Repositary;

import org.dharmik.usermanegmentapp.Entity.UserEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserEntryRepo extends JpaRepository<UserEntry, Integer> {


}
