package quizweb.repository.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import quizweb.domain.repository.entity.Quiz;
import quizweb.domain.repository.mapper.QuizMapper;
import quizweb.domain.servrice.constenum.Category;
import quizweb.domain.servrice.constenum.Order;
import quizweb.domain.servrice.valueobject.SearchCondition;

@SpringBootTest
public class QuizMapperTest {
    @Autowired
    QuizMapper quizMapper;

    @Test
    public void selectTestOrderNew() {

        SearchCondition searchCondition = new SearchCondition(Category.all, null, Order.newOrder);

        List<Quiz> quiz = quizMapper.fetchFirstPage(searchCondition, 15);

        String expectTitle = "進撃の巨人クイズ 中級";

        assertEquals(expectTitle, quiz.get(0).getTitle());
    }

    @Test
    public void selectTestOrderOld() {

        SearchCondition searchCondition = new SearchCondition(Category.all, null, Order.oldOrder);

        List<Quiz> quiz = quizMapper.fetchFirstPage(searchCondition, 15);

        String expectTitle = "進撃の巨人クイズ";

        assertEquals(expectTitle, quiz.get(0).getTitle());
    }

    @Test
    public void selectTestLimit() {

        SearchCondition searchCondition = new SearchCondition(Category.all, null, Order.oldOrder);

        List<Quiz> quiz = quizMapper.fetchFirstPage(searchCondition, 1);

        int expectSize = 1;

        assertEquals(expectSize, quiz.size());
    }

    
    @Test
    public void selectTestWhereCategory() {

        SearchCondition searchCondition = new SearchCondition(Category.study,null, Order.oldOrder);

        List<Quiz> quiz = quizMapper.fetchFirstPage(searchCondition, 1);

        int expectSize = 0;

        assertEquals(expectSize, quiz.size());
    }
    @Test
    public void selectTestWhereTitle() {

        SearchCondition searchCondition = new SearchCondition(Category.all,"進撃の巨人", Order.oldOrder);

        List<Quiz> quiz = quizMapper.fetchFirstPage(searchCondition, 15);

        String expectTitle = "進撃の巨人クイズ";

        assertEquals(expectTitle, quiz.get(0).getTitle());
    }

    @Test
    public void selectTestWhereTitle2() {

        SearchCondition searchCondition = new SearchCondition(Category.all,"中級", Order.oldOrder);

        List<Quiz> quiz = quizMapper.fetchFirstPage(searchCondition, 15);

        String expectTitle = "進撃の巨人クイズ 中級";

        assertEquals(expectTitle, quiz.get(0).getTitle());
    }
}
