package com.manager.impl;

import com.dao.TMapper;
import com.db.domin.po.TTable;
import com.manager.TTableManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTableManagerImpl implements TTableManager {

    @Autowired
    TMapper tMapper;

    @Override
    public List<TTable> getTList(TTable tTable) {
        return tMapper.getTList(tTable);

    }

    @Override
    public int addT(TTable tTable) {
        return tMapper.addT(tTable);
    }
}
