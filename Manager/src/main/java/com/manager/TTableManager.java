package com.manager;



import com.db.domin.po.TTable;

import java.util.List;

public interface TTableManager {

    List<TTable> getTList(TTable tTable);

    int addT(TTable tTable);
}
