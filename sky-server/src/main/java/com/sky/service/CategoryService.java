package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.List;

public interface CategoryService {
    /**
     * 新增保存分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);

    /**
     * 分类的分页查询
     * @param categoryPageQueryDTO
     * @return
     */
    PageResult page(CategoryPageQueryDTO categoryPageQueryDTO);

    /**
     * 启动禁用状态
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 新增分类
     * @param categoryDTO
     */
    void update(CategoryDTO categoryDTO);

    /**
     * 根据id查询分类
     * @param id
     * @return
     */
    Category getById(Long id);

    /**
     * 根据id删除分类
     * @param id
     */
    void delete(Long id);

    /**
     * 按类型查询分类
     * @param type
     * @return
     */
    List<Category> getByType(Integer type);
}
