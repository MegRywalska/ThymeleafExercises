package mryw.thymeleaf.thymeleafexercises.PCGame;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PCGameDTO {

    private String title;
    private String producer;
    private String genre;
    private Integer minimumAge;
    private Boolean isAAA;

    public static PCGameDTO fromPCGame(PCGame pcGame){

        return PCGameDTO.builder()
                .title(pcGame.getTitle())
                .producer(pcGame.getProducer())
                .genre(pcGame.getGenre())
                .minimumAge(pcGame.getMinimumAge())
                .isAAA(pcGame.getIsAAA())
        .build();

    }

    public static PCGame fromPCGame(PCGameDTO pcGameDTO){

        return PCGame.builder()
                .title(pcGameDTO.getTitle())
                .producer(pcGameDTO.getProducer())
                .genre(pcGameDTO.getGenre())
                .minimumAge(pcGameDTO.getMinimumAge())
                .isAAA(pcGameDTO.getIsAAA())
                .build();

    }

}
