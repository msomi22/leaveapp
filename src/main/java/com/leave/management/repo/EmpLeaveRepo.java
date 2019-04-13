/**
 * 
 */
package com.leave.management.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leave.management.entity.EmpLeave;

/**
 * @author t_pnjeru
 * 
 * This will be AUTO IMPLEMENTED by Spring into a Bean called EmpLeaveRepo
 * CRUD refers Create, Read, Update, Delete
 *
 */
@Repository
public interface EmpLeaveRepo extends CrudRepository<EmpLeave, Integer>{

	List<EmpLeave> findByEmpId(Integer empId);
}
