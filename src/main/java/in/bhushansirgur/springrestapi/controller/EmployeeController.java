package in.bhushansirgur.springrestapi.controller;

import in.bhushansirgur.springrestapi.model.Employee;
import in.bhushansirgur.springrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService eService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {

        return eService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        return eService.getSingleEmployee(id);
    }

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam int id) {

        return "Deleting the details : " + id;
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee e) {
        return eService.saveEmployee(e);

    }

    @PutMapping("/employee/{id}")
    public Employee update(@PathVariable int id, @RequestBody Employee e) {
        return e;

    }

    @GetMapping("/employees/{name}")
    public List<Employee> getByName(@RequestParam String name) {
        return eService.getByName(name);
    }


}
