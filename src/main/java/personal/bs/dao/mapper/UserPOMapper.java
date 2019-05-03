package personal.bs.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import personal.bs.domain.po.UserPO;
import personal.bs.domain.po.UserPOExample;

public interface UserPOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    long countByExample(UserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int deleteByExample(UserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into user (username, password, ",
        "nickname, phone, ",
        "email, created, ",
        "updated, status, ",
        "headPic, qq, account_balance, ",
        "sex, birthday, last_login_time)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{nickname,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{created,jdbcType=TIMESTAMP}, ",
        "#{updated,jdbcType=TIMESTAMP}, #{status,jdbcType=VARCHAR}, ",
        "#{headpic,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, #{accountBalance,jdbcType=INTEGER}, ",
        "#{sex,jdbcType=VARCHAR}, #{birthday,jdbcType=DATE}, #{lastLoginTime,jdbcType=TIMESTAMP})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(UserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int insertSelective(UserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    List<UserPO> selectByExample(UserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, username, password, nickname, phone, email, created, updated, status, headPic, ",
        "qq, account_balance, sex, birthday, last_login_time",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("personal.bs.dao.mapper.UserPOMapper.BaseResultMap")
    UserPO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserPO record, @Param("example") UserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserPO record, @Param("example") UserPOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated
     */
    @Update({
        "update user",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "nickname = #{nickname,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "updated = #{updated,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=VARCHAR},",
          "headPic = #{headpic,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "account_balance = #{accountBalance,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "birthday = #{birthday,jdbcType=DATE},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserPO record);
}