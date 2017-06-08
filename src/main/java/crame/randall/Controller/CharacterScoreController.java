package crame.randall.Controller;

import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Service.CharacterScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * Created by AnruiSOUL on 6/7/2017.
 */

@RestController
public class CharacterScoreController {

    @Autowired
    private CharacterScoresService characterScoresService;

    @RequestMapping(value = "/characterscores", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createCharacterScores(@RequestBody CharacterScores characterScores){
        characterScoresService.createCharacterScores(characterScores);
    }
}
