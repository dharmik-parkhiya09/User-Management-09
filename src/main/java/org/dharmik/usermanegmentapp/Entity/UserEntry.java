package org.dharmik.usermanegmentapp.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class UserEntry {

    @Id
    // FIX: Added @GeneratedValue to let the database automatically create a unique ID for each new user.
    // This is crucial for saving more than one user.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

    // FIX: Renamed from "Date" to "date" to follow standard Java camelCase naming conventions.
    private LocalDateTime date;
}