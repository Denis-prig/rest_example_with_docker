package com.arishin.mySpring.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="emplo")
class Employee {
    @Id
    @Column(name="id")
    public Integer id;

    @Column(name="name")
    public String name;

    @Column(name="occupation")
    public String occupation;

    @Column(name="salary")
    public Integer salary;

    @Column(name="join_date")
    public Date join;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="employee_task",
            joinColumns=  @JoinColumn(name="employee_id", referencedColumnName="id"),
            inverseJoinColumns= @JoinColumn(name="task_id", referencedColumnName="id") )
    private Set<EmployeeTask> tasks = new HashSet<EmployeeTask>();
}
