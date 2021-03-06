package org.crap.jrain.core.bean;

public enum DateFormat {
	/**
	 *format : yyyy
	 */
	Y("yyyy"),
	/**
	 *format : yyyyMM
	 */
	YM("yyyyMM"),
	/**
	 *format : yyyy-MM
	 */
	Y_M("yyyy-MM"),
	/**
	 *format : yyyyMMdd
	 */
	YMD("yyyyMMdd"),
	/**
	 *format : yyyy-MM-dd
	 */
	Y_M_D("yyyy-MM-dd"),
	/**
	 *format : yyyyMMddHHmmss
	 */
	YMDHMS("yyyyMMddHHmmss"),
	/**
	 *format : yyyy-MM-dd HH:mm:ss
	 */
	Y_M_D$H_M_S("yyyy-MM-dd HH:mm:ss"),
	/**
	 *format : HH:mm:ss
	 */
	H_M_S("HH:mm:ss"),
	/**
	 *format : yyyy-MM-dd HH:mm:ss.SSS
	 */
	Y_M_D$H_M_S_sss("yyyy-MM-dd HH:mm:ss.SSS"),
	/**
	 *format : yyyyMMddHHmmssSSS
	 */
	YMDHMSsss("yyyyMMddHHmmssSSS"),
	/**
	 *format : yyyyMMddHH:mm:ss
	 */
	YMDH_M_S("yyyyMMddHH:mm:ss");
	
	private final String format;
	
	private DateFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return this.format;
	};

}
