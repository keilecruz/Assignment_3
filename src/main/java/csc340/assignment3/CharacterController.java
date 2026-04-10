package csc340.assignment3;


import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // ===== GET ALL (API) =====
    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    // ===== GET BY ID (API) =====
    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    // ===== CREATE (API ONLY - JSON) =====
    @PostMapping(consumes = "application/json")
    public Character createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }

    // ===== UPDATE (API ONLY - JSON) =====
    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable Long id,
                                      @RequestBody Character character) {
        return characterService.updateCharacter(id, character);
    }

    // ===== DELETE =====
    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
    }

    // ===== FILTER BY UNIVERSE =====
    @GetMapping("/category/{universe}")
    public List<Character> getCharactersByUniverse(@PathVariable String universe) {
        return characterService.getCharactersByUniverse(universe);
    }

    // ===== SEARCH =====
    @GetMapping("/search")
    public List<Character> searchCharacters(@RequestParam String name) {
        return characterService.searchCharactersByName(name);
    }
}