package quizweb.domain.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import quizweb.domain.repository.entity.Choice;

@Mapper
public interface ChoiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int insert(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int insertSelective(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    Choice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int updateByPrimaryKeySelective(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int updateByPrimaryKeyWithBLOBs(Choice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table choice
     *
     * @mbg.generated Sun May 16 03:04:49 UTC 2021
     */
    int updateByPrimaryKey(Choice record);
}