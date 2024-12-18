package com.cyh.projectmanagementsystemapplication.mapper;

import com.cyh.projectmanagementsystemapplication.data.entity.Prj;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author cyh
 * @since 2024/12/18
 */
@Mapper
public interface PrjMapper {
    List<Prj> selectAllPrj();

    Prj selectPrjById(Integer id);

}
