package cn.apply.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.apply.base.BaseAction;
import cn.apply.domain.RaceBaseInfo;


@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class RaceAction extends BaseAction<RaceBaseInfo> {
	
	/**
	 * 竞赛基本信息列表
	 * @return
	 * @throws Exception
	 */
	public String baseInfoList() throws Exception {
		return "baseInfoList";
	}
	
	/**
	 * 竞赛基本信息保存
	 * @return
	 * @throws Exception
	 */
	public String baseInfoSave() throws Exception {
		return "baseInfoSave";
	}
	
	/**
	 * 竞赛基本信息保存
	 * @return
	 * @throws Exception
	 */
	public String baseInfoDetail() throws Exception {
		return "baseInfoDetail";
	}
}
