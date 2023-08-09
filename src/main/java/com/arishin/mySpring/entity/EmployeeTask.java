package com.arishin.mySpring.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="task")
class EmployeeTask {
    @Id
    @Column(name="id")
    public Integer id;

    @Column(name="name")
    public String description;

    @Column(name="deadline")
    public Date deadline;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="employee_task",
            joinColumns=  @JoinColumn(name="task_id", referencedColumnName="id"),
            inverseJoinColumns= @JoinColumn(name=" employee_id", referencedColumnName="id") )
    private Set<Employee> employees = new HashSet<Employee>();
}