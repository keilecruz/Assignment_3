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

    // GET /characters
    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    // GET /characters/{id}
    @GetMapping("/{id}")
    public Character getCharacterById(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    // POST /characters
    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterService.createCharacter(character);
    }

    // PUT /characters/{id}
    @PutMapping("/{id}")
    public Character updateCharacter(@PathVariable Long id, @RequestBody Character character) {
        return characterService.updateCharacter(id, character);
    }

    // DELETE /characters/{id}
    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
    }

    // GET /characters/category/{category}
    @GetMapping("/category/{universe}")
    public List<Character> getCharactersByUniverse(@PathVariable String universe) {
        return characterService.getCharactersByUniverse(universe);
    }

    // GET /characters/search?name=substring
    @GetMapping("/search")
    public List<Character> searchCharacters(@RequestParam String name) {
        return characterService.searchCharactersByName(name);
    }
}