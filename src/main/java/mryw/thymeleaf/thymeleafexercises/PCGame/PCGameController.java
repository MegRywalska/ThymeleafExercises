package mryw.thymeleaf.thymeleafexercises.PCGame;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/game")
public class PCGameController {

    private final PCGameService gameService;


    @GetMapping("/form-pc-game/{title}")
    public PCGameDTO findGameByTitle(@PathVariable String title){
        return gameService.findPCGameByTitle(title) ;
    }

    @PostMapping("/pc-games")
    @ResponseStatus(HttpStatus.CREATED)
    public void creatGame(){
    }
}
