/**
 * 
 */
package com.welab.financial.dao;

import org.springframework.stereotype.Repository;

import com.welab.financial.entity.Account;

/**
 * @author Administrator
 *
 */
@Repository
public interface AccountDao {

	Account selectByPrimaryKey(Long id);
	int insert(Account account);
	int deleteByPrimaryKey(Long id);
	int updateByPrimaryKeySelective(Account account);
}
