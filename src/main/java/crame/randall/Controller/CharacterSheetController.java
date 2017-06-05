package crame.randall.Controller;

import crame.randall.Entity.charactersheet.CharacterSheet;
import crame.randall.Service.CharacterSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AnruiSOUL on 6/5/2017.
 */

@RestController
@RequestMapping("/charactersheet")
public class CharacterSheetController {

    @Autowired
    private CharacterSheetService characterSheetService;
}
