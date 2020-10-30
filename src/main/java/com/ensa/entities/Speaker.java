package com.ensa.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Component
@Entity
public class Speaker {
    @Id
    private String mail;
    @ManyToMany
    private List<Contribution> contribution;
    public Speaker() {

    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public List<Contribution> getContribution() {
        return contribution;
    }
    public void setContribution(List<Contribution> contribution) {
        this.contribution = contribution;
    }

}
