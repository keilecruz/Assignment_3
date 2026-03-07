package csc340.assignment3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    // Get characters by category (example: universe)
    List<Character> findByUniverse(String universe);

    // Search characters whose name contains a substring
    List<Character> findByNameContainingIgnoreCase(String name);

}