package mryw.thymeleaf.thymeleafexercises.PCGame;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PCGameRepository extends JpaRepository<PCGame, Integer> {

    @Query("SELECT g FROM pc_game g WHERE g.title = :title")
    PCGame findPCGameByTitle(@Param("title") String title);
}
