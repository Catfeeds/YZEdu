package com.fstech.yzedudbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fstech.yzedudbs.vo.Course;
import com.fstech.yzedudbs.vo.PlatformInformation;
import com.fstech.yzedudbs.vo.SchoolInformation;

public interface PlatformDao  extends BaseDao<PlatformInformation>{
	
	
	//��ѯƽ̨��Ѷ�б�
	public List<PlatformInformation> findPlatformInformations(@Param("page") Integer page,@Param("pageSize")Integer pageSize);
	
	//��ѯԺУ��Ѷ�б�
	public List<SchoolInformation> findSchoolInformationById(@Param("school_id")Integer school_id,@Param("page") Integer page,@Param("pageSize")Integer pageSize);
}
