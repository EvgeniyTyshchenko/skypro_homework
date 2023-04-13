package hw32.employeeDAO;

import course5.hw32.dao.employeeDAO.EmployeeDAO;
import course5.hw32.dao.employeeDAO.EmployeeDAOImpl;
import course5.hw32.model.City;
import course5.hw32.model.Employee;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.OptimisticLockException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeDAOImplTest {

    private final Integer ID = 13;
    private final Integer WRONG_ID = 5_000;
    private final EmployeeDAO employeeDAO = new EmployeeDAOImpl();
    private final Employee employee = new Employee(ID,"Юлия", "Никитина", "Ж", 43, new City(1, "Кемерово"));
    private final Employee wrongEmployee = new Employee(WRONG_ID,"Мария", "Демидова", "Ж", 48, new City(4, "Кисловодск"));

   @Test
   void shouldFindEmployeeById() {
       Assertions.assertEquals(employeeDAO.getEmployeeById(ID), employee);
   }

   @Test
    void shouldThrowExceptionWhenNotFoundEmployeeById() {
       Assertions.assertThrows(EntityNotFoundException.class, () -> employeeDAO.getEmployeeById(WRONG_ID));
   }

   @Test
    void checkThatTheEmployeeHasBeenAdded() {
       Employee employee2 = new Employee("Михаил", "Медведев", "М", 38, new City(14));
       employeeDAO.createEmployee(employee2);
       Integer id = employee2.getId();

       Assertions.assertNotNull(id);
       Assertions.assertEquals(employee2, employeeDAO.getEmployeeById(id));
   }

   @Test
   void theNumberOfEmployeesAddedMustMatchTheExpectedNumber() {
       Assertions.assertEquals(employeeDAO.getAllEmployees().size(), 7);
   }

   @Test
   void theUpdatedEmployeeShouldBeChanged() {
       employeeDAO.updateEmployee(new Employee(ID,"ЮЛИЯ", "Никитина", "Ж", 43, new City(1, "Кемерово")));
       Assertions.assertEquals(employeeDAO.getEmployeeById(ID).getFirstName(), "ЮЛИЯ");
   }

    @Test
    void shouldThrowExceptionWhenNotFoundEmployeeWhenTryToUpdate() {
       Assertions.assertThrows(OptimisticLockException.class, () -> employeeDAO.updateEmployee(wrongEmployee));
    }

    @Test
    void mustRemoveAnEmployeeFromTheDB() {
      Assertions.assertTrue(employeeDAO.deleteEmployee(employee));
    }

    @Test
    void shouldThrowExceptionWhenNotFoundEmployeeWhenTryToDelete() {
       Assertions.assertThrows(OptimisticLockException.class, () -> employeeDAO.deleteEmployee(wrongEmployee));
    }
}