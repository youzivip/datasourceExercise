package com.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        // 这个方法里可以用注解动态解析吗  如果是null 返回默认的数据源
        return  String.valueOf(DataSourceType.MASTER);
    }
}
