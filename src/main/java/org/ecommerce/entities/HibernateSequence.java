package org.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "hibernate_sequence")
public class HibernateSequence {

    @Column(name = "next_val")
    private Long nextVal;

    public void setNextVal(Long nextVal) {
        this.nextVal = nextVal;
    }

    public Long getNextVal() {
        return nextVal;
    }

    @Override
    public String toString() {
        return "HibernateSequence{" +
                "nextVal=" + nextVal + '\'' +
                '}';
    }
}
