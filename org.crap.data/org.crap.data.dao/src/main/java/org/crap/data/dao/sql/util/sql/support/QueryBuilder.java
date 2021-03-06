package org.crap.data.dao.sql.util.sql.support;

import org.crap.jrain.core.util.StringUtil;

/**
 * @since JDK 1.7
 * 
 * @author Crap
 * 
 * @version 1.4.3
 * 
 * 
 * 
 * @description SQL拼接类
 * 用于生成SQL语句
 */
public class QueryBuilder {
	
	private String sql;
	
	private String countSql;
	
	private Condition condition;
	
	private Profile profile;
	
	private Object[] sqlParams;
	
	public QueryBuilder(String sql) {
		this(sql, null, null, null);
	}
	
	public QueryBuilder(String sql, String countSql) {
		this(sql, countSql, null, null);
	}
	
	public QueryBuilder(String sql, Condition condition) {
		this(sql, null, condition);
	}
	
	public QueryBuilder(Class<?> cls, Profile profile) {
		this(cls, null, profile);
	}
	
	public QueryBuilder(String sql, Profile profile) {
		this(sql, null, null, profile);
	}
	
	public QueryBuilder(String sql, String countSql, Profile profile) {
		this(sql, countSql, null, new Profile());
	}
	
	public QueryBuilder(String sql, String countSql, Condition condition) {
		this(sql, countSql, condition, new Profile());
	}
	
	public QueryBuilder(String sql, Condition condition, Profile profile) {
		this(sql, null, condition, profile);
	}
	
	public QueryBuilder(String sql, String countSql, Condition condition, Profile profile) {
		this.sql = sql;
		this.countSql = countSql==null?sql.toLowerCase().replaceFirst("select.*?from", "select count(0) from") : countSql;
		this.condition = condition;
		this.profile = profile;
		if(this.condition!=null)
			this.sqlParams = this.condition.getValues();
	}
	
	public QueryBuilder(Class<?> cls, Condition condition, Profile profile) {
		this("select * from "+StringUtil.toHungarian(cls.getSimpleName()), null, condition, profile);
	}
	
	public String getSql() {
		String sqlTemp = this.sql;
		if(this.condition != null)
			sqlTemp += " " + this.condition.toSql();
		if(this.profile != null)
			sqlTemp += " " + this.profile.toSql();
		return sqlTemp;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getCountSql() {
		if(this.condition != null)
			this.countSql += " " + this.condition.toSql();
		return countSql;
	}

	public void setCountSql(String countSql) {
		this.countSql = countSql;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Object[] getSqlParams() {
		return sqlParams;
	}
	
	public void setSqlParams(Object[] sqlParams) {
		this.sqlParams = sqlParams;
	}
	
}
