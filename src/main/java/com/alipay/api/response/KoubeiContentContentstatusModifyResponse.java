package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.contentstatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-15 10:30:02
 */
public class KoubeiContentContentstatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4199425844881716266L;

	/** 
	 * 口碑内容的唯一id
	 */
	@ApiListField("data")
	@ApiField("string")
	private List<String> data;

	/** 
	 * 全链路唯一id,由服务系统提供
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setData(List<String> data) {
		this.data = data;
	}
	public List<String> getData( ) {
		return this.data;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
