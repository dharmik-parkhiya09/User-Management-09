package org.dharmik.usermanegmentapp.Controller;

import org.dharmik.usermanegmentapp.Entity.UserEntry;
import org.dharmik.usermanegmentapp.Services.UserEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserEntryService userEntryService;

    @GetMapping
    public List<UserEntry> getAllUsers() {
        return userEntryService.getAll();
    }

    @PostMapping("/register")
    public UserEntry saveEntry(@RequestBody UserEntry user) {
        user.setDate(LocalDateTime.now());
        // FIX: Renamed method call to match service.
        userEntryService.saveEntry(user);
        return user;
    }

    // FIX: Changed path variable to {id} for consistency and type to Integer.
    @PutMapping("/{id}")
    public UserEntry updateEntry(@PathVariable Integer id, @RequestBody UserEntry updatedUser) {
        // FIX: Complete rewrite of the update logic to prevent crashes.
        // 1. Fetch the existing user from the database. Throws an exception if not found.
        UserEntry existingUser = userEntryService.getUserById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        // 2. Update fields only if the new data is not null or empty.
        if (updatedUser.getUsername() != null && !updatedUser.getUsername().isEmpty()) {
            existingUser.setUsername(updatedUser.getUsername());
        }
        if (updatedUser.getPassword() != null && !updatedUser.getPassword().isEmpty()) {
            existingUser.setPassword(updatedUser.getPassword());
        }

        // 3. Save the updated user object.
        userEntryService.saveEntry(existingUser);
        return existingUser;
    }

    // FIX: Changed path variable to {id} and type to Integer.
    @GetMapping("/{id}")
    public UserEntry getEntryById(@PathVariable Integer id) {
        return userEntryService.getUserById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    // FIX: Changed path variable to {id} and type to Integer.
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Integer id) {
        // FIX: The service now handles the logic. We just call it.
        // Returning a ResponseEntity gives a much cleaner response to the client.
        userEntryService.deleteEntry(id);
        return ResponseEntity.ok("User with id " + id + " was deleted successfully.");
    }
}