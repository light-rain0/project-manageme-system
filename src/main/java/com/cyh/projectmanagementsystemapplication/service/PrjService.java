package com.cyh.projectmanagementsystemapplication.service;

import com.cyh.projectmanagementsystemapplication.data.entity.Prj;

import java.util.List;

/**
 * @author cyh
 * @since 2024/12/18
 */
public interface PrjService {
    List<Prj> selectAllPrj();

    Prj selectPrjById(Integer id);
}
