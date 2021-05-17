package quizweb.domain.servrice.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import quizweb.domain.repository.entity.Question;
import quizweb.domain.repository.entity.Quiz;
import quizweb.domain.repository.mapper.QuizMapper;
import quizweb.domain.servrice.GetQuizService;
import quizweb.domain.servrice.constenum.Category;
import quizweb.domain.servrice.constenum.Order;
import quizweb.domain.servrice.valueobject.SearchCondition;
import quizweb.presentation.request.GetQuizRequest;

@Service
public class GetQuizServiceImpl implements GetQuizService{
    final int fetchSize = 100;
    @Autowired
    public GetQuizServiceImpl(QuizMapper quizMapper){
        this.quizMapper = quizMapper;
    }
    
    QuizMapper quizMapper;

 
    @Override
    public Question getQuizDeteail(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    // @Override
    // public List<Quiz> getQuizList(int fetchSize, SearchCondition searchCondition) {
    //     return null;
    // }

    // @Override
    // public List<Quiz> getQuizList(int fetchSize, SearchCondition searchCondition, Quiz lastQuiz) {
    //     // TODO Auto-generated method stub
    //     return null;
    // }

    @Override
    public List<Quiz> getQuizList(GetQuizRequest request) {

        Category category = Category.valueOf(request.getSearchCondition().getCategory());
        String title = request.getSearchCondition().getTitle();
        Order order = Order.valueOf(request.getSearchCondition().getOrder());
        SearchCondition searchCondition = new SearchCondition(category, title, order);
        List<Quiz> quizList = quizMapper.fetchFirstPage(searchCondition, fetchSize);
        return quizList;
    }

    

} 