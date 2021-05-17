package quizweb.domain.servrice;

import java.util.List;

import quizweb.domain.repository.entity.Question;
import quizweb.domain.repository.entity.Quiz;
import quizweb.presentation.request.GetQuizRequest;

public interface GetQuizService {
    // public List<Quiz> getQuizList(int fetchSize, SearchCondition searchCondition);

    // public List<Quiz> getQuizList(int fetchSize, SearchCondition searchCondition, Quiz lastQuiz);

    public Question getQuizDeteail(int id);

    public List<Quiz> getQuizList(GetQuizRequest request);

}
