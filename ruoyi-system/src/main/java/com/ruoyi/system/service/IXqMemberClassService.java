package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.XqMemberClass;

import java.util.List;

/**
 * 会员等级 （套餐）Service接口
 * 
 * @author shirq
 * @date 2022-05-27
 */
public interface IXqMemberClassService 
{
    /**
     * 查询会员等级 （套餐）
     * 
     * @param id 会员等级 （套餐）主键
     * @return 会员等级 （套餐）
     */
    public XqMemberClass selectXqMemberClassById(Long id);

    /**
     * 查询会员等级 （套餐）列表
     * 
     * @param xqMemberClass 会员等级 （套餐）
     * @return 会员等级 （套餐）集合
     */
    public List<XqMemberClass> selectXqMemberClassList(XqMemberClass xqMemberClass);

    /**
     * 新增会员等级 （套餐）
     * 
     * @param xqMemberClass 会员等级 （套餐）
     * @return 结果
     */
    public int insertXqMemberClass(XqMemberClass xqMemberClass);

    /**
     * 修改会员等级 （套餐）
     * 
     * @param xqMemberClass 会员等级 （套餐）
     * @return 结果
     */
    public int updateXqMemberClass(XqMemberClass xqMemberClass);

    /**
     * 批量删除会员等级 （套餐）
     * 
     * @param ids 需要删除的会员等级 （套餐）主键集合
     * @return 结果
     */
    public int deleteXqMemberClassByIds(String ids);

    /**
     * 删除会员等级 （套餐）信息
     * 
     * @param id 会员等级 （套餐）主键
     * @return 结果
     */
    public int deleteXqMemberClassById(Long id);
}
