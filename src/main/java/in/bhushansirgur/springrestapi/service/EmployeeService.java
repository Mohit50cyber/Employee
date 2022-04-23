package in.bhushansirgur.springrestapi.service;

import in.bhushansirgur.springrestapi.model.Employee;
import in.bhushansirgur.springrestapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository eRepository;

    public Employee saveEmployee(Employee e){

        eRepository.save(e);
        return e;
    }
    public List<Employee> getAllEmployees(){

         return eRepository.findAll();
    }
    public List<Employee> getByName(String name){

        return eRepository.findByName(name);
    }

    public Employee getSingleEmployee(int id){
        Optional<Employee> employee = eRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }
        throw new RuntimeException("Employee is not found the id " + id);
    }
}
