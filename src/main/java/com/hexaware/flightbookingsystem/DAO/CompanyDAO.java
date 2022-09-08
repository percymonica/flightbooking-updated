package com.hexaware.flightbookingsystem.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hexaware.flightbookingsystem.entity.Company;
import com.hexaware.flightbookingsystem.repository.CompanyRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Component
public class CompanyDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    public Company create(Company company) {
        return companyRepository.save(company);
    }

    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }

    public List<Company> findByName(String name) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Company> cq = cb.createQuery(Company.class);

        Root<Company> company = cq.from(Company.class);
        Predicate companyNamePredicate = cb.equal(company.get("company_name"), name);
        cq.where(companyNamePredicate);

        TypedQuery<Company> query = entityManager.createQuery(cq);
        return query.getResultList();
    }


}
