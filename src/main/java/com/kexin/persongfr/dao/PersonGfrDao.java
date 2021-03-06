package com.kexin.persongfr.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kexin.persongfr.entity.PersonGfrEntity;

/**
 * 向mapper文件传参数
 * 
 * @author lenovo
 *
 */
@Repository("personGfrDao")
public class PersonGfrDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	/**
	 * 添加个人信息
	 * 
	 * @param id
	 *            ID
	 * @param sex
	 *            性别
	 * @param skin
	 *            肤色
	 * @param createinine
	 *            肌酐
	 * @param age
	 *            年龄
	 * @param gfrValue
	 *            gfr值
	 * @return
	 */
	public int addPersonGfr(String id, String phoneNumber, String sex, String skin, double createinine, int age,
			String gfrValue) {
		PersonGfrEntity entity = new PersonGfrEntity();
		entity.setId(id);
		entity.setSex(sex);
		entity.setSkin(skin);
		entity.setCreateinine(createinine);
		entity.setAge(age);
		entity.setGfrValue(gfrValue);
		entity.setPhoneNumber(phoneNumber);
		return sqlSessionTemplate.insert("com.kexin.persongfr.dao.PersonGfrDao.addPersonGfr", entity);
	}

	/**
	 * 查询数据库中的值
	 * 
	 * @return
	 */
	public List findGfr(String phoneNumber) {
		return sqlSessionTemplate.selectList("com.kexin.persongfr.dao.PersonGfrDao.findGfr", phoneNumber);
	}

	/**
	 * 删除GFR的值
	 * 
	 * @param id
	 * @return
	 */
	public int deletegfr(String id) {
		return sqlSessionTemplate.delete("com.kexin.persongfr.dao.PersonGfrDao.deletegfr", id);
	}
	
	/**
	 * 管理员查看GFR值
	 * @return
	 */
	public List managerFindGFR(){
		return sqlSessionTemplate.selectList("com.kexin.persongfr.dao.PersonGfrDao.managerFindGFR", null);
	}
}
