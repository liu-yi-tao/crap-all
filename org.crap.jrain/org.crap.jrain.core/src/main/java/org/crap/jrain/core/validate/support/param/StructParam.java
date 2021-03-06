package org.crap.jrain.core.validate.support.param;

import java.util.Map;

import org.crap.jrain.core.bean.result.Errcode;
import org.crap.jrain.core.validate.exception.ValidationException;
import org.crap.jrain.core.validate.support.Param;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class StructParam extends Param<JSONObject> {
	
	/** 多参数组合验证 */
	protected Param<?>[] params;
	
	protected Class<?> struct;
	
	public StructParam() {
		this.multi = false;
	}
	
	@Override
	protected Errcode validateValue(Object param) throws ValidationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean validateMin(Object param) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean validateMax(Object param) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected JSONObject cast0(Object param) {
		return null;
	}
	
	public static void main(String[] args) {
		JSONObject json = JSON.parseObject("{a:1,b:'crap',c:{}}");
		System.out.println(json.getJSONObject("c").isEmpty());
		System.out.println(JSON.parseObject(json.toJSONString(), String.class));
	}
}
