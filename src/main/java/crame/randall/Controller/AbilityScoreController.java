package crame.randall.Controller;

import crame.randall.Entity.CharacterScore.CharacterScores;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by randallcrame on 3/23/17.
 */
@RestController
@RequestMapping("api/vi/")
public class AbilityScoreController {

    @RequestMapping(value = "abilityscores", method = RequestMethod.POST)
    public CharacterScores create(@RequestBody CharacterScores characterScores){
        return characterScores;
    }
}
