package crame.randall.Controller;

import crame.randall.Entity.charactersheet.CharacterSheet;
import crame.randall.Service.CharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by AnruiSOUL on 6/5/2017.
 */

@RestController
@RequestMapping("/charactersheet")
public class CharacterSheetController {

    @Autowired
    private CharacterSheetService characterSheetService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<CharacterSheet> getAllCharacters(){
        return characterSheetService.getAllCharacters();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public CharacterSheet getStudentByName(@PathVariable("name") String name){
        return characterSheetService.getCharacterByName(name);
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
    public void deleteCharacterSheetByName(@PathVariable("name") String name){
        characterSheetService.removeCharacterByNameS(name);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateCharacterSheet(@RequestBody CharacterSheet characterSheet){
        characterSheetService.updateCharacterSheet(characterSheet);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCharacterSheet(@RequestBody CharacterSheet characterSheet){
        characterSheetService.insertCharacterSheet(characterSheet);
    }
}
