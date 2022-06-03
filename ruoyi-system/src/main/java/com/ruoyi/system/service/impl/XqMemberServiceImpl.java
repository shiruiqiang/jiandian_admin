package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.XqMember;
import com.ruoyi.system.mapper.XqMemberMapper;
import com.ruoyi.system.service.IXqMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 会员Service业务层处理
 * 
 * @author shirq
 * @date 2022-06-02
 */
@Service
public class XqMemberServiceImpl implements IXqMemberService
{
    @Autowired
    private XqMemberMapper xqMemberMapper;

    /**
     * 查询会员
     * 
     * @param id 会员主键
     * @return 会员
     */
    @Override
    public XqMember selectXqMemberById(Long id)
    {
        return xqMemberMapper.selectXqMemberById(id);
    }

    /**
     * 查询会员列表
     * 
     * @param xqMember 会员
     * @return 会员
     */
    @Override
    public List<XqMember> selectXqMemberList(XqMember xqMember)
    {
        return xqMemberMapper.selectXqMemberList(xqMember);
    }

    /**
     * 新增会员
     * 
     * @param xqMember 会员
     * @return 结果
     */
    @Override
    public int insertXqMember(XqMember xqMember)
    {
        return xqMemberMapper.insertXqMember(xqMember);
    }

    /**
     * 修改会员
     * 
     * @param xqMember 会员
     * @return 结果
     */
    @Override
    public int updateXqMember(XqMember xqMember)
    {
        return xqMemberMapper.updateXqMember(xqMember);
    }

    /**
     * 批量删除会员
     * 
     * @param ids 需要删除的会员主键
     * @return 结果
     */
    @Override
    public int deleteXqMemberByIds(String ids)
    {
        return xqMemberMapper.deleteXqMemberByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除会员信息
     * 
     * @param id 会员主键
     * @return 结果
     */
    @Override
    public int deleteXqMemberById(Long id)
    {
        return xqMemberMapper.deleteXqMemberById(id);
    }
}
