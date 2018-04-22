/**
 * 
 */
package com.welab.financial.dao;

import com.welab.financial.entity.Account;

/**
 * @author Administrator
 *
 */
public interface AccountDao {

	Account selectByPrimaryKey(Long id);
}
