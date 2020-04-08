package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSpaceDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.space.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:07
 */
public class AlipayMarketingToolFengdieSpaceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4894182688453736457L;

	/** 
	 * 创建成功后返回空间的基本信息，包含空间 ID、标题、创建时间与可用域名列表
	 */
	@ApiField("data")
	private FengdieSpaceDetailModel data;

	public void setData(FengdieSpaceDetailModel data) {
		this.data = data;
	}
	public FengdieSpaceDetailModel getData( ) {
		return this.data;
	}

}
