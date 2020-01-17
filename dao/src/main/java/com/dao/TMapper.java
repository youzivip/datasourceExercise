package com.dao;

import com.db.domin.po.TTable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMapper {
    List<TTable> getTList(TTable tTable);

    int addT(TTable tTable);
}
