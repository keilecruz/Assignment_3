package csc340.assignment3;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    // Get all characters
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    // Create a new character
    public Character createCharacter(Character character) {
        return characterRepository.save(character);
    }

    // Get character by ID
    public Character getCharacterById(Long id) {
        return characterRepository.findById(id).orElse(null);
    }

    // Update character
    public Character updateCharacter(Long id, Character updatedCharacter) {
        return characterRepository.findById(id)
                .map(character -> {
                    character.setName(updatedCharacter.getName());
                    character.setDescription(updatedCharacter.getDescription());
                    character.setUniverse(updatedCharacter.getUniverse());
                    character.setSpecies(updatedCharacter.getSpecies());
                    character.setAge(updatedCharacter.getAge());
                    return characterRepository.save(character);
                })
                .orElse(null);
    }

    // Delete character
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }

    // Get characters by universe
    public List<Character> getCharactersByUniverse(String universe) {
        return characterRepository.findByUniverse(universe);
    }

    // Search characters by name
    public List<Character> searchCharactersByName(String name) {
        return characterRepository.findByNameContainingIgnoreCase(name);
    }
}