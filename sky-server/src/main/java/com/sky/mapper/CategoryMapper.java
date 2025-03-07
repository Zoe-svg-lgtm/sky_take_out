package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Insert("insert into category (type, name, sort, status, create_time, update_time, create_user, update_user) " +
            "VALUES" +
            "(#{type},#{name},#{sort},#{status},#{createTime},#{updateTime},#{createUser},#{updateUser}) ")
    void updataCategory(Category category);

    Page<Category> page(CategoryPageQueryDTO categoryPageQueryDTO);

    void update(Category category);
    @Select("select * from category where id = #{id}")
    Category getById(Long id);

    @Delete("delete from category where id = #{id}")
    void delete(Long id);

    List<Category> getByTpye(Integer type);
}
