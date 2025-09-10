package org.dharmik.usermanegmentapp.Services;

import org.dharmik.usermanegmentapp.Entity.UserEntry;
import org.dharmik.usermanegmentapp.Repositary.UserEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserEntryService {

    @Autowired
    private UserEntryRepo repo;

    public void saveEntry(UserEntry userEntry) {
        repo.save(userEntry);
    }

    public List<UserEntry> getAll() {
        return repo.findAll();
    }

    public Optional<UserEntry> getUserById(Integer id) {
        return repo.findById(id);
    }

    public UserEntry deleteEntry(Integer id) {
        UserEntry userToDelete = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        repo.delete(userToDelete);
        return userToDelete;
    }
}