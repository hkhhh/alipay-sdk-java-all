package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.order.upload response.
 * 
 * @author auto create
 * @since 1.0, 2018-05-13 11:25:00
 */
public class KoubeiCateringPosOrderUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1532318437127576981L;

	/** 
	 * 生成序列号标记每次上传
	 */
	@ApiField("flow_id")
	private String flowId;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

}