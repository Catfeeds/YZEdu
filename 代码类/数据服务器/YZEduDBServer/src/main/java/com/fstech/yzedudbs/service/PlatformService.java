package com.fstech.yzedudbs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fstech.yzedudbs.vo.PlatformInformation;
import com.fstech.yzedudbs.vo.SchoolInformation;

public interface PlatformService extends BaseService<PlatformInformation>{
	
		//��ѯƽ̨��Ѷ�б�
		public List<PlatformInformation> findPlatformInformations(@Param("page") Integer page,@Param("pageSize")Integer pageSize);
		//��ѯԺУ��Ѷ�б�
		public List<SchoolInformation> findSchoolInformationById(@Param("school_id")Integer school_id,@Param("page") Integer page,@Param("pageSize")Integer pageSize);
}
