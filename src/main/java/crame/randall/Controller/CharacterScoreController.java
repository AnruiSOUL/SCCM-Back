package crame.randall.Controller;

import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Service.CharacterScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by randallcrame on 3/23/17.
 */
@RestController
@RequestMapping("/characterscore")
public class CharacterScoreController {

    @Autowired
    private CharacterScoreService characterScoreService;

    @RequestMapping(method = RequestMethod.POST)
    public CharacterScores create(@RequestBody CharacterScores characterScores){
        return characterScores;
    }
}