package com.kexin.personmessage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kexin.personmessage.dao.PersonMessageDao;

/**
 * service层调用dao层方法
 * 
 * @author lenovo
 *
 */
@Service("personMessageService")
public class PersonMessageService {

	@Autowired
	private PersonMessageDao personMessageDao;

	/**
	 * 调用dao层的方法
	 * 
	 * @param bmiValue
	 *            BMI值
	 * @param personWeight
	 *            体重
	 * @param personHeight
	 *            身高
	 * @return
	 */
	public int addPersonMessage(String bmiValue, int personWeight, int personHeight, String phoneNumber, String time,
			String id) throws Exception {
		return personMessageDao.addPersonMessage(bmiValue, personWeight, personHeight, phoneNumber, time, id);
	}

	/**
	 * 查询个人信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public List findPersonMessage(String phoneNumber) throws Exception {
		return personMessageDao.findPersonMessage(phoneNumber);
	}

	/**
	 * 根据ID删除信息
	 * 
	 * @param personID
	 *            个人ID
	 * @return
	 * @throws Exception
	 */
	public int deletePersonMessage(String id) throws Exception {
		return personMessageDao.deletePersonMessage(id);
	}
	
	/**
	 * 管理员查看用户的所有信息
	 * @return
	 * @throws Exception
	 */
	public List managerFindBmi() throws Exception {
		return personMessageDao.managerFindBmi();
	}
}
