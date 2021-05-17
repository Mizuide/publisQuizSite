package quizweb.presentation.request;

public class GetQuizRequest {
    public static class SearchCondition {

        private String title;
        private String category;
        private String order;

        public String getTitle() {
            return title;
        }

        public String getCategory() {
            return category;
        }

        public String getOrder() {
            return order;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setOrder(String order) {
            this.order = order;
        }
    }

    private SearchCondition searchConditions;

    private int fetchCount;

    public SearchCondition getSearchCondition() {
        return searchConditions;
    }

    public int getFetchCount() {
        return fetchCount;
    }

    public void setFetchCount(int fetchCount) {
        this.fetchCount = fetchCount;
    }

    public void setSearchConditions(SearchCondition searchConditions) {
        this.searchConditions = searchConditions;
    }
}
