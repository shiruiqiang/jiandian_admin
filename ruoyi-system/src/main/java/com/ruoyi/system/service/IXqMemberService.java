package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.entity.XqMember;

import java.util.List;

/**
 * 会员Service接口
 * 
 * @author shirq
 * @date 2022-06-02
 */
public interface IXqMemberService 
{
    /**
     * 查询会员
     * 
     * @param id 会员主键
     * @return 会员
     */
    public XqMember selectXqMemberById(Long id);

    /**
     * 查询会员列表
     * 
     * @param xqMember 会员
     * @return 会员集合
     */
    public List<XqMember> selectXqMemberList(XqMember xqMember);

    /**
     * 新增会员
     * 
     * @param xqMember 会员
     * @return 结果
     */
    public int insertXqMember(XqMember xqMember);

    /**
     * 修改会员
     * 
     * @param xqMember 会员
     * @return 结果
     */
    public int updateXqMember(XqMember xqMember);

    /**
     * 批量删除会员
     * 
     * @param ids 需要删除的会员主键集合
     * @return 结果
     */
    public int deleteXqMemberByIds(String ids);

    /**
     * 删除会员信息
     * 
     * @param id 会员主键
     * @return 结果
     */
    public int deleteXqMemberById(Long id);
}
