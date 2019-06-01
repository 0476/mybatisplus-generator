package com.ailikes.dao;

import com.ailikes.model.DbConfig;
import com.ailikes.model.TableInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeDao {
	
	public void saveComment(TableInfo tableInfo, DbConfig dbConfig);
	
	public List<TableInfo> getAllTables(DbConfig dbConfig);
	
	public TableInfo getAllColumns(String tableName, DbConfig dbConfig);

	public String testConnection(DbConfig dbConfig);

}
