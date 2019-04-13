/**
 * 
 */
package com.leave.management.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leave.management.entity.Employee;

/**
 * @author t_pnjeru
 *
 */
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
