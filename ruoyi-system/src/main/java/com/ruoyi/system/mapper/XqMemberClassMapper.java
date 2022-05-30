package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.XqMemberClass;
import com.ruoyi.common.core.domain.entity.XqMemberClassDetails;

import java.util.List;

/**
 * 会员等级 （套餐）Mapper接口
 * 
 * @author shirq
 * @date 2022-05-27
 */
public interface XqMemberClassMapper 
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
     * 删除会员等级 （套餐）
     * 
     * @param id 会员等级 （套餐）主键
     * @return 结果
     */
    public int deleteXqMemberClassById(Long id);

    /**
     * 批量删除会员等级 （套餐）
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXqMemberClassByIds(String[] ids);

    /**
     * 批量删除会员等级详情
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXqMemberClassDetailsByMemberIds(String[] ids);
    
    /**
     * 批量新增会员等级详情
     * 
     * @param xqMemberClassDetailsList 会员等级详情列表
     * @return 结果
     */
    public int batchXqMemberClassDetails(List<XqMemberClassDetails> xqMemberClassDetailsList);

    /**
     * 批量删除会员等级详情 （套餐）  逻辑删除
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXqMemberClassDetailsByIds(String[] ids);

    /**
     * 通过会员等级 （套餐）主键删除会员等级详情信息
     * 
     * @param id 会员等级 （套餐）ID
     * @return 结果
     */
    public int deleteXqMemberClassDetailsByMemberId(Long id);

    /**
     * 修改会员等级详情
     *
     * @param xqMemberClassDetails 会员等级详情
     * @return 结果
     */
    public int updateXqMemberClassDetails(XqMemberClassDetails xqMemberClassDetails);

}
