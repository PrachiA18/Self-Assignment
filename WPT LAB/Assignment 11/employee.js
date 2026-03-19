const fs = require('fs');

class Employee {
  constructor(id, name, salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  getData() {
    return `${this.id} ${this.name} ${this.salary}\n`;
  }
}


const emp = new Employee(101, "Aishwarya", 50000);


fs.appendFile('Employee.txt', emp.getData(), (err) => {
  if (err) {
    console.log("Error writing to file");
  } else {
    console.log("Employee data appended successfully");
  }
});

