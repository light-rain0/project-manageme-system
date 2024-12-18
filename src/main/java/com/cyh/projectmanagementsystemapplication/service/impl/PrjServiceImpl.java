package com.cyh.projectmanagementsystemapplication.service.impl;

import com.cyh.projectmanagementsystemapplication.data.entity.Prj;
import com.cyh.projectmanagementsystemapplication.mapper.PrjMapper;
import com.cyh.projectmanagementsystemapplication.service.PrjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cyh
 * @since 2024/12/18
 */
@Service
public class PrjServiceImpl implements PrjService {
    //    @Accessors
    @Autowired
    private PrjMapper prjMapper;

    @Override
    public List<Prj> selectAllPrj() {
        return prjMapper.selectAllPrj();
    }

    @Override
    public Prj selectPrjById(Integer id) {
        return prjMapper.selectPrjById(id);
    }
}
