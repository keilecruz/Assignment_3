package csc340.assignment3;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui/characters") // UI-specific base path
public class CharacterUiController {

    private final CharacterService characterService;

    public CharacterUiController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // ======= UI: List page (STATIC INFO PAGE) =======
    @GetMapping
    public String getAllCharacters() {
        return "character-list";
    }

    // ======= UI: Details page (ALL CHARACTERS FROM DB) =======
   @GetMapping("/details")
    public String showDetailsPage(Model model) {
    model.addAttribute("characterList", characterService.getAllCharacters());
    return "character-details";
    }

    // ======= UI: About page =======
    @GetMapping("/about")
    public String about() {
        return "about";
    }

    // ======= UI: Create form =======
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("character", new Character());
        return "character-create";
    }

    // ======= UI: Create character =======
    @PostMapping("/create")
    public String createCharacter(Character character) {
        characterService.createCharacter(character);
        return "redirect:/ui/characters/details";
    }

    // ======= UI: Delete character =======
    @GetMapping("/delete/{id}")
    public String deleteCharacter(@PathVariable Long id) {
        characterService.deleteCharacter(id);
        return "redirect:/ui/characters/details";
    }

    // ======= UI: Update form =======
    @GetMapping("/updateForm/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        model.addAttribute("character", characterService.getCharacterById(id));
        return "character-update";
    }

    // ======= UI: Update character =======
    @PostMapping("/update")
    public String updateCharacter(Character character) {
        characterService.updateCharacter(character.getCharacterId(), character);
        return "redirect:/ui/characters/details";
    }

    // ======= UI: Single character view =======
    @GetMapping("/{id}")
    public String getCharacterById(@PathVariable Long id, Model model) {
        model.addAttribute("character", characterService.getCharacterById(id));
        return "character-details";
    }
}