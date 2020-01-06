package com.yupaits.sample.yutool.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yupaits.sample.yutool.model.Person;
import com.yupaits.yutool.commons.exception.BusinessException;
import com.yupaits.yutool.commons.result.Result;
import com.yupaits.yutool.orm.base.BaseDto;
import com.yupaits.yutool.orm.base.BaseQuery;
import com.yupaits.yutool.orm.base.BaseVo;
import com.yupaits.yutool.orm.base.IBaseService;
import com.yupaits.yutool.orm.support.PageQuery;
import com.yupaits.yutool.orm.support.VoProps;

import java.util.Collection;
import java.util.List;

/**
 * 人类 Service
 * @author yupaits
 * @date 2019-07-30
 */
public interface PersonService extends IBaseService {

    /**
     * 获取分页数据
     * @param page 当前页码
     * @param size 每页数量
     * @param pageQuery 分页查询对象
     * @param <Vo> Vo类型
     * @return 分页数据
     */
    <Vo extends BaseVo, Q extends BaseQuery<Person>> Result<IPage<Vo>> resultPage(int page, int size, PageQuery<Q> pageQuery);

    /**
     * 根据QueryWrapper获取Vo对象列表
     * @param wrapper QueryWrapper对象
     * @param <Vo> Vo类型
     * @return Vo对象列表
     */
    <Vo extends BaseVo> Result<List<Vo>> resultList(Wrapper<Person> wrapper);

    /**
     * 根据ID获取Vo对象
     * @param id ID
     * @param <Vo> Vo类型
     * @return Vo对象
     * @throws BusinessException 抛出BusinessException
     */
    <Vo extends BaseVo> Result<Vo> resultById(Long id) throws BusinessException;

    /**
     * 根据QueryWrapper获取记录
     * @param queryWrapper queryWrapper查询对象
     * @param <Vo> Vo类型
     * @return Vo对象
     * @throws BusinessException 抛出BusinessException
     */
    <Vo extends BaseVo> Result<Vo> resultOne(Wrapper<Person> queryWrapper) throws BusinessException;

    /**
     * 保存Dto对象
     * @param dto Dto对象
     * @param <Dto> Dto类型
     * @return 保存结果
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto> Result resultSaveDto(Dto dto) throws BusinessException;

    /**
     * 保存Dto并返回保存的Vo对象
     * @param dto dto对象
     * @param <Dto> Dto类型
     * @param <Vo> Vo类型
     * @return 保存的Vo对象
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto, Vo extends BaseVo> Result<Vo> resultSaveDtoAndReturn(Dto dto) throws BusinessException;

    /**
     * 保存Dto并根据VoProps返回保存的Vo对象
     * @param dto dto对象
     * @param voProps VoProps对象
     * @param <Dto> Dto类型
     * @param <Vo> Vo类型
     * @return 保存的Vo对象
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto, Vo extends BaseVo> Result<Vo> resultSaveDtoAndReturn(Dto dto, VoProps voProps) throws BusinessException;

    /**
     * 批量保存Dto
     * @param dtos dto集合
     * @param <Dto> Dto类型
     * @return 批量保存结果
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto> Result resultSaveBatchDto(Collection<Dto> dtos) throws BusinessException;

    /**
     * 批量保存Dto并返回保存的Vo列表
     * @param dtos dto集合
     * @param <Dto> Dto类型
     * @param <Vo> Vo类型
     * @return 保存的Vo对象集合
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto, Vo extends BaseVo> Result<List<Vo>> resultSaveBatchDtoAndReturn(Collection<Dto> dtos) throws BusinessException;

    /**
     * 设置分批次保存记录数并批量保存Dto，同时返回保存的Vo列表
     * @param dtos dto集合
     * @param <Dto> Dto类型
     * @param <Vo> Vo类型
     * @return 保存的Vo对象集合
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto, Vo extends BaseVo> Result<List<Vo>> resultSaveBatchDtoAndReturn(Collection<Dto> dtos, VoProps voProps) throws BusinessException;

    /**
     * 根据QueryWrapper更新Dto
     * @param updateDto 更新dto对象
     * @param queryWrapper queryWrapper查询对象
     * @param <Dto> Dto类型
     * @return 保存的Vo对象
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto> Result resultUpdateDto(Dto updateDto, Wrapper<Person> queryWrapper) throws BusinessException;

    /**
     * 批量更新Dto
     * @param dtos 更新dto集合
     * @param queryWrapper queryWrapper查询对象
     * @param <Dto> Dto类型
     * @return 批量更新结果
     * @throws BusinessException 抛出BusinessException
     */
    <Dto extends BaseDto> Result resultUpdateBatchDto(Collection<Dto> dtos, Wrapper<Person> queryWrapper) throws BusinessException;

    /**
     * 根据ID删除
     * @param id ID
     * @return 删除结果
     */
    Result resultDeleteById(Long id);

    /**
     * 根据ID批量删除
     * @param ids ID集合
     * @return 批量删除结果
     */
    Result resultDeleteBatchByIds(Collection<Long> ids);

    /**
     * 根据QueryWrapper删除记录
     * @param queryWrapper queryWrapper查询对象
     * @return 删除结果
     */
    Result resultDelete(Wrapper<Person> queryWrapper);
}
