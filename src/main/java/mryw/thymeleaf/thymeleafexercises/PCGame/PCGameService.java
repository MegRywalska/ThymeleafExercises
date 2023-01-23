package mryw.thymeleaf.thymeleafexercises.PCGame;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PCGameService {

    private PCGameRepository repositoryGame;

    public PCGameDTO findPCGameByTitle(String title){
        return PCGameDTO.fromPCGame(repositoryGame.findPCGameByTitle(title));
    }

}
