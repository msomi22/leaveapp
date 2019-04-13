# simple leave application based on spring boot and mysql
# Database setup
*mysql -h localhost -u root -p 
* password is root
*create database leavedb;
# NOTE
* spring.jpa.hibernate.ddl-auto=create
* after first run, change the above to none or update.

# API Operation
* Create a new employee
* localhost:8080/leave/addEmp?name=Peter Mwenda&email=mwendapeter72@gmail.com&mobile=254718953974&address=51 60400&dob=22-05-1992
*
*View all employees
* localhost:8080/leave/allEmp
*
*
*Schedule leave 
* localhost:8080/leave/scheduleLeave?emp_id=1&leave_reason=Attend to personal issues&start_on=31-05-2019&end_on=31-06-2019&balance_days=22
*
*View Leave shedule - by leave id
*
* localhost:8080/leave/getLeaveById?id=1 
* 
* or - by employee id
*
* localhost:8080/leave/getLeaveByEmp?empId=1
