package org.crap.data.dao.sql.util.sql;

/**
 * @since JDK 1.7
 * 
 * @author Crap
 * 
 * @version 1.4.3
 * 
 * 
 * 
 * @description SQL拼接逻辑枚举
 */
public enum Logic {
	TRUE("1=1"),
	NULL(""),
	WHERE("WHERE"),
	HAVING("HAVING"),
	AND("AND"),
	OR("OR"),
	AND_NOT("AND NOT"),
	OR_NOT("OR NOT"),
	ORDER_BY("ORDER BY"),
	GROUP_BY("GROUP BY");
	
	public enum Sort {
		ASC("ASC"),
		DESC("DESC");
		
		private final String logic;
		
		private Sort(String logic) {
			this.logic = logic;
		}
		
		public String getLogic() {
			return logic;
		}
	}
	
	private final String logic;
	
	private Logic(String logic) {
		this.logic = logic;
	}

	public String getLogic() {
		return logic;
	}

}
