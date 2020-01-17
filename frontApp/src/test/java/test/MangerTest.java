package test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dao.TMapper;
import com.db.domin.po.TTable;
import com.manager.TTableManager;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MangerTest extends BaseTest {

    @Autowired
    TTableManager tTableManager;

    @Autowired
    TMapper tMapper;

    @Test
    public void test(){
        TTable t = new TTable();
        t.setId(12);
        t.setT(12);
        int i = tTableManager.addT(t);
        System.out.println("add result-->"+i);
    }

    @Test
    public void testGet(){
        TTable t = new TTable();
  //      t.setId(1);

        List<TTable> list = tTableManager.getTList(t);
//        List<TTable> list = tMapper.getTList(t);
        System.out.println("get result-->"+ JSONArray.toJSONString(list));
    }

}
